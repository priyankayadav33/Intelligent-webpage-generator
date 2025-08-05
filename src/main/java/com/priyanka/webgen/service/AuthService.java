package com.priyanka.webgen.service;

import com.priyanka.webgen.dto.LoginRequest;
import com.priyanka.webgen.dto.SignupRequest;

public interface AuthService {
    String authenticateUser(LoginRequest loginRequest);  // ⬅️ changed from JwtResponse to String
    void registerUser(SignupRequest signupRequest);
}
