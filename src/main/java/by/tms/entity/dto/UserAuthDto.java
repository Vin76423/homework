package by.tms.entity.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class UserAuthDto {
    @NotEmpty
    @NotBlank
    private String login;
    @NotEmpty(message = "Password is empty!") //(2) Update error-script hear
    @NotBlank(message = "Password is empty!") //(2) Update error-script hear
    private String password;

    public UserAuthDto() { }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserAuthDto{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
