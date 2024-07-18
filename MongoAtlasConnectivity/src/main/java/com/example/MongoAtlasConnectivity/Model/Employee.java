package com.example.MongoAtlasConnectivity.Model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Employee {
    private String id;
    private String username;
    private String Mark1;
    private String Mark2;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMark1() {
        return Mark1;
    }

    public void setMark1(String mark1) {
        Mark1 = mark1;
    }

    public String getMark2() {
        return Mark2;
    }

    public void setMark2(String mark2) {
        Mark2 = mark2;
    }
}
