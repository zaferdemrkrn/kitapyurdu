package com.example.authservice.response;

import com.example.authservice.entity.User;

import java.io.Serializable;

public class UserLoginResponse extends BaseResponse implements Serializable {
    public String userName;
    public String password;

    public UserLoginResponse (User toEntity){
        this.userName=toEntity.getUserName();
        this.password=toEntity.getPassword();

    }
}
