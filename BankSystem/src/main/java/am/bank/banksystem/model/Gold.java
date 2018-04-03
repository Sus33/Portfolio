package am.bank.banksystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "gold")
@Entity
public class Gold {
    @Id
    @GeneratedValue
    @Column
    private int id;
    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private GoldType goldType;
    @Column
    private double whole;
    @Column
    private double price;
    @Column
    private String timestamp;
    @Column(name = "pic_url")
    private String picture;
    @ManyToOne
    private Citizen citizen;
}
