package org.lsi.metier;

import org.lsi.dao.CompteRepository;
import org.lsi.entities.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompteMetierImpl implements CompteMetier {
    @Autowired
    private CompteRepository compteRepository;

    @Override
    public Compte saveCompte(Compte compte) {
        return compteRepository.save(compte);
    }

    @Override
    public List<Compte> listCompte() {
        return compteRepository.findAll();
    }
}
