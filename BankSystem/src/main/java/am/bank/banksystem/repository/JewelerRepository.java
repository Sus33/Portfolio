package am.bank.banksystem.repository;


import am.bank.banksystem.model.Gold;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JewelerRepository extends JpaRepository<Gold,Integer> {
}
