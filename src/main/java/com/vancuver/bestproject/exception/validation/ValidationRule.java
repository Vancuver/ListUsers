package com.vancuver.bestproject.exception.validation;

import com.vancuver.bestproject.dto.UserDTO;
import com.vancuver.bestproject.exception.ValidationException;

public interface ValidationRule {

    void validate(UserDTO userDTO) throws ValidationException;

    default void checkNotNull(UserDTO userDTO) throws ValidationException {
        if (userDTO == null) {
            throw new ValidationException("ToDo must not be null.");
        }
    }

}
