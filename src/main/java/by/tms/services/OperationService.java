package by.tms.services;

import by.tms.entity.Operation;
import java.util.List;

public interface OperationService {
    void createOperation(Operation operation);
    List<Operation> getOperationsByUserId(long userId);
    List<Operation> getOperationsByUserId(long userId, String operationTyp);
    void deleteOperationsByUserId(long userId);
    boolean containOperationsByUserId(long userId);
    boolean containOperationsByUserId(long userId, String operationTyp);
}
