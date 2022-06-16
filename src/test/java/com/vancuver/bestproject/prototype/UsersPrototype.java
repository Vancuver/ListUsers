package com.vancuver.bestproject.prototype;

import com.vancuver.bestproject.dto.UserDTO;
import com.vancuver.bestproject.entity.UsersEntity;


public class UsersPrototype {

    public static UsersEntity aUser() {
        UsersEntity u = new UsersEntity();
        u.setName("test_name");
        u.setLogin("test_login");
        return u;
    }

    public static UserDTO aUserDTO() {
        return UserDTO.builder()
                .name("test_name")
                .login("test_login")
                .build();
    }
}
