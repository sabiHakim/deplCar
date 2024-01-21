package com.example.vaika.repo;

import com.example.vaika.modele.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
    // You can add custom query methods here if needed.
}