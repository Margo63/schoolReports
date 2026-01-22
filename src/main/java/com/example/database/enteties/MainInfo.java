package com.example.database.enteties;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "main_info")
public class MainInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Date date;

    @Column
    private String organizationsName;

    @Column
    private String email;


}
