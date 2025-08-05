package com.eng.bookmyshow;

import com.eng.bookmyshow.controller.UserController;
import com.eng.bookmyshow.dto.ResponseStatus;
import com.eng.bookmyshow.dto.SignUpRequestDTO;
import com.eng.bookmyshow.dto.SignUpResponseDTO;
import com.eng.bookmyshow.model.BaseModel;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookmyshowApplication implements CommandLineRunner {

	@Autowired
	private UserController userController;

	public static void main(String[] args) {

		SpringApplication.run(BookmyshowApplication.class, args);

	}


	@Override
	public void run(String... args) throws Exception {
		SignUpRequestDTO signUpRequestDTO = new SignUpRequestDTO();
		signUpRequestDTO.setUsername("JohnDoe");
		signUpRequestDTO.setEmail("nketu@gamil.com");
		signUpRequestDTO.setPassword("password123");

		SignUpResponseDTO signUpResponseDTO = userController.SingUp(signUpRequestDTO);
		if(signUpResponseDTO.getStatus() == ResponseStatus.SUCCESS){
			System.out.println("User registered successfully with ID: " + signUpResponseDTO.getUserId());
			System.out.println("Message: " + signUpResponseDTO.getMessage());

		} else {
			System.out.println("User registration failed: " + signUpResponseDTO.getMessage());
		}
	}
}
