package com.example.database.enteties;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "unit4")
public class Unit4 {

    @Id
    private Long id;

    @Column
    private int[] technical = new int[17];
    @Column
    private int[] naturalScience = new int[17];
    @Column
    private int[] tourismAndLocalHistory = new int[17];
    @Column
    private int[] socialAndHumanitarian = new int[17];
    @Column
    private int[] artisticOrientation = new int[17];
    @Column
    private int[] physicalEducationAndSports = new int[17];

    @Column
    private int[] preprofessionalProgramsInTheFieldOfArts = new int[17];
    @Column
    private int[] additionalEducationalProgramsSportsTraining = new int[17];
    @Column
    private int[] numberOfStudentsInTheOrganizationOfAdditionalGeneralEducationPrograms = new int[17];


}
