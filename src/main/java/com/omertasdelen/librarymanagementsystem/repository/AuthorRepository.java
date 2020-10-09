package com.omertasdelen.librarymanagementsystem.repository;

import com.omertasdelen.librarymanagementsystem.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
