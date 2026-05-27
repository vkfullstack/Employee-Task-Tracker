package com.tracker.model;

import com.tracker.dto.TaskResponse;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Tasks  {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private  String id;
    private  String title;
    private  String description;
    private  String status;
    private String createad;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private  Users user;
}
