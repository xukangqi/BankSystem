package com.bank.pojo;

public class User {
    private String email;
    private String password;
    private String name;
    private String telephone;
    private int Authority;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getAuthority() {
        return Authority;
    }

    public void setAuthority(int authority) {
        Authority = authority;
    }

    public User() {
    }

    public User(String username, String password, String email, String telephone) {
        this.email = email;
        this.password = password;
        this.name = username;
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "User{" +
                " email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", username='" + name + '\'' +
                ", telephone=" + telephone +
                ", Authority=" + Authority +
                '}';
    }
}
