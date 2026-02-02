package com.bai06.controller;

import com.bai06.model.User;

import java.util.ArrayList;

public class UserManager {
    public static ArrayList<User> users = new ArrayList<>();

    public static void addUser(User u) {
        users.add(u);
    }

    public static boolean checkLogin(String username, String password) {
        for (User u : users) {
            if(u.getUsername().equals(username) && u.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public static void showUsers() {
        int index = 1;
        for (User u : users) {
            System.out.println(index + ". " + u);
            index++;
        }
    }
}
