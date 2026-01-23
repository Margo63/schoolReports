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
    private Byte availabilityOfFixedTelephoneService;

    @Column
    private Byte emailAddress;

    @Column
    private Byte websiteOnTheInternet;

    @Column
    private Byte availabilityOfInformationOnTheWebsiteAboutOrganization;

    public Unit13() {
    }

    public Unit13(Long id) {
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Byte getAvailabilityOfFixedTelephoneService() {
        return availabilityOfFixedTelephoneService;
    }

    public void setAvailabilityOfFixedTelephoneService(Byte availabilityOfFixedTelephoneService) {
        this.availabilityOfFixedTelephoneService = availabilityOfFixedTelephoneService;
    }

    public Byte getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(Byte emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Byte getWebsiteOnTheInternet() {
        return websiteOnTheInternet;
    }

    public void setWebsiteOnTheInternet(Byte websiteOnTheInternet) {
        this.websiteOnTheInternet = websiteOnTheInternet;
    }

    public Byte getAvailabilityOfInformationOnTheWebsiteAboutOrganization() {
        return availabilityOfInformationOnTheWebsiteAboutOrganization;
    }

    public void setAvailabilityOfInformationOnTheWebsiteAboutOrganization(Byte availabilityOfInformationOnTheWebsiteAboutOrganization) {
        this.availabilityOfInformationOnTheWebsiteAboutOrganization = availabilityOfInformationOnTheWebsiteAboutOrganization;
    }
}
