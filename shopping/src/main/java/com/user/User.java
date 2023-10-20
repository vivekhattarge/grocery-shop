package com.user;

import jakarta.persistence.Table;
import org.springframework.data.annotation.Id;

@Table(name = "user")
public class User {
    @Id
    private String id;
    private String name;
    private String address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
