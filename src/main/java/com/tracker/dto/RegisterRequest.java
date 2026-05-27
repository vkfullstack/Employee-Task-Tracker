package com.tracker.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {
    private  String  name;
    @NotBlank(message = "email is required")
    @Email(message = "invalid email")
    private String email;
    @NotBlank(message = "password is required")
    private  String password;
    private String role;
}
