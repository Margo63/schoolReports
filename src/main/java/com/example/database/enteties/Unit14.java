package com.example.database.enteties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "unit14")
public class Unit14 {
    @Id
    private Long id;

    @Column
    private int maximumInternetAccessSpeed;

    @Column
    private int maximumSpeedOfFixedWiredInternetAccess;

    @Column
    private int maximumSpeedOfFixedWirelessInternetAccess;

    @Column
    private int maximumSpeedOfMobileInternetAccess;
}
