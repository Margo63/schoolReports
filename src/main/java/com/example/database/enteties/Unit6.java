package com.example.database.enteties;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "unit6")
public class Unit6 {
    @Id
    private Long id;

    @Column
    private Integer hiking;

    @Column
    private Integer excursions;

    @Column
    private Integer inFieldExpeditions;

    public Unit6() {
    }

    public Unit6(Long id) {
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Integer getHiking() {
        return hiking;
    }

    public void setHiking(Integer hiking) {
        this.hiking = hiking;
    }

    public Integer getExcursions() {
        return excursions;
    }

    public void setExcursions(Integer excursions) {
        this.excursions = excursions;
    }

    public Integer getInFieldExpeditions() {
        return inFieldExpeditions;
    }

    public void setInFieldExpeditions(Integer inFieldExpeditions) {
        this.inFieldExpeditions = inFieldExpeditions;
    }
}
