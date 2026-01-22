package com.example.database.enteties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "unit18")
public class Unit18 {
    @Id
    private Long id;

    @Column
    private Integer internalDigitalTechCostsTotal;
    @Column
    private Integer ownFunds;
    @Column
    private Integer budgetFunds;
    @Column
    private Integer otherAttractedFunds;

    public Unit18() {
    }

    public Unit18(Long id) {
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getInternalDigitalTechCostsTotal() {
        return internalDigitalTechCostsTotal;
    }

    public void setInternalDigitalTechCostsTotal(Integer internalDigitalTechCostsTotal) {
        this.internalDigitalTechCostsTotal = internalDigitalTechCostsTotal;
    }

    public Integer getOwnFunds() {
        return ownFunds;
    }

    public void setOwnFunds(Integer ownFunds) {
        this.ownFunds = ownFunds;
    }

    public Integer getBudgetFunds() {
        return budgetFunds;
    }

    public void setBudgetFunds(Integer budgetFunds) {
        this.budgetFunds = budgetFunds;
    }

    public Integer getOtherAttractedFunds() {
        return otherAttractedFunds;
    }

    public void setOtherAttractedFunds(Integer otherAttractedFunds) {
        this.otherAttractedFunds = otherAttractedFunds;
    }
}
