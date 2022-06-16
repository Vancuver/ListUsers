package com.vancuver.bestproject.service;

import com.vancuver.bestproject.dto.UserDTO;

import java.util.List;

public interface UsersService {

    UserDTO saveUser(UserDTO usersDto);

    void deleteUser(Integer userId);

    UserDTO findByLogin(String login);

    List<UserDTO> findAll();
}
