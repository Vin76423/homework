package by.tms.services;

import by.tms.dao.UserDao;
import by.tms.entity.User;
<<<<<<< HEAD
import by.tms.services.exception.DuplicateUserException;
import by.tms.services.exception.IllegalUsersFieldException;
import by.tms.services.exception.NotFoundUserByIdException;
import by.tms.services.exception.NotFoundUserByLoginException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;
=======
import by.tms.services.exceptions.DuplicateUserException;
import by.tms.services.exceptions.NotFoundUserException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
>>>>>>> origin/master

@Service
public class UserServiceImpl implements UserService {
    private UserDao userDao;

<<<<<<< HEAD
    public UserServiceImpl(@Qualifier("inMemoryUserDao") UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void createUser(User user) {
       if (userDao.containUserByLogin(user.getLogin())) {
           throw new DuplicateUserException();
       }
       userDao.createUser(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public User getUserById(long id) {
        if (userDao.containUserById(id)) {
            return userDao.getUserById(id);
        }
        throw new NotFoundUserByIdException();
    }

    @Override
    public User getUserByLogin(String login) {
        if (userDao.containUserByLogin(login)) {
            return userDao.getUserByLogin(login);
        }
        throw new NotFoundUserByLoginException();
    }

    @Override
    public void updateUserById(User user, String field, String value) {
        if (field == null || value == null) {
            throw new IllegalArgumentException("Arguments is null!");
        }
        if (!userDao.containUserById(user.getId())) {
            throw new NotFoundUserByIdException();
        }
        switch (field) {
            case "name":
                user.setName(value);
                break;
            case "login":
                user.setLogin(value);
                break;
            case "password":
                user.setPassword(value);
                break;
            case "age":
                user.setAge(Integer.parseInt(value));
                break;
            default: throw new IllegalUsersFieldException();
        }
        userDao.updateUserById(user);
    }

    @Override
    public void deleteUserById(long id) {
        if (userDao.containUserById(id)) {
            userDao.deleteUserById(id);
        }
        throw new NotFoundUserByIdException();
    }

    @Override
    public boolean containUserById(long id) {
        return userDao.containUserById(id);
    }

    @Override
    public boolean containUserByLogin(String login) {
        return userDao.containUserByLogin(login);
=======
    public UserServiceImpl(@Qualifier("inmemoryUserDao") UserDao userDao) {
        this.userDao = userDao;
    }



    @Override
    public void setUser(User user) {
        if (userDao.userIsContainByLogin(user)) {
            throw new DuplicateUserException("This user already exist!");
        }
        userDao.setUser(user);
    }

    @Override
    public User getUserByLogin(User user) {
        if (userDao.userIsContainByLogin(user)) {
            return userDao.getUserByLogin(user);
        }
        throw new NotFoundUserException();
    }

    @Override
    public boolean userIsContainByLogin(User user) {
        return userDao.userIsContainByLogin(user);
>>>>>>> origin/master
    }
}
