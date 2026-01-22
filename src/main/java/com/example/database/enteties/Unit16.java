package com.example.database.enteties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "unit16")
public class Unit16 {
    @Id
    private Long id;

    @Column
    private Integer totalExpensesTotal;

    @Column
    private Integer totalExpensesBudget;

    @Column
    private Integer paymentOfLaborTotal;

    @Column
    private Integer paymentOfLaborBudget;

    @Column
    private Integer paymentForWorkTotal;

    @Column
    private Integer paymentForWorkBudget;

    @Column
    private Integer socialSecurityTotal;

    @Column
    private Integer socialSecurityBudget;

    @Column
    private Integer otherExpensesTotal;

    @Column
    private Integer otherExpensesBudget;

    @Column
    private Integer receiptOfNonFinancialAssetsTotal;

    @Column
    private Integer receiptOfNonFinancialAssetsBudget;

    public Integer getTotalExpensesTotal() {
        return totalExpensesTotal;
    }

    public void setTotalExpensesTotal(Integer totalExpensesTotal) {
        this.totalExpensesTotal = totalExpensesTotal;
    }

    public Integer getTotalExpensesBudget() {
        return totalExpensesBudget;
    }

    public void setTotalExpensesBudget(Integer totalExpensesBudget) {
        this.totalExpensesBudget = totalExpensesBudget;
    }

    public Integer getPaymentOfLaborTotal() {
        return paymentOfLaborTotal;
    }

    public void setPaymentOfLaborTotal(Integer paymentOfLaborTotal) {
        this.paymentOfLaborTotal = paymentOfLaborTotal;
    }

    public Integer getPaymentOfLaborBudget() {
        return paymentOfLaborBudget;
    }

    public void setPaymentOfLaborBudget(Integer paymentOfLaborBudget) {
        this.paymentOfLaborBudget = paymentOfLaborBudget;
    }

    public Integer getPaymentForWorkTotal() {
        return paymentForWorkTotal;
    }

    public void setPaymentForWorkTotal(Integer paymentForWorkTotal) {
        this.paymentForWorkTotal = paymentForWorkTotal;
    }

    public Integer getPaymentForWorkBudget() {
        return paymentForWorkBudget;
    }

    public void setPaymentForWorkBudget(Integer paymentForWorkBudget) {
        this.paymentForWorkBudget = paymentForWorkBudget;
    }

    public Integer getSocialSecurityTotal() {
        return socialSecurityTotal;
    }

    public void setSocialSecurityTotal(Integer socialSecurityTotal) {
        this.socialSecurityTotal = socialSecurityTotal;
    }

    public Integer getSocialSecurityBudget() {
        return socialSecurityBudget;
    }

    public void setSocialSecurityBudget(Integer socialSecurityBudget) {
        this.socialSecurityBudget = socialSecurityBudget;
    }

    public Integer getOtherExpensesTotal() {
        return otherExpensesTotal;
    }

    public void setOtherExpensesTotal(Integer otherExpensesTotal) {
        this.otherExpensesTotal = otherExpensesTotal;
    }

    public Integer getOtherExpensesBudget() {
        return otherExpensesBudget;
    }

    public void setOtherExpensesBudget(Integer otherExpensesBudget) {
        this.otherExpensesBudget = otherExpensesBudget;
    }

    public Integer getReceiptOfNonFinancialAssetsTotal() {
        return receiptOfNonFinancialAssetsTotal;
    }

    public void setReceiptOfNonFinancialAssetsTotal(Integer receiptOfNonFinancialAssetsTotal) {
        this.receiptOfNonFinancialAssetsTotal = receiptOfNonFinancialAssetsTotal;
    }

    public Integer getReceiptOfNonFinancialAssetsBudget() {
        return receiptOfNonFinancialAssetsBudget;
    }

    public void setReceiptOfNonFinancialAssetsBudget(Integer receiptOfNonFinancialAssetsBudget) {
        this.receiptOfNonFinancialAssetsBudget = receiptOfNonFinancialAssetsBudget;
    }
}
