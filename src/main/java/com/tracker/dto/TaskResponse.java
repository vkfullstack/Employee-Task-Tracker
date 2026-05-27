package com.tracker.dto;

import com.tracker.model.Users;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskResponse {
    private  String id;
    private  String title;
    private  String description;
    private  String status;
    private String createad;
   private  String user;

}
