package com.vancuver.bestproject.exception.validation.passwordValidation;

import com.vancuver.bestproject.dto.UserDTO;
import com.vancuver.bestproject.exception.ValidationException;
import com.vancuver.bestproject.exception.validation.ValidationRule;

public class PasswordMinLength implements ValidationRule {
    public void validate(UserDTO usersDto) throws ValidationException {
        if ((usersDto.getPassword()).length()<1) {
            throw new ValidationException("Pass need to be more then 1 word");


        }
    }
}
