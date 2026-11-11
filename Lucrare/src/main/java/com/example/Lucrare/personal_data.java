package com.example.Lucrare;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Entity
@Table(name = "user_personal_data")
@Getter
@Setter
public class personal_data {

    @Id
    private Long userId;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;

    private String firstName;

    private String lastName;

    private LocalDate birthDate;
}