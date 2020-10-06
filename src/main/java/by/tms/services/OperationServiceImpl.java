package by.tms.services;

import by.tms.dao.OperationDao;
import by.tms.entity.Operation;
import by.tms.services.exception.NotFoundOperationsByUserIdException;
import by.tms.services.exception.NotFoundOperationsByUserIdAndOperationTypeException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OperationServiceImpl implements OperationService {
    private OperationDao operationDao;

    public OperationServiceImpl(OperationDao operationDao) {
        this.operationDao = operationDao;
    }

    @Override
    public void createOperation(Operation operation) {
        operationDao.createOperation(operation);
    }

    @Override
    public List<Operation> getOperationsByUserId(long userId) {
        if (operationDao.containOperationsByUserId(userId)) {
            return operationDao.getOperationsByUserId(userId);
        }
        throw new NotFoundOperationsByUserIdException();
    }

    @Override
    public List<Operation> getOperationsByUserId(long userId, String operationTyp) {
        if (operationDao.containOperationsByUserId(userId, operationTyp)) {
            return operationDao.getOperationsByUserId(userId, operationTyp);
        }
        throw new NotFoundOperationsByUserIdAndOperationTypeException();
    }

    @Override
    public void deleteOperationsByUserId(long userId) {
        operationDao.deleteOperationsByUserId(userId);
    }

    @Override
    public boolean containOperationsByUserId(long userId) {
        return operationDao.containOperationsByUserId(userId);
    }

    @Override
    public boolean containOperationsByUserId(long userId, String operationTyp) {
        return operationDao.containOperationsByUserId(userId, operationTyp);
    }
}
