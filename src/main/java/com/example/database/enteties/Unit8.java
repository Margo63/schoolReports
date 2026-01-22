package com.example.database.enteties;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "unit8")
public class Unit8 {
    @Id
    private Long id;

    @Column
    private Integer[] theNumberOfEmployeesIsTotal = new Integer[11];

    @Column
    private Integer[] seniorStaffTotal = new Integer[11];

    @Column
    private Integer[] seniorStaff = new Integer[11];

    @Column
    private Integer[] deputyHeads = new Integer[11];

    @Column
    private Integer[] branchManager = new Integer[11];

    @Column
    private Integer[] teachingStaffTotal = new Integer[11];
    @Column
    private Integer[] teachersOfAdditionalEducation = new Integer[11];
    @Column
    private Integer[] trainingAndSupportStaff = new Integer[11];
    @Column
    private Integer[] otherStaff = new Integer[11];

    public Unit8() {
    }

    public Unit8(Long id) {
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Integer[] getTheNumberOfEmployeesIsTotal() {
        return theNumberOfEmployeesIsTotal;
    }

    public void setTheNumberOfEmployeesIsTotal(Integer[] theNumberOfEmployeesIsTotal) {
        this.theNumberOfEmployeesIsTotal = theNumberOfEmployeesIsTotal;
    }

    public Integer[] getSeniorStaffTotal() {
        return seniorStaffTotal;
    }

    public void setSeniorStaffTotal(Integer[] seniorStaffTotal) {
        this.seniorStaffTotal = seniorStaffTotal;
    }

    public Integer[] getSeniorStaff() {
        return seniorStaff;
    }

    public void setSeniorStaff(Integer[] seniorStaff) {
        this.seniorStaff = seniorStaff;
    }

    public Integer[] getDeputyHeads() {
        return deputyHeads;
    }

    public void setDeputyHeads(Integer[] deputyHeads) {
        this.deputyHeads = deputyHeads;
    }

    public Integer[] getBranchManager() {
        return branchManager;
    }

    public void setBranchManager(Integer[] branchManager) {
        this.branchManager = branchManager;
    }

    public Integer[] getTeachingStaffTotal() {
        return teachingStaffTotal;
    }

    public void setTeachingStaffTotal(Integer[] teachingStaffTotal) {
        this.teachingStaffTotal = teachingStaffTotal;
    }

    public Integer[] getTeachersOfAdditionalEducation() {
        return teachersOfAdditionalEducation;
    }

    public void setTeachersOfAdditionalEducation(Integer[] teachersOfAdditionalEducation) {
        this.teachersOfAdditionalEducation = teachersOfAdditionalEducation;
    }

    public Integer[] getTrainingAndSupportStaff() {
        return trainingAndSupportStaff;
    }

    public void setTrainingAndSupportStaff(Integer[] trainingAndSupportStaff) {
        this.trainingAndSupportStaff = trainingAndSupportStaff;
    }

    public Integer[] getOtherStaff() {
        return otherStaff;
    }

    public void setOtherStaff(Integer[] otherStaff) {
        this.otherStaff = otherStaff;
    }
}
