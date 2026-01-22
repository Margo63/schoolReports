package com.example.database.enteties;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "unit6")
public class Unit6 {
    @Id
    private Long id;

    @Column
    private int hiking;

    @Column
    private int excursions;

    @Column
    private int inFieldExpeditions;
}
