package com.lesson4.servlet;

public class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "name" + name;
    }

    public static User create(final String name) {
        String realName = name.substring(name.indexOf("=")+1);
        return new User(realName);
    }

}