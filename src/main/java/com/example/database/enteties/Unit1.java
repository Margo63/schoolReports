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
    private Double organizationType;

    @Column
    private Integer terrainType;


    public Unit1() {
    }

    public Unit1(Long id) {
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Double getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(Double organizationType) {
        this.organizationType = organizationType;
    }

    public Integer getTerrainType() {
        return terrainType;
    }

    public void setTerrainType(Integer terrainType) {
        this.terrainType = terrainType;
    }
}
