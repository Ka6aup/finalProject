package attest.finish.repository;

import attest.finish.model.Favorite;
import attest.finish.model.Resource;
import attest.finish.model.User;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

@DataJpaTest
public class FavoriteRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @BeforeEach
    public void setUp() {
        // Создаем и сохраняем тестовые объекты в базе данных
        User user = entityManager.persist(new User(null, "username", "email@example.com", "password"));
        Resource resource = entityManager.persist(new Resource(null, "title", "description", "type", "url", null));
        entityManager.persist(new Favorite(null, user, resource));
    }



}