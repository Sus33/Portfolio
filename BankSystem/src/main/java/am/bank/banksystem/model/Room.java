package am.bank.banksystem.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Table(name="room")
@Data
@Entity
public class Room {
    @Id
    @GeneratedValue
    @Column
    private int id;
    @Column
    private String name;
    @Column(name = "pic_url")
    private String picture;

}
