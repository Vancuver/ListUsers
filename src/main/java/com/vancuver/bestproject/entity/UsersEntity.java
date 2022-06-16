package com.vancuver.bestproject.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "users_table")
@Data
@NoArgsConstructor
public class UsersEntity {





        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column
        private String name;

        @Column
        private String login;

        @Column
        private String email;

        @Column String password;
    }

