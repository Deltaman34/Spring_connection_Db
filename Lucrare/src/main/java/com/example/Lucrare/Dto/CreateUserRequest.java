package com.example.Lucrare.Dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CreateUserRequest {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    private String username;
    private String password;

}
