package org.lsi.metier;

import org.lsi.dao.EmployeRepository;
import org.lsi.entities.Employe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeMetierImpl implements EmployeMetier {
    @Autowired
    private EmployeRepository employeRepository;

    @Override
    public Employe saveEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public List<Employe> listEmploes() {
        return employeRepository.findAll();
    }
}
