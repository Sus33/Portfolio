package am.bank.banksystem.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "manager")
@Entity
@Builder
public class User {
@Id
@GeneratedValue()
@Column
    private int id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private int age;
    @Enumerated(EnumType.STRING)
    @Column(name = "gender_type")
    private GenderType genderType;
    @Column
    private String email;
    @Column
    private String password;
    @Enumerated(EnumType.STRING)
    private UserType userType;
    @Column(name = "pic_url")
    private String picture;

}
