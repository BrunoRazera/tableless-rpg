package com.example.bruno.tableless_rpg.activity.models;

import java.net.PasswordAuthentication;

/**
 * Created by bruno on 27/10/16.
 */
public class Player {
    private String name;
    private String email;
    // private String password;

    public Player(String name, String email) {
        this.name = name;
        this.email = email;
        // this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
