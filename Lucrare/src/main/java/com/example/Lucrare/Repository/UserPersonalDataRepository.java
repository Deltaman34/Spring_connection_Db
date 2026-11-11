package com.example.Lucrare.Repository;

import com.example.Lucrare.personal_data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPersonalDataRepository extends JpaRepository<personal_data, Long> {}