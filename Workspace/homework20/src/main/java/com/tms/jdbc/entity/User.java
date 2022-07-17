package com.tms.jdbc.entity;

public class User {
    private Long id;
    private String login;
    private String password;
    private String description;
    private Sex sex;
    private Role role;

    public User(String login, String password, String description, Sex sex, Role role) {
        this.login = login;
        this.password = password;
        this.description = description;
        this.sex = sex;
        this.role = role;
    }

    public User(Long id, String login, String password, String description, Sex sex, Role role) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.description = description;
        this.sex = sex;
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", description='" + description + '\'' +
                ", sex=" + sex +
                ", role=" + role +
                '}';
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
