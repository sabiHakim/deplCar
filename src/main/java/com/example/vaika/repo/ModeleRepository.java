package com.example.vaika.repo;

import com.example.vaika.modele.Modele;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ModeleRepository extends JpaRepository<Modele, Long> {
    // You can add custom query methods here if needed
}