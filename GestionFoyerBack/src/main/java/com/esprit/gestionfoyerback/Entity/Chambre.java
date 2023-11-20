package com.esprit.gestionfoyerback.Entity;

import com.esprit.gestionfoyerback.Enum.TypeChambre;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idChambre;
    long numeroChambre;
    @Enumerated(EnumType.STRING)
    TypeChambre typeChambre;
    @ManyToOne
    Bloc blocs;
    @OneToMany(cascade = CascadeType.ALL)
    Set<Reservation> reservations;
}
