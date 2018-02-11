package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private long id;
    private String name;
    private String surname;
    private String email;
    private Gender gender;
    private String password;

    public User(String name, String surename, String email, Gender gender, String password) {

    }
}