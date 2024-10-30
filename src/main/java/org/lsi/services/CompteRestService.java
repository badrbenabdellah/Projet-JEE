package org.lsi.services;

import org.lsi.entities.Compte;
import org.lsi.metier.CompteMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CompteRestService {
    @Autowired
    private CompteMetier compteMetier;

    @RequestMapping(value="/comptes", method = RequestMethod.POST)
    public Compte saveCompte(@RequestBody Compte compte) {
        return compteMetier.saveCompte(compte);
    }

    @RequestMapping(value="/comptes", method = RequestMethod.GET)
    public List<Compte> listCompte() {
        return compteMetier.listCompte();
    }
}
