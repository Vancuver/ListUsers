package com.vancuver.bestproject.exception.validation.loginValidation;

import com.vancuver.bestproject.dto.UserDTO;
import com.vancuver.bestproject.exception.ValidationException;
import com.vancuver.bestproject.exception.validation.ValidationRule;

public class LoginMinLength implements ValidationRule {
    public void validate(UserDTO usersDto) throws ValidationException {
        if ((usersDto.getLogin()).length()<1) {
            throw new ValidationException("Login need to be more then 1 word");


        }
    }
}
