package org.lsi.metier;

import org.lsi.entities.Employe;
import java.util.List;

public interface EmployeMetier {
    public Employe saveEmploye(Employe employe);
    public List<Employe> listEmploes();
}
