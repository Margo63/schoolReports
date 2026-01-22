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
    private Integer[] theAmountOfFundsReceived = new Integer[5];

    @Column
    private Integer[] includingFundsBudgetsOfAllLevelsTotal = new Integer[5];

    @Column
    private Integer[] includingTheBudgetOfFederal = new Integer[5];

    @Column
    private Integer[] includingTheBudgetOfTheSubjectOfTheRussiaFederation = new Integer[5];

    @Column
    private Integer[] localBudget = new Integer[5];

    @Column
    private Integer[] organizations = new Integer[5];

    @Column
    private Integer[] population = new Integer[5];

    @Column
    private Integer[] socialFunds = new Integer[5];

    @Column
    private Integer[] foreignSources = new Integer[5];

    @Column
    private Integer balanceBeginning;

    @Column
    private Integer balanceEnd;

    public Integer[] getTheAmountOfFundsReceived() {
        return theAmountOfFundsReceived;
    }

    public void setTheAmountOfFundsReceived(Integer[] theAmountOfFundsReceived) {
        this.theAmountOfFundsReceived = theAmountOfFundsReceived;
    }

    public Integer[] getIncludingFundsBudgetsOfAllLevelsTotal() {
        return includingFundsBudgetsOfAllLevelsTotal;
    }

    public void setIncludingFundsBudgetsOfAllLevelsTotal(Integer[] includingFundsBudgetsOfAllLevelsTotal) {
        this.includingFundsBudgetsOfAllLevelsTotal = includingFundsBudgetsOfAllLevelsTotal;
    }

    public Integer[] getIncludingTheBudgetOfFederal() {
        return includingTheBudgetOfFederal;
    }

    public void setIncludingTheBudgetOfFederal(Integer[] includingTheBudgetOfFederal) {
        this.includingTheBudgetOfFederal = includingTheBudgetOfFederal;
    }

    public Integer[] getIncludingTheBudgetOfTheSubjectOfTheRussiaFederation() {
        return includingTheBudgetOfTheSubjectOfTheRussiaFederation;
    }

    public void setIncludingTheBudgetOfTheSubjectOfTheRussiaFederation(Integer[] includingTheBudgetOfTheSubjectOfTheRussiaFederation) {
        this.includingTheBudgetOfTheSubjectOfTheRussiaFederation = includingTheBudgetOfTheSubjectOfTheRussiaFederation;
    }

    public Integer[] getLocalBudget() {
        return localBudget;
    }

    public void setLocalBudget(Integer[] localBudget) {
        this.localBudget = localBudget;
    }

    public Integer[] getOrganizations() {
        return organizations;
    }

    public void setOrganizations(Integer[] organizations) {
        this.organizations = organizations;
    }

    public Integer[] getPopulation() {
        return population;
    }

    public void setPopulation(Integer[] population) {
        this.population = population;
    }

    public Integer[] getSocialFunds() {
        return socialFunds;
    }

    public void setSocialFunds(Integer[] socialFunds) {
        this.socialFunds = socialFunds;
    }

    public Integer[] getForeignSources() {
        return foreignSources;
    }

    public void setForeignSources(Integer[] foreignSources) {
        this.foreignSources = foreignSources;
    }

    public Integer getBalanceBeginning() {
        return balanceBeginning;
    }

    public void setBalanceBeginning(Integer balanceBeginning) {
        this.balanceBeginning = balanceBeginning;
    }

    public Integer getBalanceEnd() {
        return balanceEnd;
    }

    public void setBalanceEnd(Integer balanceEnd) {
        this.balanceEnd = balanceEnd;
    }
}
