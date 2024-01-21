package com.example.vaika.repo;

import com.example.vaika.modele.Annonce;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnnonceRepository extends JpaRepository<Annonce, Long> {
    // You can add custom query methods here if needed
}
