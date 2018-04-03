package am.bank.banksystem.repository;


import am.bank.banksystem.model.Citizen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitizenRepository extends JpaRepository<Citizen,Integer> {
}
