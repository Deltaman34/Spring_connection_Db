package com.example.Lucrare;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "user")
    private User_credentials credentials;

    @OneToOne(mappedBy = "user")
    private personal_data personalData;

    @OneToOne(mappedBy = "user")
    private User_status status;
}