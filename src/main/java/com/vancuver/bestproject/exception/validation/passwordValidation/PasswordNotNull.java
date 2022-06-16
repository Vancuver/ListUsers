package com.vancuver.bestproject.exception.validation.passwordValidation;

import com.vancuver.bestproject.dto.UserDTO;
import com.vancuver.bestproject.exception.ValidationException;
import com.vancuver.bestproject.exception.validation.ValidationRule;

import static java.util.Objects.isNull;

public class PasswordNotNull implements ValidationRule {
    public void validate(UserDTO usersDto) throws ValidationException {
        if (isNull(usersDto.getPassword())) {
            throw new ValidationException("Pass is empty");
        } else {
            if (usersDto.getPassword().isEmpty()) {
                throw new ValidationException("Pass is empty");
            }
        }
    }
}
