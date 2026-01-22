package com.example.database.enteties;

import jakarta.persistence.*;

import java.sql.Date;


@Entity
@Table(name = "main_info")
public class MainInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500)
    private String organizationName;

    @Column(length = 300)
    private String postalAddress;

    @Column(length = 20)
    private String okudFormCode;

    @Column(length = 20)
    private String okpoOrgCode;

    @Column()
    private Date changeDate1;

    @Column(length = 50)
    private String changeNumber1;

    @Column()
    private Date changeDate2;

    @Column(length = 50)
    private String changeNumber2;

    public Long getId() {
        return id;
    }


    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public String getOkudFormCode() {
        return okudFormCode;
    }

    public void setOkudFormCode(String okudFormCode) {
        this.okudFormCode = okudFormCode;
    }

    public String getOkpoOrgCode() {
        return okpoOrgCode;
    }

    public void setOkpoOrgCode(String okpoOrgCode) {
        this.okpoOrgCode = okpoOrgCode;
    }

    public Date getChangeDate1() {
        return changeDate1;
    }

    public void setChangeDate1(Date changeDate1) {
        this.changeDate1 = changeDate1;
    }

    public String getChangeNumber1() {
        return changeNumber1;
    }

    public void setChangeNumber1(String changeNumber1) {
        this.changeNumber1 = changeNumber1;
    }

    public Date getChangeDate2() {
        return changeDate2;
    }

    public void setChangeDate2(Date changeDate2) {
        this.changeDate2 = changeDate2;
    }

    public String getChangeNumber2() {
        return changeNumber2;
    }

    public void setChangeNumber2(String changeNumber2) {
        this.changeNumber2 = changeNumber2;
    }
}
