package com.vancuver.bestproject.exception.validation.loginValidation;

import com.vancuver.bestproject.dto.UserDTO;
import com.vancuver.bestproject.exception.ValidationException;
import com.vancuver.bestproject.exception.validation.ValidationRule;

import static java.util.Objects.isNull;

public class LoginNotNull implements ValidationRule {
    public void validate(UserDTO usersDto) throws ValidationException {
        if (isNull(usersDto.getLogin())) {
            throw new ValidationException("Login is empty");
        } else {
            if (usersDto.getLogin().isEmpty()) {
                throw new ValidationException("Login is empty");
            }
        }
    }
}
