package com.example.Lucrare;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user_credentials")
@Getter
@Setter
public class User_credentials {

    @Id
    private Long userId;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;

    private String username;

    private String passwordHash;
}