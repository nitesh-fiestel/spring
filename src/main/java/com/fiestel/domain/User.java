package com.fiestel.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "users")
public class User {

    // An autogenerated id (unique for each user in the db)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    private String email;

    @NotNull
    private String name;

    @NotNull
    private String password;

    // Public methods

    public User() { }

    public User(long id) {
        this.id = id;
    }

    public User(String email, String name, String password) {
        this.email = email;
        this.name = name;
        this.password = password;
    }

    // Getter and setter methods
    // ...

    public Long getId() {
        return this.id;
    }

}
