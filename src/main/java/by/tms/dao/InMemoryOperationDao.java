package by.tms.dao;

import by.tms.entity.Operation;
import by.tms.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Component
public class InMemoryOperationDao implements OperationDao {
    private final List<Operation> OPERATIONS = new ArrayList<>();

    @Override
    public void createOperation(Operation operation) {
        if (operation == null) {
            throw new IllegalArgumentException("Argument 'user' is null!");
        }
        OPERATIONS.add(operation);
    }

    @Override
    public List<Operation> getOperationsByUserId(long userId) {
        if (userId <= 0) {
            throw new IllegalArgumentException("Argument 'id' is negative or 0!");
        }
        List<Operation> operations = new ArrayList<>(OPERATIONS);
        return operations.stream()
                .filter(o -> o.getUserId() == userId)
                .collect(Collectors.toList());
    }

    @Override
    public List<Operation> getOperationsByUserId(long userId, String operationTyp) {
        if (userId <= 0) {
            throw new IllegalArgumentException("Argument 'id' is negative or 0!");
        }
        if (operationTyp == null) {
            throw new IllegalArgumentException("Argument 'operationTyp' is null!");
        }
        List<Operation> operations = new ArrayList<>(OPERATIONS);
        return operations.stream()
                .filter(operation -> operation.getUserId() == userId)
                .filter(operation -> operation.getOperationType().equals(operationTyp))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteOperationsByUserId(long userId) {
        List<Operation> operations = getOperationsByUserId(userId);
        OPERATIONS.removeAll(operations);
    }

    @Override
    public boolean containOperationsByUserId(long userId) {
        for (Operation operation : OPERATIONS) {
            if (operation.getUserId() == userId) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containOperationsByUserId(long userId, String operationTyp) {
        for (Operation operation : OPERATIONS) {
            if (operation.getUserId() == userId && operation.getOperationType().equals(operationTyp)) {
                return true;
            }
        }
        return false;
    }
}
