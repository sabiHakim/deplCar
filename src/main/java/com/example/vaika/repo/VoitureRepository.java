package com.example.vaika.repo;

import com.example.vaika.modele.Voiture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoitureRepository extends JpaRepository<Voiture, Long> {
    // You can add custom query methods here if needed
}
