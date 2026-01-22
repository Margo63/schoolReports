package com.example.database.enteties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "contact_info")
public class ContactInformation {
    @Id
    private Long id;
    @Column(length = 200)
    private String position;

    @Column(length = 150)
    private String fullName;

    @Column(length = 20)
    private String phoneNumber;

    @Column(length = 100)
    private String email;

    @Column(length = 2)
    private String documentDay;

    @Column(length = 2)
    private String documentMonth;

    @Column(length = 2)
    private String documentYear;

    public ContactInformation() {
    }

    public ContactInformation(Long id) {
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocumentDay() {
        return documentDay;
    }

    public void setDocumentDay(String documentDay) {
        this.documentDay = documentDay;
    }

    public String getDocumentMonth() {
        return documentMonth;
    }

    public void setDocumentMonth(String documentMonth) {
        this.documentMonth = documentMonth;
    }

    public String getDocumentYear() {
        return documentYear;
    }

    public void setDocumentYear(String documentYear) {
        this.documentYear = documentYear;
    }
}
