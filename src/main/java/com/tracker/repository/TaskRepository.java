package com.tracker.repository;

import com.tracker.model.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

public interface TaskRepository extends JpaRepository<Tasks ,String> {
    List<Tasks> findByUserId(String userId);
    List<Tasks> findByUserIdAndStatus(String userId, String status);
}
