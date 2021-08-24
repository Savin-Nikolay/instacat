package com.example.demo.payload.request;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class LoginRequest {

    @NotEmpty(message = "Username cannon be empty")
    private String username;
    @NotEmpty(message = "Password cannon be empty")
    private String password;

}
