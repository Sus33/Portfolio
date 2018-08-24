package com.example.demo.repository;

import com.example.demo.model.Ad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdRepository extends JpaRepository<Ad, Integer> {
    Ad findCategoryById(int id);

}
