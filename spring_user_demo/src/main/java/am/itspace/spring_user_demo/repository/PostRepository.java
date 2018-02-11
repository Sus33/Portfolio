package am.itspace.spring_user_demo.repository;

import am.itspace.spring_user_demo.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
