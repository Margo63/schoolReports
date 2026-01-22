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
    private int[] theNumberOfEmployeesIsTotal = new int[11];

    @Column
    private int[] seniorStaffTotal = new int[11];

    @Column
    private int[] seniorStaff = new int[11];

    @Column
    private int[] deputyHeads = new int[11];

    @Column
    private int[] branchManager = new int[11];

    @Column
    private int[] teachingStaffTotal = new int[11];
    @Column
    private int[] teachersOfAdditionalEducation = new int[11];
    @Column
    private int[] trainingAndSupportStaff = new int[11];
    @Column
    private int[] otherStaff = new int[11];
}
