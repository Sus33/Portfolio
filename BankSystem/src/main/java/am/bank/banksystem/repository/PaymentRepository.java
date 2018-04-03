package am.bank.banksystem.repository;

import am.bank.banksystem.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {



}
