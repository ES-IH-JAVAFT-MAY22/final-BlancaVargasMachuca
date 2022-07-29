package com.ironhack.edgeservice.controller.dto;

import lombok.Data;

import java.util.Set;

@Data
public class UserDTO {
    private Long id;
    private String password;
    private String username;
    private String name;
    private String email;
    private int telephoneNumber;
    private String address;
    private Set<RoleDTO> roles;
}
