package com.example.vaika.controller;

import com.example.vaika.modele.Annonce;
import com.example.vaika.repo.AnnonceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//@CrossOrigin(origins = "http://localhost:8100")
public class AnnonceController {

    @Autowired
    private AnnonceRepository annonceRepository;

    @PostMapping("/annonce")
    Annonce newAnnonce(@RequestBody Annonce newAnnonce) {
        return annonceRepository.save(newAnnonce);
    }

    @GetMapping("/annonces")
    List<Annonce> getAllAnnonces() {
        return annonceRepository.findAll();
    }

    @GetMapping("/annonce/{id}")
    ResponseEntity<Annonce> getAnnonceById(@PathVariable(value = "id") Long annonceId) {
        Optional<Annonce> annonce = annonceRepository.findById(annonceId);
        if (annonce.isPresent()) {
            return ResponseEntity.ok().body(annonce.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/annonce/{id}")
    public ResponseEntity<Annonce> updateAnnonce(@PathVariable(value = "id") Long annonceId,
                                                 @RequestBody Annonce annonceDetails) {
        Optional<Annonce> optionalAnnonce = annonceRepository.findById(annonceId);
        if (optionalAnnonce.isPresent()) {
            Annonce annonce = optionalAnnonce.get();
            annonce.setDateAnnonce(annonceDetails.getDateAnnonce());
            annonce.setUtilisateur(annonceDetails.getUtilisateur());
            annonce.setVoiture(annonceDetails.getVoiture());
            annonce.setStatut(annonceDetails.getStatut());
            annonce.setDescription(annonceDetails.getDescription());

            final Annonce updatedAnnonce = annonceRepository.save(annonce);
            return ResponseEntity.ok(updatedAnnonce);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/annonce/{id}")
    public ResponseEntity<Void> deleteAnnonce(@PathVariable(value = "id") Long annonceId) {
        Optional<Annonce> annonce = annonceRepository.findById(annonceId);
        if (annonce.isPresent()) {
            annonceRepository.delete(annonce.get());
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
