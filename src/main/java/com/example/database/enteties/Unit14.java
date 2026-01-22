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
    private Integer maximumInternetAccessSpeed;

    @Column
    private Integer maximumSpeedOfFixedWiredInternetAccess;

    @Column
    private Integer maximumSpeedOfFixedWirelessInternetAccess;

    @Column
    private Integer maximumSpeedOfMobileInternetAccess;

    public Integer getMaximumInternetAccessSpeed() {
        return maximumInternetAccessSpeed;
    }

    public void setMaximumInternetAccessSpeed(Integer maximumInternetAccessSpeed) {
        this.maximumInternetAccessSpeed = maximumInternetAccessSpeed;
    }

    public Integer getMaximumSpeedOfFixedWiredInternetAccess() {
        return maximumSpeedOfFixedWiredInternetAccess;
    }

    public void setMaximumSpeedOfFixedWiredInternetAccess(Integer maximumSpeedOfFixedWiredInternetAccess) {
        this.maximumSpeedOfFixedWiredInternetAccess = maximumSpeedOfFixedWiredInternetAccess;
    }

    public Integer getMaximumSpeedOfFixedWirelessInternetAccess() {
        return maximumSpeedOfFixedWirelessInternetAccess;
    }

    public void setMaximumSpeedOfFixedWirelessInternetAccess(Integer maximumSpeedOfFixedWirelessInternetAccess) {
        this.maximumSpeedOfFixedWirelessInternetAccess = maximumSpeedOfFixedWirelessInternetAccess;
    }

    public Integer getMaximumSpeedOfMobileInternetAccess() {
        return maximumSpeedOfMobileInternetAccess;
    }

    public void setMaximumSpeedOfMobileInternetAccess(Integer maximumSpeedOfMobileInternetAccess) {
        this.maximumSpeedOfMobileInternetAccess = maximumSpeedOfMobileInternetAccess;
    }
}
