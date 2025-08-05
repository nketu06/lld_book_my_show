package com.eng.bookmyshow.dto;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class SignUpResponseDTO {
    private Long UserId;
    private ResponseStatus status;
    private String message;
}
