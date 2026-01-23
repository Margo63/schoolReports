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
    private String[] organizationBuildings = new String[13];

    @Column
    private String[] partOfTheBuilding = new String[13];

    public Unit9() {
    }

    public Unit9(Long id) {
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String[] getOrganizationBuildings() {
        return organizationBuildings;
    }

    public void setOrganizationBuildings(String[] organizationBuildings) {
        this.organizationBuildings = organizationBuildings;
    }

    public String[] getPartOfTheBuilding() {
        return partOfTheBuilding;
    }

    public void setPartOfTheBuilding(String[] partOfTheBuilding) {
        this.partOfTheBuilding = partOfTheBuilding;
    }
}
