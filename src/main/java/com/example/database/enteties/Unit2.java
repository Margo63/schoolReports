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
    private Byte personalizedFinancingOfChildrensAdditionalEducation;
    @Column
    private Byte newWageSystem;
    @Column
    private Byte theEducationalActivityLicense;

    public Unit2() {
    }

    public Unit2(Long id) {
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Byte getPersonalizedFinancingOfChildrensAdditionalEducation() {
        return personalizedFinancingOfChildrensAdditionalEducation;
    }

    public void setPersonalizedFinancingOfChildrensAdditionalEducation(Byte personalizedFinancingOfChildrensAdditionalEducation) {
        this.personalizedFinancingOfChildrensAdditionalEducation = personalizedFinancingOfChildrensAdditionalEducation;
    }

    public Byte getNewWageSystem() {
        return newWageSystem;
    }

    public void setNewWageSystem(Byte newWageSystem) {
        this.newWageSystem = newWageSystem;
    }

    public Byte getTheEducationalActivityLicense() {
        return theEducationalActivityLicense;
    }

    public void setTheEducationalActivityLicense(Byte theEducationalActivityLicense) {
        this.theEducationalActivityLicense = theEducationalActivityLicense;
    }
}
