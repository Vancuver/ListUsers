package com.vancuver.bestproject.exception.validation.emailValidation;

import com.vancuver.bestproject.dto.UserDTO;
import com.vancuver.bestproject.exception.ValidationException;
import com.vancuver.bestproject.exception.validation.ValidationRule;
import org.springframework.stereotype.Component;

@Component
public class EmailMinLength implements ValidationRule {
    public void validate(UserDTO usersDto) throws ValidationException {
        if ((usersDto.getEmail()).length()<1) {
            throw new ValidationException("Email need to be more then 1 word");


        }
    }
}
