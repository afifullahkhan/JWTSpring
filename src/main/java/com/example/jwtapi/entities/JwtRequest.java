package com.example.jwtapi.entities;

import lombok.*;

@Data
@Builder
public class JwtRequest {
    private String email;
    private String password;
}
