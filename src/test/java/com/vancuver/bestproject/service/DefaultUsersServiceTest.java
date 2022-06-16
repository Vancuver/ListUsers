package com.vancuver.bestproject.service;

import com.vancuver.bestproject.converter.UsersConverter;
import com.vancuver.bestproject.dto.UserDTO;
import com.vancuver.bestproject.exception.ValidationException;
import com.vancuver.bestproject.exception.validation.ValidationService;
import com.vancuver.bestproject.repository.UsersRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static com.vancuver.bestproject.prototype.UsersPrototype.aUser;
import static com.vancuver.bestproject.prototype.UsersPrototype.aUserDTO;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class DefaultUsersServiceTest {

    private UsersRepository usersRepository;
    private UsersConverter usersConverter;
    private UsersService usersService;

    private ValidationService validationService;

    @BeforeEach
    void setUp() {
        usersRepository = mock(UsersRepository.class);
        usersConverter = new UsersConverter();
        usersService = new DefaultUserService(usersRepository, usersConverter, validationService);
    }

    @Test
    void saveUser() throws ValidationException {
        when(usersRepository.save(any())).thenReturn(aUser());
        UserDTO createdUser = usersService.saveUser(aUserDTO());
        assertThat(createdUser).isNotNull();
        assertThat(createdUser.getName()).isEqualTo(aUserDTO().getName());
    }

    @Test
    void saveUserThrowsValidationExceptionWhenLoginIsNull() {
        UserDTO usersDto = aUserDTO();
        usersDto.setLogin("");
        assertThrows(ValidationException.class,
                () -> usersService.saveUser(usersDto),
                "Login is empty");
    }

    @Test
    void deleteUser() {
    }

    @Test
    void findByLogin() {
        when(usersRepository.findByLogin(eq("test_login"))).thenReturn(aUser());
        UserDTO foundUser = usersService.findByLogin("test_login");
        assertThat(foundUser).isNotNull();
        assertThat(foundUser.getLogin()).isEqualTo("test_login");
    }

    @Test
    void findAll() {
    }
}
