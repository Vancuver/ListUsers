package com.vancuver.bestproject.repository;


import com.vancuver.bestproject.entity.UsersEntity;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static com.vancuver.bestproject.prototype.UsersPrototype.aUser;

@RunWith(SpringRunner.class)
@DataJpaTest
class UsersRepositoryTest {

    @Autowired
    private UsersRepository usersRepository;

    @Test
    void findByLogin() {
        usersRepository.save(aUser());
        UsersEntity foundUser = usersRepository.findByLogin(aUser().getLogin());
        assertThat(foundUser).isNotNull();
        assertThat(foundUser.getName()).isEqualTo(aUser().getName());
    }
}
