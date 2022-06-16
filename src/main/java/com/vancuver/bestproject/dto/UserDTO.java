package com.vancuver.bestproject.dto;

import lombok.Builder;
import lombok.Data;


@Builder
@Data
public class UserDTO {

    private Integer id;
    private String name;
    private String login;
    private String email;
    private String password;

}
