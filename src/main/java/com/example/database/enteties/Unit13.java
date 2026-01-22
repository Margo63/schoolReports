package com.example.database.enteties;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "unit13")
public class Unit13 {

    @Id
    private Long id;

    @Column
    private int availabilityOfFixedTelephoneService;

    @Column
    private int emailAddress;

    @Column
    private int websiteOnTheInternet;

    @Column
    private int availabilityOfInformationOnTheWebsiteOnALegallyFixedListOfInformationAboutOrganizationsActivities;


}
