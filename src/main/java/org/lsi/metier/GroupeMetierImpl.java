package org.lsi.metier;

import org.lsi.dao.GroupeRespository;
import org.lsi.entities.Groupe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupeMetierImpl implements GroupeMetier {
    @Autowired
    private GroupeRespository groupeRespository;

    @Override
    public Groupe saveGroupe(Groupe groupe) {
        return groupeRespository.save(groupe);
    }

    @Override
    public List<Groupe> listGroupes() {
        return groupeRespository.findAll();
    }

}
