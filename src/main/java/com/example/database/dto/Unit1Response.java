package com.example.database.dto;

public class Unit1Response {
    private final Long totalOrgType;
    private final Long totalTerrainType;


    public Unit1Response(Long totalOrgType, Long totalTerrainType) {
        this.totalOrgType = totalOrgType;
        this.totalTerrainType = totalTerrainType;
    }

    public Long getTotalOrgType() { return totalOrgType; }
    public Long getTotalTerrainType() { return totalTerrainType; }
}