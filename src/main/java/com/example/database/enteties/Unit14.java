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
    private Byte maximumInternetAccessSpeed;

    @Column
    private Byte maximumSpeedOfFixedWiredInternetAccess;

    @Column
    private Byte maximumSpeedOfFixedWirelessInternetAccess;

    @Column
    private Byte maximumSpeedOfMobileInternetAccess;

    public Unit14() {
    }

    public Unit14(Long id) {
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Byte getMaximumInternetAccessSpeed() {
        return maximumInternetAccessSpeed;
    }

    public void setMaximumInternetAccessSpeed(Byte maximumInternetAccessSpeed) {
        this.maximumInternetAccessSpeed = maximumInternetAccessSpeed;
    }

    public Byte getMaximumSpeedOfFixedWiredInternetAccess() {
        return maximumSpeedOfFixedWiredInternetAccess;
    }

    public void setMaximumSpeedOfFixedWiredInternetAccess(Byte maximumSpeedOfFixedWiredInternetAccess) {
        this.maximumSpeedOfFixedWiredInternetAccess = maximumSpeedOfFixedWiredInternetAccess;
    }

    public Byte getMaximumSpeedOfFixedWirelessInternetAccess() {
        return maximumSpeedOfFixedWirelessInternetAccess;
    }

    public void setMaximumSpeedOfFixedWirelessInternetAccess(Byte maximumSpeedOfFixedWirelessInternetAccess) {
        this.maximumSpeedOfFixedWirelessInternetAccess = maximumSpeedOfFixedWirelessInternetAccess;
    }

    public Byte getMaximumSpeedOfMobileInternetAccess() {
        return maximumSpeedOfMobileInternetAccess;
    }

    public void setMaximumSpeedOfMobileInternetAccess(Byte maximumSpeedOfMobileInternetAccess) {
        this.maximumSpeedOfMobileInternetAccess = maximumSpeedOfMobileInternetAccess;
    }
}
