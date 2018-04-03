package am.bank.banksystem.repository;

import am.bank.banksystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepository extends JpaRepository<User,Integer> {
    User findOneByEmail(String email);
}
