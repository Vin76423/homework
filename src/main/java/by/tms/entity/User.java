package by.tms.entity;

<<<<<<< HEAD
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;

public class User {
    private static long idInc = 1;
    private long id = idInc++;
    @NotEmpty
    @NotBlank
    private String name;
    @NotEmpty
    @NotBlank
    private String login;
    @NotEmpty(message = "Password is empty!") //(2) Update error-script hear
    @NotBlank(message = "Spice is not char! Password is empty!") //(2) Update error-script hear
    private String password;
    @Range(min = 1, max = 90)
    private int age;

    public User(String name, String login, String password, int age) {
        this.name = name;
        this.login = login;
        this.password = password;
        this.age = age;
    }

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User(String login) {
        this.login = login;
    }
=======
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

public class User {
    private static int idInc = 1;
    private long id = idInc++;
    private String name;
    private String login;
    private String password;

    public User(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
    }


>>>>>>> origin/master

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

<<<<<<< HEAD
    public String getLogin() {
        return login;
    }
=======
    public String getLogin() { return login; }
>>>>>>> origin/master

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

<<<<<<< HEAD
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

=======
>>>>>>> origin/master
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
<<<<<<< HEAD
                ", age=" + age +
=======
>>>>>>> origin/master
                '}';
    }
}
