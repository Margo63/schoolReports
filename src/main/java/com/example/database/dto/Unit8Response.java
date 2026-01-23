package com.example.database.dto;

import jakarta.persistence.Column;

public class Unit8Response {

    private Long[] theNumberOfEmployeesIsTotal;
    private Long[] seniorStaffTotal;
    private Long[] seniorStaff;
    private Long[] deputyHeads ;
    private Long[] branchManager;
    private Long[] teachingStaffTotal;
    private Long[] teachersOfAdditionalEducation;
    private Long[] trainingAndSupportStaff;
    private Long[] otherStaff;

    public Unit8Response(Long[] theNumberOfEmployeesIsTotal, Long[] seniorStaffTotal, Long[] seniorStaff, Long[] deputyHeads, Long[] branchManager, Long[] teachingStaffTotal, Long[] teachersOfAdditionalEducation, Long[] trainingAndSupportStaff, Long[] otherStaff) {
        this.theNumberOfEmployeesIsTotal = theNumberOfEmployeesIsTotal;
        this.seniorStaffTotal = seniorStaffTotal;
        this.seniorStaff = seniorStaff;
        this.deputyHeads = deputyHeads;
        this.branchManager = branchManager;
        this.teachingStaffTotal = teachingStaffTotal;
        this.teachersOfAdditionalEducation = teachersOfAdditionalEducation;
        this.trainingAndSupportStaff = trainingAndSupportStaff;
        this.otherStaff = otherStaff;
    }

    public Long[] getTheNumberOfEmployeesIsTotal() {
        return theNumberOfEmployeesIsTotal;
    }

    public Long[] getSeniorStaffTotal() {
        return seniorStaffTotal;
    }

    public Long[] getSeniorStaff() {
        return seniorStaff;
    }

    public Long[] getDeputyHeads() {
        return deputyHeads;
    }

    public Long[] getBranchManager() {
        return branchManager;
    }

    public Long[] getTeachingStaffTotal() {
        return teachingStaffTotal;
    }

    public Long[] getTeachersOfAdditionalEducation() {
        return teachersOfAdditionalEducation;
    }

    public Long[] getTrainingAndSupportStaff() {
        return trainingAndSupportStaff;
    }

    public Long[] getOtherStaff() {
        return otherStaff;
    }
}
