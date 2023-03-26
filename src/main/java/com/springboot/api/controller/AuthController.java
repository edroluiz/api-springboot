package com.springboot.api.controller;

import com.springboot.api.dto.Login;
import com.springboot.api.entity.User;
import com.springboot.api.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;

    @PostMapping("/login")
    public String Login(@RequestBody Login login) {
        UsernamePasswordAuthenticationToken UsernamePasswordAuthenticationToken =
                new UsernamePasswordAuthenticationToken(login.email(),
                        login.password());

        Authentication authenticate = this.authenticationManager
                .authenticate(UsernamePasswordAuthenticationToken);

        var user = (User) authenticate.getPrincipal();

        return tokenService.generateToken(user);
    }
}
