package org.lsi.services;

import org.lsi.entities.Groupe;
import org.lsi.metier.GroupeMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GroupeRestService {
    @Autowired
    private GroupeMetier groupeMetier;

    @RequestMapping(value = "/groupes", method = RequestMethod.POST)
    public Groupe saveEmploye(@RequestBody Groupe groupe){
        return groupeMetier.saveGroupe(groupe);
    }

    @RequestMapping(value = "/groupes", method = RequestMethod.GET)
    public List<Groupe> listGroupe(){
        return groupeMetier.listGroupes();
    }
}
