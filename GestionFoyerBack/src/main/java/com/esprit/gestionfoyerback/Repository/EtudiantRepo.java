package com.esprit.gestionfoyerback.Repository;

import com.esprit.gestionfoyerback.Entity.Etudiant;
import org.springframework.data.repository.CrudRepository;

public interface EtudiantRepo extends CrudRepository<Etudiant,Long> {
}
