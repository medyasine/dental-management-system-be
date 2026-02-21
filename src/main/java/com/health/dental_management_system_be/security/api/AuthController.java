package com.health.dental_management_system_be.security.api;

import com.health.dental_management_system_be.security.jwt.JwtService;
import com.health.dental_management_system_be.security.repo.UserRepository;
import org.springframework.security.authentication.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthenticationManager authManager;
    private final JwtService jwtService;
    private final UserRepository users;

    public AuthController(AuthenticationManager authManager, JwtService jwtService, UserRepository users) {
        this.authManager = authManager;
        this.jwtService = jwtService;
        this.users = users;
    }

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest req) {
        var auth = authManager.authenticate(
                new UsernamePasswordAuthenticationToken(req.username(), req.password())
        );

        String username = auth.getName();
        Set<String> roles = auth.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.toSet());

        String token = jwtService.generateAccessToken(username, roles);
        return new LoginResponse(token);
    }
}