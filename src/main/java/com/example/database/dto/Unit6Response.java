package com.example.database.dto;

import jakarta.persistence.Column;

public class Unit6Response {
    private Long hiking;
    private Long excursions;
    private Long inFieldExpeditions;

    public Unit6Response(Long hiking, Long excursions, Long inFieldExpeditions) {
        this.hiking = hiking;
        this.excursions = excursions;
        this.inFieldExpeditions = inFieldExpeditions;
    }

    public Long getHiking() {
        return hiking;
    }

    public Long getExcursions() {
        return excursions;
    }

    public Long getInFieldExpeditions() {
        return inFieldExpeditions;
    }
}
