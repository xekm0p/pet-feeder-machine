package com.petfeeder.petfeeder.rest;

import com.petfeeder.petfeeder.domain.User;
import com.petfeeder.petfeeder.service.RegisterServie;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.ValidationException;

@RestController
@RequestMapping("/register")
public class RegisterController {

    RegisterServie registerServie;

    public RegisterController(RegisterServie registerServie) {
        this.registerServie = registerServie;
    }

    @PostMapping
    public User createMeal(@RequestBody User user) throws ValidationException {
        return registerServie.register(user);
    }
}
