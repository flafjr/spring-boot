package com.github.flafjr.springboot.infrastructure.repository;

import com.github.flafjr.springboot.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.TestPropertySource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@TestPropertySource(properties = {
        "spring.flyway.enabled=false",
        "spring.jpa.hibernate.ddl-auto=create-drop"
})
class UserRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private UserRepository repository;

    @Test
    public void findByUserTyoe() {
        User user = new User("userType", "email", "phoneNumber");
        entityManager.persist(user);

        List<User> findByUserTyoe = repository.findByUserType(user.getUserType());

        assertThat(findByUserTyoe).extracting(User::getUserType).containsOnly(user.getUserType());
    }
}