package com.example.database.service;

import com.example.database.dto.Unit4Response;
import com.example.database.enteties.Unit4;
import com.example.database.repositories.Unit4Repository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

@Service
public class Unit4Service {
    private final Unit4Repository unit4Repository;

    public Unit4Service(Unit4Repository unit4Repository) {
        this.unit4Repository = unit4Repository;
    }

    public void save(Unit4 unit4){
        unit4Repository.save(unit4);
    }

    public Unit4 findById(Long id) {
        return unit4Repository.findById(id).get();
    }
    public Unit4Response sumAllByOrganizationName(String organizationName) {
        List<Unit4> units = unit4Repository.findByOrganizationName(organizationName);

        return new Unit4Response(
                sumArrays(units, Unit4::getTechnical),
                sumArrays(units, Unit4::getNaturalScience),
                sumArrays(units, Unit4::getTourismAndLocalHistory),
                sumArrays(units, Unit4::getSocialAndHumanitarian),
                sumArrays(units, Unit4::getArtisticOrientation),
                sumArrays(units, Unit4::getPhysicalEducationAndSports),
                sumArrays(units, Unit4::getPreprofessionalProgramsInTheFieldOfArts),
                sumArrays(units, Unit4::getAdditionalEducationalProgramsSportsTraining),
                sumArrays(units, Unit4::getNumberOfStudentsAdditionalGeneralEducationPrograms)
        );
    }

    private Long[] sumArrays(List<Unit4> units, Function<Unit4, Integer[]> arrayGetter) {
        Long[] result = new Long[17];
        Arrays.fill(result, 0L);

        for (Unit4 unit : units) {
            Integer[] array = arrayGetter.apply(unit);
            if (array != null) {
                for (int i = 0; i < 17 && i < array.length; i++) {
                    result[i] += array[i] != null ? array[i] : 0;
                }
            }
        }
        return result;
    }
}
