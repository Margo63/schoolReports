package com.example.database.enteties;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "unit1")
public class Unit1 {
    @Id
    private Long id;

    @Column
    private int organization_type;

    @Column
    private int terrain_type;
}
