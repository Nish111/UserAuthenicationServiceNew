package org.example.userauthenticationservice.mappers;

import org.example.userauthenticationservice.dtos.UserDto;
import org.example.userauthenticationservice.models.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper extends EntityMapper<UserDto, User> {
}