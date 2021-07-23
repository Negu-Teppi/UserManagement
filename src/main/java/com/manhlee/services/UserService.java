package com.manhlee.services;

import com.manhlee.model.User;

import java.util.List;

public class UserService {
    public static int generalUserId(List<User> userList) {
        int id = 1;
        if (userList.size() > 0) {
            id = userList.get(userList.size() - 1).getId() + 1;
        }
        return id;
    }

    public static void deleteUserById(List<User> userList, int id) {
        for (User user : userList) {
            if (user.getId() == id) {
                userList.remove(user);
                return;
            }
        }
    }

    public static User findUserById(List<User> userList, int id) {
        User userEdit = null;
        for (User user : userList) {
            if (user.getId() == id) {
                userEdit = user;
            }
        }
        return userEdit;
    }

    public static User editUserById(List<User> userList, int id, String email, String firstName, String lastName) {
        for (User user : userList) {
            if (user.getId() == id) {
                user.setEmail(email);
                user.setFirstName(firstName);
                user.setLastName(lastName);
                return user;
            }
        }
        return null;
    }
}
