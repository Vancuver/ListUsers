package com.vancuver.bestproject.exception.validation.nameValidation;

import com.vancuver.bestproject.dto.UserDTO;
import com.vancuver.bestproject.exception.ValidationException;
import com.vancuver.bestproject.exception.validation.ValidationRule;

import static java.util.Objects.isNull;

public class NameMinLength implements ValidationRule {
    public void validate(UserDTO usersDto) throws ValidationException {
        if ((usersDto.getName()).length()<1) {
            throw new ValidationException("Name need to be more then 1 word");


        }
    }
}
