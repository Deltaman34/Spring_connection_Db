package com.example.Lucrare.Repository;

import com.example.Lucrare.User_status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserStatusRepository extends JpaRepository<User_status, Long> {}

