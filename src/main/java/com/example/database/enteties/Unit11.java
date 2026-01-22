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
    private Integer[] totalAreaOfBuildingsTotal = new Integer[6];

    @Column
    private Integer[] theAreaForEducationalActivities = new Integer[6];

    @Column
    private Integer[] theAreaOfThePremisesForStudentsLeisureActivities = new Integer[6];

    @Column
    private Integer[] totalLandArea = new Integer[6];

    @Column
    private Integer[] theAreaOfTheSportsGround = new Integer[6];

    @Column
    private Integer[] theAreaOfTheTrainingAndExperimentalSite = new Integer[6];

    public Unit11() {
    }

    public Unit11(Long id) {
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Integer[] getTotalAreaOfBuildingsTotal() {
        return totalAreaOfBuildingsTotal;
    }

    public void setTotalAreaOfBuildingsTotal(Integer[] totalAreaOfBuildingsTotal) {
        this.totalAreaOfBuildingsTotal = totalAreaOfBuildingsTotal;
    }

    public Integer[] getTheAreaForEducationalActivities() {
        return theAreaForEducationalActivities;
    }

    public void setTheAreaForEducationalActivities(Integer[] theAreaForEducationalActivities) {
        this.theAreaForEducationalActivities = theAreaForEducationalActivities;
    }

    public Integer[] getTheAreaOfThePremisesForStudentsLeisureActivities() {
        return theAreaOfThePremisesForStudentsLeisureActivities;
    }

    public void setTheAreaOfThePremisesForStudentsLeisureActivities(Integer[] theAreaOfThePremisesForStudentsLeisureActivities) {
        this.theAreaOfThePremisesForStudentsLeisureActivities = theAreaOfThePremisesForStudentsLeisureActivities;
    }

    public Integer[] getTotalLandArea() {
        return totalLandArea;
    }

    public void setTotalLandArea(Integer[] totalLandArea) {
        this.totalLandArea = totalLandArea;
    }

    public Integer[] getTheAreaOfTheSportsGround() {
        return theAreaOfTheSportsGround;
    }

    public void setTheAreaOfTheSportsGround(Integer[] theAreaOfTheSportsGround) {
        this.theAreaOfTheSportsGround = theAreaOfTheSportsGround;
    }

    public Integer[] getTheAreaOfTheTrainingAndExperimentalSite() {
        return theAreaOfTheTrainingAndExperimentalSite;
    }

    public void setTheAreaOfTheTrainingAndExperimentalSite(Integer[] theAreaOfTheTrainingAndExperimentalSite) {
        this.theAreaOfTheTrainingAndExperimentalSite = theAreaOfTheTrainingAndExperimentalSite;
    }
}
