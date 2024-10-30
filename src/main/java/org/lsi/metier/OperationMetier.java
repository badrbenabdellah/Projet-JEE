package org.lsi.metier;

import org.lsi.entities.Operation;
import java.util.List;

public interface OperationMetier {
    public Operation saveOperation(Operation operation);
    public List<Operation> listOperations();
}
