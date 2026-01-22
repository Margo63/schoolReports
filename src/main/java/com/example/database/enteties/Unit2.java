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
    private Integer participatesInTheMechanismOfPersonalizedFinancingOfChildrensAdditionalEducation;
    @Column
    private Integer newWageSystem;
    @Column
    private Integer theEducationalActivityLicense;

    public Integer getParticipatesInTheMechanismOfPersonalizedFinancingOfChildrensAdditionalEducation() {
        return participatesInTheMechanismOfPersonalizedFinancingOfChildrensAdditionalEducation;
    }

    public void setParticipatesInTheMechanismOfPersonalizedFinancingOfChildrensAdditionalEducation(Integer participatesInTheMechanismOfPersonalizedFinancingOfChildrensAdditionalEducation) {
        this.participatesInTheMechanismOfPersonalizedFinancingOfChildrensAdditionalEducation = participatesInTheMechanismOfPersonalizedFinancingOfChildrensAdditionalEducation;
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
