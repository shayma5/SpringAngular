package com.esprit.gestionfoyerback.Service;

import com.esprit.gestionfoyerback.Entity.Chambre;

import java.util.List;

public interface ChambreService {
    List<Chambre> retrieveAllChambres();

    Chambre addChambre(Chambre c);

    Chambre updateChambre (Chambre c);

    Chambre retrieveChambre (long idChambre);
}
