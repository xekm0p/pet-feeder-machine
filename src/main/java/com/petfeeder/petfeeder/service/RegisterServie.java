package com.petfeeder.petfeeder.service;

import com.petfeeder.petfeeder.domain.User;
import com.petfeeder.petfeeder.repositoy.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.xml.bind.ValidationException;

@Service
public class RegisterServie {

    private UserRepository userRepository;

    private PasswordEncoder passwordEncoder;

    public RegisterServie(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User register(User user) throws ValidationException {
        if (userRepository.findByUsername(user.getUsername()).isPresent()) {
            throw new ValidationException("Username already exist.");
        }

        String password = passwordEncoder.encode(user.getPassword());

        user.setPassword(password);
        userRepository.save(user);

        return user;
    }
}
