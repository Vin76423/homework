package by.tms.dao;

import by.tms.dao.exception.NoResultException;
import by.tms.entity.User;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class InmemoryUserDao implements UserDao {
    private final List<User> USERS = new ArrayList<>();

    @Override
    public void setUser(User user) {
        USERS.add(user);
    }

    @Override
    public User getUserByLogin(User gotUser) {
        for (User user : USERS) {
            if (user.getLogin().equals(gotUser.getLogin())){
                return user;
            }
        }
        throw new NoResultException();
    }

    @Override
    public boolean userIsContainByLogin(User gotUser) {
        for (User user : USERS) {
            if (user.getLogin().equals(gotUser.getLogin())){
                return true;
            }
        }
        return false;
    }
}
