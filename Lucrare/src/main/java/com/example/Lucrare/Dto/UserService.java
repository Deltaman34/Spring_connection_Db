package com.example.Lucrare.Dto;

import com.example.Lucrare.Dto.CreateUserRequest;
import com.example.Lucrare.Repository.CredentialReposirtory;
import com.example.Lucrare.Repository.UserPersonalDataRepository;
import com.example.Lucrare.Repository.UserRepository;
import com.example.Lucrare.User;
import com.example.Lucrare.User_credentials;
import com.example.Lucrare.personal_data;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final CredentialReposirtory credentialsRepository;
    private final UserPersonalDataRepository personalDataRepository;

    public UserService(
            UserRepository userRepository,
            CredentialReposirtory credentialsRepository,
            UserPersonalDataRepository personalDataRepository) {
        this.userRepository = userRepository;
        this.credentialsRepository = credentialsRepository;
        this.personalDataRepository = personalDataRepository;
    }

    @Transactional
    public void createUser(CreateUserRequest request) {
        User user = userRepository.save(new User());

        User_credentials credentials = new User_credentials();
        credentials.setUser(user);
        credentials.setUsername(request.getUsername());
        credentials.setPasswordHash(request.getPassword());
        credentialsRepository.save(credentials);

        personal_data personalData = new personal_data();
        personalData.setUser(user);
        personalData.setFirstName(request.getFirstName());
        personalData.setLastName(request.getLastName());
        personalData.setBirthDate(request.getBirthDate());
        personalDataRepository.save(personalData);
    }
    public List<UserResponse> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream().map(user -> {
            personal_data personal = personalDataRepository.findById(user.getId()).orElse(null);

            User_credentials credentials = credentialsRepository.findById(user.getId()).orElse(null);
            UserResponse response = new UserResponse();
            response.setId(user.getId());
            if (personal != null) {
                response.setFirstName(personal.getFirstName());
                response.setLastName(personal.getLastName());
            }
            if (credentials != null) {
                response.setUsername(credentials.getUsername());
            }
            return response;
        }).toList();
    }

}