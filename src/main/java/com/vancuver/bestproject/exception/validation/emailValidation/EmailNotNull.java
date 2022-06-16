package com.vancuver.bestproject.exception.validation.emailValidation;

import com.vancuver.bestproject.dto.UserDTO;
import com.vancuver.bestproject.exception.ValidationException;
import com.vancuver.bestproject.exception.validation.ValidationRule;

import static java.util.Objects.isNull;

public class EmailNotNull implements ValidationRule {
    public void validate(UserDTO usersDto) throws ValidationException {
        if (isNull(usersDto.getEmail())) {
            throw new ValidationException("Email is empty");
        } else {
            if (usersDto.getEmail().isEmpty()) {
                throw new ValidationException("Email is empty");
            }
        }
    }
}
