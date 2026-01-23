package com.example.database.service;

import com.example.database.dto.Unit3And5Response;
import com.example.database.enteties.Unit3;
import com.example.database.repositories.Unit3Repository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

@Service
public class Unit3Service {
    private final Unit3Repository unit3Repository;

    public Unit3Service(Unit3Repository unit3Repository) {
        this.unit3Repository = unit3Repository;
    }

    public void save(Unit3 unit3){
        unit3Repository.save(unit3);
    }

    public Unit3 findById(Long id) {
        return unit3Repository.findById(id).get();
    }
    public Unit3And5Response sumAllByOrganizationName(String organizationName) {
        List<Unit3> units = unit3Repository.findByOrganizationName(organizationName);

        return new Unit3And5Response(
                sumArrays(units, Unit3::getTechnical),
                sumArrays(units, Unit3::getNaturalScience),
                sumArrays(units, Unit3::getTourismAndLocalHistory),
                sumArrays(units, Unit3::getSocialAndHumanitarian),
                sumArrays(units, Unit3::getArtisticOrientation),
                sumArrays(units, Unit3::getPhysicalEducationAndSports),
                sumArrays(units, Unit3::getPreprofessionalProgramsInTheFieldOfArts),
                sumArrays(units, Unit3::getAdditionalEducationalProgramsSportsTraining)
        );
    }

    private Long[] sumArrays(List<Unit3> units, Function<Unit3, Integer[]> arrayGetter) {
        Long[] result = new Long[16];
        Arrays.fill(result, 0L);

        for (Unit3 unit : units) {
            Integer[] array = arrayGetter.apply(unit);
            if (array != null) {
                for (int i = 0; i < 16 && i < array.length; i++) {
                    result[i] += array[i] != null ? array[i] : 0;
                }
            }
        }
        return result;
    }



}
