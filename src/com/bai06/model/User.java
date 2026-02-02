package com.bai06.model;

public class User {
    private final int id;
    String username;
    String password;

    public User(int id, String username, String  password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "User[id=" + id + ", username=" + username + "]";
    }
}
