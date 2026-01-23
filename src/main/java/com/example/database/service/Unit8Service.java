package com.example.database.service;

import com.example.database.dto.Unit8Response;
import com.example.database.enteties.Unit8;
import com.example.database.repositories.Unit8Repository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

@Service
public class Unit8Service {
    private final Unit8Repository unit8Repository;

    public Unit8Service(Unit8Repository unit8Repository) {
        this.unit8Repository = unit8Repository;
    }

    public void save(Unit8 unit8){
        unit8Repository.save(unit8);
    }

    public Unit8 findById(Long id) {
        return unit8Repository.findById(id).get();
    }
    public Unit8Response sumAllByOrganizationName(String organizationName) {
        List<Unit8> units = unit8Repository.findByOrganizationName(organizationName);

        return new Unit8Response(
                sumArrays(units, Unit8::getTheNumberOfEmployeesIsTotal),
                sumArrays(units, Unit8::getSeniorStaffTotal),
                sumArrays(units, Unit8::getSeniorStaff),
                sumArrays(units, Unit8::getDeputyHeads),
                sumArrays(units, Unit8::getBranchManager),
                sumArrays(units, Unit8::getTeachingStaffTotal),
                sumArrays(units, Unit8::getTeachersOfAdditionalEducation),
                sumArrays(units, Unit8::getTrainingAndSupportStaff),
                sumArrays(units, Unit8::getOtherStaff)
        );
    }
    private Long[] sumArrays(List<Unit8> units, Function<Unit8, Integer[]> arrayGetter) {
        Long[] result = new Long[11];
        Arrays.fill(result, 0L);

        for (Unit8 unit : units) {
            Integer[] array = arrayGetter.apply(unit);
            if (array != null) {
                for (int i = 0; i < 11 && i < array.length; i++) {
                    result[i] += array[i] != null ? array[i] : 0;
                }
            }
        }
        return result;
    }
}
