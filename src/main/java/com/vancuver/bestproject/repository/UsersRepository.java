package com.vancuver.bestproject.repository;

import com.vancuver.bestproject.entity.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<UsersEntity, Integer> {

    UsersEntity findByLogin(String login);

}
