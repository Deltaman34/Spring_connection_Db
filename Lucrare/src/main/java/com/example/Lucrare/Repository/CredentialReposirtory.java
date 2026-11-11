package com.example.Lucrare.Repository;

import com.example.Lucrare.User_credentials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CredentialReposirtory extends JpaRepository<User_credentials, Long> {

    Optional<User_credentials> findByUsername(String username);
}