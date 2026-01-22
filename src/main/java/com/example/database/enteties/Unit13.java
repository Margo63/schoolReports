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
    private Integer availabilityOfFixedTelephoneService;

    @Column
    private Integer emailAddress;

    @Column
    private Integer websiteOnTheInternet;

    @Column
    private Integer availabilityOfInformationOnTheWebsiteOnALegallyFixedListOfInformationAboutOrganizationsActivities;


    public Integer getAvailabilityOfFixedTelephoneService() {
        return availabilityOfFixedTelephoneService;
    }

    public void setAvailabilityOfFixedTelephoneService(Integer availabilityOfFixedTelephoneService) {
        this.availabilityOfFixedTelephoneService = availabilityOfFixedTelephoneService;
    }

    public Integer getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(Integer emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Integer getWebsiteOnTheInternet() {
        return websiteOnTheInternet;
    }

    public void setWebsiteOnTheInternet(Integer websiteOnTheInternet) {
        this.websiteOnTheInternet = websiteOnTheInternet;
    }

    public Integer getAvailabilityOfInformationOnTheWebsiteOnALegallyFixedListOfInformationAboutOrganizationsActivities() {
        return availabilityOfInformationOnTheWebsiteOnALegallyFixedListOfInformationAboutOrganizationsActivities;
    }

    public void setAvailabilityOfInformationOnTheWebsiteOnALegallyFixedListOfInformationAboutOrganizationsActivities(Integer availabilityOfInformationOnTheWebsiteOnALegallyFixedListOfInformationAboutOrganizationsActivities) {
        this.availabilityOfInformationOnTheWebsiteOnALegallyFixedListOfInformationAboutOrganizationsActivities = availabilityOfInformationOnTheWebsiteOnALegallyFixedListOfInformationAboutOrganizationsActivities;
    }
}
