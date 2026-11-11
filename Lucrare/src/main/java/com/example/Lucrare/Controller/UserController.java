package com.example.Lucrare.Controller;

import com.example.Lucrare.Dto.CreateUserRequest;
import com.example.Lucrare.Dto.UserResponse;
import com.example.Lucrare.Dto.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public void createUser(@RequestBody CreateUserRequest request) {
        userService.createUser(request);
    }
    @GetMapping("/get_all")
    public List<UserResponse> getAllUsers() {
        return userService.getAllUsers();
    }

}