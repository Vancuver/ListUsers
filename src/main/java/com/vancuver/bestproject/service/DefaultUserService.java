package com.vancuver.bestproject.service;

import com.vancuver.bestproject.converter.UsersConverter;
import com.vancuver.bestproject.dto.UserDTO;
import com.vancuver.bestproject.entity.UsersEntity;
import com.vancuver.bestproject.exception.validation.ValidationService;
import com.vancuver.bestproject.repository.UsersRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class DefaultUserService implements UsersService{

    private final UsersRepository usersRepository;
    private final UsersConverter usersConverter;
    private final ValidationService validationService;

    @Override
    public UserDTO saveUser(UserDTO usersDto)  {
        validationService.validate(usersDto);
        UsersEntity savedUser = usersRepository.save(usersConverter.fromUserDtoToUser(usersDto));
        return usersConverter.fromUserToUserDto(savedUser);

    }

    @Override
    public void deleteUser(Integer userId) {
        usersRepository.deleteById(userId);
    }

    @Override
    public UserDTO findByLogin(String login) {

        UsersEntity usersEntity = usersRepository.findByLogin(login);
        if (usersEntity != null) {
            return usersConverter.fromUserToUserDto(usersEntity);
        }
        return null;
    }

    @Override
    public List<UserDTO> findAll() {

        return usersRepository.findAll()
                .stream()
                .map(usersConverter::fromUserToUserDto)
                .collect(Collectors.toList());

    }
}
