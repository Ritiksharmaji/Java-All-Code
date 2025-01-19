package com.springBoot.serverside.validation.entities;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class LoginData {

	@NotBlank(message="User Name cannot be empty!")
    @Size(min=3, max=12, message="User name must be between 3 to 12 characters")
    private String userName;

    @NotBlank(message="Email cannot be empty!")
    @Email(message="Email must be valid!")
    private String email;

    public LoginData() {
        super();
    }

    public LoginData(String userName, String email) {
        super();
        this.userName = userName;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "LoginData [userName=" + userName + ", email=" + email + "]";
    }
}
