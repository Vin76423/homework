package by.tms.services;

<<<<<<< HEAD
import by.tms.entity.User;
import java.util.List;

public interface UserService {
    void createUser(User user);
    List<User> getAllUsers();
    User getUserById(long id);
    User getUserByLogin(String login);
    void updateUserById(User user, String field, String value);
    void deleteUserById(long id);
    boolean containUserById(long id);
    boolean containUserByLogin(String login);
=======
import by.tms.dao.UserDao;
import by.tms.entity.User;

public interface UserService {
    void setUser(User user);
    User getUserByLogin(User user);
    boolean userIsContainByLogin(User user);
>>>>>>> origin/master
}
