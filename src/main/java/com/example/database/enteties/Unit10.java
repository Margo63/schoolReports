package com.example.database.enteties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "unit10")
public class Unit10 {

    @Id
    private Long id;

    @Column
    private int assemblyHallInOrganization;

    @Column
    private int assemblyHallThirdPartyOrganization;

    @Column
    private int concertHallInOrganization;

    @Column
    private int concertHallThirdPartyOrganization;

    @Column
    private int gameRoomInOrganization;

    @Column
    private int gameRoomThirdPartyOrganization;

    @Column
    private int trainingClassInOrganization;

    @Column
    private int trainingClassThirdPartyOrganization;

    @Column
    private int laboratoryInOrganization;

    @Column
    private int laboratoryThirdPartyOrganization;

    @Column
    private int workshopInOrganization;

    @Column
    private int workshopThirdPartyOrganization;

    @Column
    private int choreographyClassesInOrganization;

    @Column
    private int choreographyClassesThirdPartyOrganization;

    @Column
    private int choreographyClassesWithShowerInOrganization;

    @Column
    private int choreographyClassesWithShowerThirdPartyOrganization;

    @Column
    private int gymInOrganization;

    @Column
    private int gymThirdPartyOrganization;

    @Column
    private int gymWithShowerInOrganization;

    @Column
    private int gymWithShowerThirdPartyOrganization;

    @Column
    private int indoorSwimmingPoolInOrganization;

    @Column
    private int indoorSwimmingPoolThirdPartyOrganization;

    @Column
    private int lectureHallInOrganization;

    @Column
    private int lectureHallThirdPartyOrganization;

    @Column
    private int computerRoomInOrganization;

    @Column
    private int computerRoomThirdPartyOrganization;

    @Column
    private int medicalCenterInOrganization;

    @Column
    private int medicalCenterThirdPartyOrganization;

    @Column
    private int diningRoomInOrganization;

    @Column
    private int diningRoomThirdPartyOrganization;

    @Column
    private int museumInOrganization;

    @Column
    private int museumThirdPartyOrganization;

    @Column
    private int wildlifeCornerInOrganization;

    @Column
    private int wildlifeCornerThirdPartyOrganization;

    @Column
    private int climbingWallInOrganization;

    @Column
    private int climbingWallThirdPartyOrganization;

    @Column
    private int touristBaseInOrganization;

    @Column
    private int touristBaseThirdPartyOrganization;

    @Column
    private int libraryInOrganization;

    @Column
    private int libraryThirdPartyOrganization;
}
