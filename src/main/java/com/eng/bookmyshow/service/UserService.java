package com.eng.bookmyshow.service;

import com.eng.bookmyshow.model.User;
import com.eng.bookmyshow.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User singUp(String email, String password, String username) {

        Optional<User> byEmail = userRepository.findByEmail(email);
        if (byEmail.isPresent()) {
            throw new RuntimeException("User already exists with email: " + email);
        }
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        user.setUsername(username);
        user.setBooking(new ArrayList<>());
        return userRepository.save(user);

    }
}
