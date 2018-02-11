package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private long id;
    private String name;
    private String author;
    private Double price;
    private String description;
    private long userId;

    public Book(String name, String author, double v, String description) {

    }
}
