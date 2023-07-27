package com.shreyas.user;

import java.util.Objects;
import java.util.UUID;


// User POJO
public class User {
    private String name;
    private UUID ID;

    public User() {

    }

    public User(String name, UUID ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + name + '\'' +
                ", UserID=" + ID +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(ID, user.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ID);
    }

}
