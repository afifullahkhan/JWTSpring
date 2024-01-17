package com.example.jwtapi.entities;

import lombok.*;

@Data
@Builder
@ToString
public class JwtResponse {
    private String jwtToken;
    private String username;
}
