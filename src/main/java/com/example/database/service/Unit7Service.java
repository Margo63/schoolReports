package com.example.database.service;

import com.example.database.dto.Unit7Response;
import com.example.database.enteties.Unit7;
import com.example.database.repositories.Unit7Repository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

@Service
public class Unit7Service {
    private final Unit7Repository unit7Repository;

    public Unit7Service(Unit7Repository unit7Repository) {
        this.unit7Repository = unit7Repository;
    }

    public void save(Unit7 unit7){
        unit7Repository.save(unit7);
    }

    public Unit7 findById(Long id) {
        return unit7Repository.findById(id).get();
    }
    public Unit7Response sumAllByOrganizationName(String organizationName) {
        List<Unit7> units = unit7Repository.findByOrganizationName(organizationName);

        return new Unit7Response(
                sumArrays(units, Unit7::getTheNumberOfEmployeesIsTotal),
                sumArrays(units, Unit7::getSeniorStaffTotal),
                sumArrays(units, Unit7::getSeniorStaff),
                sumArrays(units, Unit7::getDeputyHeads),
                sumArrays(units, Unit7::getBranchManager),
                sumArrays(units, Unit7::getTeachingStaffTotal),
                sumArrays(units, Unit7::getTeachersOfAdditionalEducation),
                sumArrays(units, Unit7::getTrainingAndSupportStaff),
                sumArrays(units, Unit7::getOtherStaff),
                sum(units)
        );
    }
    private Long sum(List<Unit7> units){
        Long result = 0L;
        for (Unit7 unit : units) {
            Integer el = unit.getProfessionalDevelopment();
            if (el != null) result += el;


        }
        return result;
    }
    private Long[] sumArrays(List<Unit7> units, Function<Unit7, Integer[]> arrayGetter) {
        Long[] result = new Long[11];
        Arrays.fill(result, 0L);

        for (Unit7 unit : units) {
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
