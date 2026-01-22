package com.example.database.dto;

public class ReferenceResponse {
    private Long id;

    public ReferenceResponse(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
