package com.vancuver.bestproject.exception.validation.nameValidation;

import com.vancuver.bestproject.dto.UserDTO;
import com.vancuver.bestproject.exception.ValidationException;
import com.vancuver.bestproject.exception.validation.ValidationRule;

public class NameNotDigit implements ValidationRule {
    public void validate(UserDTO usersDto) throws ValidationException {
        for(char c : usersDto.getName().toCharArray()){
            if(Character.isDigit(c)){
            throw new ValidationException("Name can not include digit!");


        }
    }
}
}