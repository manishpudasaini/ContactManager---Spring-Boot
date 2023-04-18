package com.contactmanager.contactmanager.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    @Column(unique = true)
    private String email;
    private String password;
    private String role;
    private String imageUrl;
    private boolean enable;
    @Column(length = 500)
    private String about;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "user")
    private List<Contact> contacts = new ArrayList<>();

}
