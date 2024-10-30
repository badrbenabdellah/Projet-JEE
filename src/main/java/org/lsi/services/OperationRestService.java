package org.lsi.services;

import org.lsi.entities.Employe;
import org.lsi.entities.Operation;
import org.lsi.metier.EmployeMetier;
import org.lsi.metier.OperationMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
@Service
public class OperationRestService {
    @Autowired
    private OperationMetier operationMetier;

    @RequestMapping(value = "/operations", method = RequestMethod.POST)
    public Operation saveOperation(@RequestBody Operation operation){
        return operationMetier.saveOperation(operation);
    }

    @RequestMapping(value = "/operations", method = RequestMethod.GET)
    public List<Operation> listOperations(){
        return operationMetier.listOperations();
    }
}
