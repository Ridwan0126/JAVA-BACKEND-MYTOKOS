package com.module.user.payload;

import lombok.Data;

@Data
public class AuthResponse {
    String username;
    String email;
    String password;
    String token;
}
