package com.example.database.enteties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "unit17")
public class Unit17 {
    @Id
    private Long id;

    @Column
    private Integer totalDigitalTechCostsTotal;
    @Column
    private Integer internalDigitalTechCosts;
    @Column
    private Integer externalDigitalTechCosts;

    @Column
    private Integer securityProductsServices;

    public Integer getTotalDigitalTechCostsTotal() {
        return totalDigitalTechCostsTotal;
    }

    public void setTotalDigitalTechCostsTotal(Integer totalDigitalTechCostsTotal) {
        this.totalDigitalTechCostsTotal = totalDigitalTechCostsTotal;
    }

    public Integer getInternalDigitalTechCosts() {
        return internalDigitalTechCosts;
    }

    public void setInternalDigitalTechCosts(Integer internalDigitalTechCosts) {
        this.internalDigitalTechCosts = internalDigitalTechCosts;
    }

    public Integer getExternalDigitalTechCosts() {
        return externalDigitalTechCosts;
    }

    public void setExternalDigitalTechCosts(Integer externalDigitalTechCosts) {
        this.externalDigitalTechCosts = externalDigitalTechCosts;
    }

    public Integer getSecurityProductsServices() {
        return securityProductsServices;
    }

    public void setSecurityProductsServices(Integer securityProductsServices) {
        this.securityProductsServices = securityProductsServices;
    }
}
