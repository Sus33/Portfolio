package com.example.blog.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "post")
@Entity
public class Post {
    @Id
    @GeneratedValue()
    @Column
    private int id;
    @Column
    private String title;
    @Column
    private String text;
    @Column
    private int categoryId;
    @Column
    private int userId;
    @Column(name = "pic_url")
    private String picUrl;
    @Column
    private String timestamp;
}
