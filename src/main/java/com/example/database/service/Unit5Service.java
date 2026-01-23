package com.example.database.service;

import com.example.database.dto.Unit3And5Response;
import com.example.database.enteties.Unit5;
import com.example.database.repositories.Unit5Repository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

@Service
public class Unit5Service {
    private final Unit5Repository unit5Repository;
    public Unit5Service(Unit5Repository unit5Repository) {
        this.unit5Repository = unit5Repository;
    }

    public void save(Unit5 unit5){
        unit5Repository.save(unit5);
    }

    public Unit5 findById(Long id) {
        return unit5Repository.findById(id).get();
    }
    public Unit3And5Response sumAllByOrganizationName(String organizationName) {
        List<Unit5> units = unit5Repository.findByOrganizationName(organizationName);

        return new Unit3And5Response(
                sumArrays(units, Unit5::getTechnical),
                sumArrays(units, Unit5::getNaturalScience),
                sumArrays(units, Unit5::getTourismAndLocalHistory),
                sumArrays(units, Unit5::getSocialAndHumanitarian),
                sumArrays(units, Unit5::getArtisticOrientation),
                sumArrays(units, Unit5::getPhysicalEducationAndSports),
                sumArrays(units, Unit5::getPreprofessionalProgramsInTheFieldOfArts),
                sumArrays(units, Unit5::getAdditionalEducationalProgramsSportsTraining)
        );
    }

    private Long[] sumArrays(List<Unit5> units, Function<Unit5, Integer[]> arrayGetter) {
        Long[] result = new Long[5];
        Arrays.fill(result, 0L);

        for (Unit5 unit : units) {
            Integer[] array = arrayGetter.apply(unit);
            if (array != null) {
                for (int i = 0; i < 5 && i < array.length; i++) {
                    result[i] += array[i] != null ? array[i] : 0;
                }
            }
        }
        return result;
    }
}
