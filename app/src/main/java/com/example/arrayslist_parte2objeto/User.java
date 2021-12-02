package com.example.arrayslist_parte2objeto;

public class User {

    private String name;
    private String password;
    private String email;


    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public User(User u) {
        this.name = u.name;
        this.password = u.password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return name + " -> " + password ;
    }
}
