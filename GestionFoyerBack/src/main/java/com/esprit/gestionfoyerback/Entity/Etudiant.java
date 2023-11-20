package com.esprit.gestionfoyerback.Entity;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idEtudiant;
    String nomEtudiant;
    String prenomEtudiant;
    long cin;
    String ecole;
    Date dateNaissance;
    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "etudiants")
    Set<Reservation> Reservations;
}
