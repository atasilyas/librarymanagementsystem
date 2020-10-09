package com.omertasdelen.librarymanagementsystem.repository;

import com.omertasdelen.librarymanagementsystem.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
