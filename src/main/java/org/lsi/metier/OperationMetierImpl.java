package org.lsi.metier;

import org.lsi.dao.OperationRepository;
import org.lsi.entities.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OperationMetierImpl implements OperationMetier {
    @Autowired
    private OperationRepository operationRepository;

    @Override
    public Operation saveOperation(Operation operation) {
        return operationRepository.save(operation);
    }

    @Override
    public List<Operation> listOperations() {
        return operationRepository.findAll();
    }
}
