package org.example.userauthenticationservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LogoutRequestDto {
    private String email;
}