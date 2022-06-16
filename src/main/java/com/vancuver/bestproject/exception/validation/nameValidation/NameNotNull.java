package com.vancuver.bestproject.exception.validation.nameValidation;

import com.vancuver.bestproject.dto.UserDTO;
import com.vancuver.bestproject.exception.ValidationException;
import com.vancuver.bestproject.exception.validation.ValidationRule;

import static java.util.Objects.isNull;

public class NameNotNull implements ValidationRule {
    public void validate(UserDTO usersDto) throws ValidationException {
        if (isNull(usersDto.getName())) {
            throw new ValidationException("Name is empty");
        } else {
            if (usersDto.getName().isEmpty()) {
                throw new ValidationException("Name is empty");
            }
        }
    }
}
