package com.example.database.service;

import com.example.database.dto.Unit6Response;
import com.example.database.enteties.Unit6;
import com.example.database.repositories.Unit6Repository;
import org.springframework.stereotype.Service;

@Service
public class Unit6Service {
    private final Unit6Repository unit6Repository;

    public Unit6Service(Unit6Repository unit6Repository) {
        this.unit6Repository = unit6Repository;
    }

    public void save(Unit6 unit6){
        unit6Repository.save(unit6);
    }

    public Unit6 findById(Long id) {
        return unit6Repository.findById(id).get();
    }
    public Unit6Response sumAllByOrganizationName(String organizationName){
        return unit6Repository.sumAllByOrganizationName(organizationName);
    }

}
