package com.contactmanager.contactmanager.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private String email;
    private String password;
    private String role;
    private String imageUrl;
    @Column(length = 500)
    private String about;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "user")
    private List<Contact> contacts = new ArrayList<>();

}
