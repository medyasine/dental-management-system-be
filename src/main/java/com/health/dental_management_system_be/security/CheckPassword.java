package com.health.dental_management_system_be.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class CheckPassword {
    public static void main(String[] args) {
        var encoder = new BCryptPasswordEncoder();

        String raw = "AdminPassword123!";
        String hash = "$2a$10$FRDGy.29QQD1SbYxmsSOBOMxlyFpFpOJPfaSeQcHSm424foTY2zFK";

        System.out.println(encoder.matches(raw, hash));
    }
}