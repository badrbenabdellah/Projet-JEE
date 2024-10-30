package org.lsi.metier;

import org.lsi.entities.Compte;
import java.util.List;

public interface CompteMetier {
    public Compte saveCompte(Compte c);
    public List<Compte> listCompte();
}
