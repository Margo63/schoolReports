package com.example.database.enteties;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "unit5")
public class Unit5 {
    @Id
    private Long id;

    @Column
    private int[] technical = new int[5];
    @Column
    private int[] naturalScience = new int[5];

    @Column
    private int[] tourismAndLocalHistory = new int[5];
    @Column
    private int[] socialAndHumanitarian = new int[5];
    @Column
    private int[] artisticOrientation = new int[5];
    @Column
    private int[] physicalEducationAndSports = new int[5];

    @Column
    private int[] preprofessionalProgramsInTheFieldOfArts = new int[5];
    @Column
    private int[] additionalEducationalProgramsSportsTraining = new int[5];
}
