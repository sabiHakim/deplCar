package com.example.vaika.repo;

import com.example.vaika.modele.Marque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarqueRepository extends JpaRepository<Marque, Long> {
    // You can add custom query methods here if needed
}