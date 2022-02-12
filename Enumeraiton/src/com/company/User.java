package com.company;

import com.company.enums.EnumRole;

public class User {

    private String userName;
    private String password;
    private EnumRole role;

    public User() {
    }

    public User(String userName, String password, EnumRole role) {
        this.userName = userName;
        this.password = password;
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public EnumRole getRole() {
        return role;
    }

    public void setRole(EnumRole role) {
        this.role = role;
    }
}
