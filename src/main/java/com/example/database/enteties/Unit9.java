package com.example.database.enteties;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "unit9")
public class Unit9 {
    @Id
    private Long id;

    @Column
    private int[] organizationBuildings = new int[13];

    @Column
    private int[] partOfTheBuilding = new int[13];
}
