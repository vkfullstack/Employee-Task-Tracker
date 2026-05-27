package com.tracker.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private  String id;
    private  String  name;
    @Column(unique = true)
    private String email;
    private  String password;
    @Enumerated(EnumType.STRING)
    private  UserRole role= UserRole.USER;
    @OneToMany(mappedBy = "user" ,cascade = CascadeType.ALL,orphanRemoval = true)
    @JsonIgnore
    private List<Tasks> tasks;


}
