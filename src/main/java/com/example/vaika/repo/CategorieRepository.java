package com.example.vaika.repo;

import com.example.vaika.modele.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {
    // You can add custom query methods here if needed
}