package com.neighborhoodclub.api.web;

import com.neighborhoodclub.api.domain.users.User;
import com.neighborhoodclub.api.domain.users.UserRepository;
import com.neighborhoodclub.api.exception.ResourceNotFoundException;
import com.neighborhoodclub.api.security.UserPrincipal;
import com.neighborhoodclub.api.security.oauth2.CurrentUser;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("/user/me")
    public User getCurrentUser(@CurrentUser UserPrincipal userPrincipal) {
        return userRepository.findById(userPrincipal.getId())
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userPrincipal.getId()));
    }
}
