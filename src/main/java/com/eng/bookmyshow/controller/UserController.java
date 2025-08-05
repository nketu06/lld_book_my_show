package com.eng.bookmyshow.controller;

import com.eng.bookmyshow.dto.ResponseStatus;
import com.eng.bookmyshow.dto.SignUpRequestDTO;
import com.eng.bookmyshow.dto.SignUpResponseDTO;
import com.eng.bookmyshow.model.User;
import com.eng.bookmyshow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    public SignUpResponseDTO SingUp( SignUpRequestDTO signUpRequestDTO) {
        SignUpResponseDTO response = new SignUpResponseDTO();
        try{
            // Here you would typically call a service to handle the business logic
            User user = userService.singUp(signUpRequestDTO.getEmail(), signUpRequestDTO.getPassword(), signUpRequestDTO.getUsername());

            response.setMessage("User registered successfully");
            response.setStatus(ResponseStatus.SUCCESS);
            response.setUserId(user.getId());
        } catch (Exception e) {
            response.setMessage("User registration failed: " + e.getMessage());
            response.setStatus(ResponseStatus.ERROR);
        }
        return response;
    }
}
