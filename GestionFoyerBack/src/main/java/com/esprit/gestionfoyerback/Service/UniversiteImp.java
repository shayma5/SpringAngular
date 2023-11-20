package com.esprit.gestionfoyerback.Service;

import com.esprit.gestionfoyerback.Entity.Universite;
import com.esprit.gestionfoyerback.Repository.UniversiteRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UniversiteImp implements UniversiteService {
    private final UniversiteRepo universiteRepo;
    @Override
    public List<Universite> retrieveAllUniversities() {
        return (List<Universite>) universiteRepo.findAll();
    }

    @Override
    public Universite addUniversite(Universite u) {
        return universiteRepo.save(u);
    }

    @Override
    public Universite updateUniversite(Universite u) {
        return universiteRepo.save(u);
    }

    @Override
    public Universite retrieveUniversite(long idUniversite) {
        return universiteRepo.findById(idUniversite).orElse(null);
    }
}
