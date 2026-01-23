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
    private String[] totalAreaOfBuildingsTotal = new String[6];

    @Column
    private String[] theAreaForEducationalActivities = new String[6];

    @Column
    private String[] theAreaOfThePremisesForStudentsLeisureActivities = new String[6];

    @Column
    private String[] totalLandArea = new String[6];

    @Column
    private String[] theAreaOfTheSportsGround = new String[6];

    @Column
    private String[] theAreaOfTheTrainingAndExperimentalSite = new String[6];

    public Unit11() {
    }

    public Unit11(Long id) {
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String[] getTotalAreaOfBuildingsTotal() {
        return totalAreaOfBuildingsTotal;
    }

    public void setTotalAreaOfBuildingsTotal(String[] totalAreaOfBuildingsTotal) {
        this.totalAreaOfBuildingsTotal = totalAreaOfBuildingsTotal;
    }

    public String[] getTheAreaForEducationalActivities() {
        return theAreaForEducationalActivities;
    }

    public void setTheAreaForEducationalActivities(String[] theAreaForEducationalActivities) {
        this.theAreaForEducationalActivities = theAreaForEducationalActivities;
    }

    public String[] getTheAreaOfThePremisesForStudentsLeisureActivities() {
        return theAreaOfThePremisesForStudentsLeisureActivities;
    }

    public void setTheAreaOfThePremisesForStudentsLeisureActivities(String[] theAreaOfThePremisesForStudentsLeisureActivities) {
        this.theAreaOfThePremisesForStudentsLeisureActivities = theAreaOfThePremisesForStudentsLeisureActivities;
    }

    public String[] getTotalLandArea() {
        return totalLandArea;
    }

    public void setTotalLandArea(String[] totalLandArea) {
        this.totalLandArea = totalLandArea;
    }

    public String[] getTheAreaOfTheSportsGround() {
        return theAreaOfTheSportsGround;
    }

    public void setTheAreaOfTheSportsGround(String[] theAreaOfTheSportsGround) {
        this.theAreaOfTheSportsGround = theAreaOfTheSportsGround;
    }

    public String[] getTheAreaOfTheTrainingAndExperimentalSite() {
        return theAreaOfTheTrainingAndExperimentalSite;
    }

    public void setTheAreaOfTheTrainingAndExperimentalSite(String[] theAreaOfTheTrainingAndExperimentalSite) {
        this.theAreaOfTheTrainingAndExperimentalSite = theAreaOfTheTrainingAndExperimentalSite;
    }
}
