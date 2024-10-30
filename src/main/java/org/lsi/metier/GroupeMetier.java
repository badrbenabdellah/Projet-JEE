package org.lsi.metier;

import org.lsi.entities.Groupe;

import java.util.List;

public interface GroupeMetier {
    public Groupe saveGroupe(Groupe groupe);
    public List<Groupe> listGroupes();
}
