package com.tracker.controller;

import com.tracker.dto.*;
import com.tracker.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
@RequiredArgsConstructor
public class TasksContoller {

    private final TaskService service;

    @PostMapping
    public TaskResponse create(@RequestBody TaskRequest r) {
        return service.createTask(r);
    }

    @GetMapping
    public List<TaskResponse> getAll() {
        return service.getAll();
    }

    @PutMapping("/{id}")
    public TaskResponse update(@PathVariable String id, @RequestBody TaskRequest r) {
        return service.update(id, r);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable String id) {
        service.delete(id);
        return "Deleted";
    }
    @GetMapping("/status/{status}")
    public List<TaskResponse> getByStatus(@PathVariable String status) {
        return service.getByStatus(status);
    }
    @GetMapping("/paginated")
    public List<TaskResponse> getPaginated(
            @RequestParam int page,
            @RequestParam int size
    ) {
        return service.getPaginatedTasks(page, size);
    }
}