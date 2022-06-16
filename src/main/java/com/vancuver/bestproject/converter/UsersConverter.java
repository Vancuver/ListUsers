package com.vancuver.bestproject.converter;

import com.vancuver.bestproject.dto.UserDTO;
import com.vancuver.bestproject.entity.UsersEntity;
import org.springframework.stereotype.Component;

@Component
public class UsersConverter {
    public UsersEntity fromUserDtoToUser(UserDTO usersDto) {
        UsersEntity users = new UsersEntity();
        users.setId(usersDto.getId());
        users.setEmail(usersDto.getEmail());
        users.setName(usersDto.getName());
        users.setLogin(usersDto.getLogin());
        users.setPassword(usersDto.getPassword());
        return users;
    }
    public UserDTO fromUserToUserDto(UsersEntity users) {
        return UserDTO.builder()
                .id(users.getId())
                .email(users.getEmail())
                .login(users.getLogin())
                .name(users.getName())
                .password((users.getPassword()))
                .build();
    }
}