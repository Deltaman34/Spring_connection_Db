package com.example.Lucrare.Repository;

import com.example.Lucrare.User_email;
import com.example.Lucrare.personal_data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserEmailRepository extends JpaRepository<User_email, Long> {}
