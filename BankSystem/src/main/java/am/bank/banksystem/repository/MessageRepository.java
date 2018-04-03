package am.bank.banksystem.repository;

import am.bank.banksystem.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message,Integer> {
}
