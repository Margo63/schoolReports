package com.example.database.enteties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "unit2")
public class Unit2 {

    @Id
    private Long id;

    @Column
    private Integer personalizedFinancingOfChildrensAdditionalEducation;
    @Column
    private Integer newWageSystem;
    @Column
    private Integer theEducationalActivityLicense;

    public Unit2() {
    }

    public Unit2(Long id) {
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Integer getPersonalizedFinancingOfChildrensAdditionalEducation() {
        return personalizedFinancingOfChildrensAdditionalEducation;
    }

    public void setPersonalizedFinancingOfChildrensAdditionalEducation(Integer personalizedFinancingOfChildrensAdditionalEducation) {
        this.personalizedFinancingOfChildrensAdditionalEducation = personalizedFinancingOfChildrensAdditionalEducation;
    }

    public Integer getNewWageSystem() {
        return newWageSystem;
    }

    public void setNewWageSystem(Integer newWageSystem) {
        this.newWageSystem = newWageSystem;
    }

    public Integer getTheEducationalActivityLicense() {
        return theEducationalActivityLicense;
    }

    public void setTheEducationalActivityLicense(Integer theEducationalActivityLicense) {
        this.theEducationalActivityLicense = theEducationalActivityLicense;
    }
}
