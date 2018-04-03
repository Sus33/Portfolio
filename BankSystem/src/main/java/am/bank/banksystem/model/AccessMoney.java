package am.bank.banksystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "access_money")
public class AccessMoney {
    @Id
    @GeneratedValue
    @Column
    private int id;
    @Column(name = "money_type")
    @Enumerated(EnumType.STRING)
    private MoneyType moneyType;
    @Column(name = "access")
    private double accessMoney;
}
