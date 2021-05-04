package com.example.librarysystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.librarysystem.model.Book;

@Repository
public interface BookRepo extends JpaRepository<Book,Long> {
    Book findByName(String to_kill_a_mocking_bird);
}

