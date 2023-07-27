package com.shreyas.user;

import java.util.UUID;

public class UserService {
    private final UserDao userDao = new UserDao();

    public User[] getUser() {
        return userDao.getUsers();
    }

    public User getUserById(UUID id) {
        for (User user : getUser()) {
            if (user.getID().equals(id)) {
                return user;
            }
        }
        return null;
    }
}
