package com.tracker.service;

import com.tracker.dto.*;
import com.tracker.model.*;
import com.tracker.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;
    private final UserRepository userRepository;

    private Users getUser() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return userRepository.findByEmail(auth.getName())
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    // CREATE
    public TaskResponse createTask(TaskRequest request) {

        Users user = getUser();

        Tasks task = taskRepository.save(Tasks.builder()
                .title(request.getTitle())
                .description(request.getDescription())
                .status(request.getStatus())
                .createad(request.getCreatead())
                .user(user)
                .build());

        return map(task);
    }

    // GET ALL
    public List<TaskResponse> getAll() {
        return taskRepository.findByUserId(getUser().getId())
                .stream().map(this::map).toList();
    }

    // UPDATE
    public TaskResponse update(String id, TaskRequest req) {

        Tasks task = taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found"));

        task.setTitle(req.getTitle());
        task.setDescription(req.getDescription());
        task.setStatus(req.getStatus());
        task.setCreatead(req.getCreatead());

        return map(taskRepository.save(task));
    }

    // DELETE
    public void delete(String id) {
        taskRepository.deleteById(id);
    }

    private TaskResponse map(Tasks t) {
        return new TaskResponse(
                t.getId(),
                t.getTitle(),
                t.getDescription(),
                t.getStatus(),
                t.getCreatead(),
                t.getUser().getEmail()
        );

    }
    public List<TaskResponse> getByStatus(String status) {
        return taskRepository
                .findByUserIdAndStatus(getUser().getId(), status)
                .stream()
                .map(this::map)
                .toList();
    }


    public List<TaskResponse> getPaginatedTasks(int page, int size) {

        Pageable pageable = PageRequest.of(page, size);

        Page<Tasks> taskPage = taskRepository.findAll(pageable);

        return taskPage
                .stream()
                .map(this::map)
                .toList();
    }
}