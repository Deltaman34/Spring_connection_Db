package com.example.Lucrare.Repository;

import com.example.Lucrare.User_role;
import com.example.Lucrare.User_role_id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepository extends JpaRepository<User_role , User_role_id> {}
