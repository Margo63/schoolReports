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
    private Integer organizationType;

    @Column
    private Integer terrainType;

    public Integer getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(Integer organizationType) {
        this.organizationType = organizationType;
    }

    public Integer getTerrainType() {
        return terrainType;
    }

    public void setTerrainType(Integer terrainType) {
        this.terrainType = terrainType;
    }
}
