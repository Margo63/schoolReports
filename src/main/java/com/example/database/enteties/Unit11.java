package com.example.database.enteties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "unit11")
public class Unit11 {

    @Id
    private Long id;

    @Column
    private int[] totalAreaOfBuildingsTotal = new int[6];

    @Column
    private int[] theAreaOfThePremisesForTheImplementationOfEducationalActivities = new int[6];

    @Column
    private int[] theAreaOfThePremisesForStudentsLeisureActivities = new int[6];

    @Column
    private int[] totalLandArea = new int[6];

    @Column
    private int[] theAreaOfTheSportsGround = new int[6];

    @Column
    private int[] theAreaOfTheTrainingAndExperimentalSite = new int[6];
}
