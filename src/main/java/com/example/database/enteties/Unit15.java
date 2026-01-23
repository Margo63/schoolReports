package com.example.database.enteties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "unit15")
public class Unit15 {
    @Id
    private Long id;

    @Column
    private String[] theAmountOfFundsReceived = new String[5];

    @Column
    private String[] includingFundsBudgetsOfAllLevelsTotal = new String[5];

    @Column
    private String[] includingTheBudgetOfFederal = new String[5];

    @Column
    private String[] includingTheBudgetOfTheSubjectOfTheRussiaFederation = new String[5];

    @Column
    private String[] localBudget = new String[5];

    @Column
    private String[] organizations = new String[5];

    @Column
    private String[] population = new String[5];

    @Column
    private String[] socialFunds = new String[5];

    @Column
    private String[] foreignSources = new String[5];

    @Column
    private String balanceBeginning;

    @Column
    private String balanceEnd;

    public Unit15() {
    }

    public Unit15(Long id) {
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String[] getTheAmountOfFundsReceived() {
        return theAmountOfFundsReceived;
    }

    public void setTheAmountOfFundsReceived(String[] theAmountOfFundsReceived) {
        this.theAmountOfFundsReceived = theAmountOfFundsReceived;
    }

    public String[] getIncludingFundsBudgetsOfAllLevelsTotal() {
        return includingFundsBudgetsOfAllLevelsTotal;
    }

    public void setIncludingFundsBudgetsOfAllLevelsTotal(String[] includingFundsBudgetsOfAllLevelsTotal) {
        this.includingFundsBudgetsOfAllLevelsTotal = includingFundsBudgetsOfAllLevelsTotal;
    }

    public String[] getIncludingTheBudgetOfFederal() {
        return includingTheBudgetOfFederal;
    }

    public void setIncludingTheBudgetOfFederal(String[] includingTheBudgetOfFederal) {
        this.includingTheBudgetOfFederal = includingTheBudgetOfFederal;
    }

    public String[] getIncludingTheBudgetOfTheSubjectOfTheRussiaFederation() {
        return includingTheBudgetOfTheSubjectOfTheRussiaFederation;
    }

    public void setIncludingTheBudgetOfTheSubjectOfTheRussiaFederation(String[] includingTheBudgetOfTheSubjectOfTheRussiaFederation) {
        this.includingTheBudgetOfTheSubjectOfTheRussiaFederation = includingTheBudgetOfTheSubjectOfTheRussiaFederation;
    }

    public String[] getLocalBudget() {
        return localBudget;
    }

    public void setLocalBudget(String[] localBudget) {
        this.localBudget = localBudget;
    }

    public String[] getOrganizations() {
        return organizations;
    }

    public void setOrganizations(String[] organizations) {
        this.organizations = organizations;
    }

    public String[] getPopulation() {
        return population;
    }

    public void setPopulation(String[] population) {
        this.population = population;
    }

    public String[] getSocialFunds() {
        return socialFunds;
    }

    public void setSocialFunds(String[] socialFunds) {
        this.socialFunds = socialFunds;
    }

    public String[] getForeignSources() {
        return foreignSources;
    }

    public void setForeignSources(String[] foreignSources) {
        this.foreignSources = foreignSources;
    }

    public String getBalanceBeginning() {
        return balanceBeginning;
    }

    public void setBalanceBeginning(String balanceBeginning) {
        this.balanceBeginning = balanceBeginning;
    }

    public String getBalanceEnd() {
        return balanceEnd;
    }

    public void setBalanceEnd(String balanceEnd) {
        this.balanceEnd = balanceEnd;
    }
}
