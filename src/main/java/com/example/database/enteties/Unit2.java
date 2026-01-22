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
    private int participatesInTheMechanismOfPersonalizedFinancingOfChildrensAdditionalEducation;
    @Column
    private int newWageSystem;
    @Column
    private int theEducationalActivityLicense;
}
