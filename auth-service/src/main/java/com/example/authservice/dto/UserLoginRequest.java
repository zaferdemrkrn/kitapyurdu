package com.example.authservice.dto;

import com.example.authservice.entity.User;
import lombok.Data;

@Data
public class UserLoginRequest {
    private String userName;
    private String password;

}
