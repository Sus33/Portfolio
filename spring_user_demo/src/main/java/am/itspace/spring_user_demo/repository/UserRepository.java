package am.itspace.spring_user_demo.repository;

import am.itspace.spring_user_demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{

}
