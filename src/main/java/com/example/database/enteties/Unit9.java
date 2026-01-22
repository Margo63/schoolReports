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
    private Integer[] organizationBuildings = new Integer[13];

    @Column
    private Integer[] partOfTheBuilding = new Integer[13];

    public Integer[] getOrganizationBuildings() {
        return organizationBuildings;
    }

    public void setOrganizationBuildings(Integer[] organizationBuildings) {
        this.organizationBuildings = organizationBuildings;
    }

    public Integer[] getPartOfTheBuilding() {
        return partOfTheBuilding;
    }

    public void setPartOfTheBuilding(Integer[] partOfTheBuilding) {
        this.partOfTheBuilding = partOfTheBuilding;
    }
}
