package home.clear.repo;

import home.clear.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by karimov on 24.02.2016.
 */
public interface UserRepo extends JpaRepository<User, Long> {
}
