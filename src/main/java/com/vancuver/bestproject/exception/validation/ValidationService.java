package com.vancuver.bestproject.exception.validation;

import com.vancuver.bestproject.dto.UserDTO;
import com.vancuver.bestproject.exception.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class ValidationService {

    private final List<ValidationRule> validationRules;

    @Autowired
    public ValidationService(List<ValidationRule> validationRules) {
        this.validationRules = validationRules;
    }

    public List<CoreError> validate(UserDTO usersDto) {
        List<CoreError> errors = new ArrayList<>();
        if (usersDto == null) {
            errors.add(new CoreError("ToDo must not be null"));
            return errors;
        }

        return validationRules.stream()
                .map(rule -> validate(rule, usersDto))
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
    }

    private CoreError validate(ValidationRule rule, UserDTO usersDto) {
        try {
            rule.validate(usersDto);
        } catch (ValidationException e) {
            return new CoreError(e.getMessage());
        }
        return null;
    }


}
