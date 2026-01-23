package com.example.database.dto;

import jakarta.persistence.Column;

public class Unit4Response {

    private Long[] technical;
    @Column
    private Long[] naturalScience;
    @Column
    private Long[] tourismAndLocalHistory;
    @Column
    private Long[] socialAndHumanitarian;
    @Column
    private Long[] artisticOrientation;
    @Column
    private Long[] physicalEducationAndSports;

    @Column
    private Long[] preprofessionalProgramsInTheFieldOfArts;
    @Column
    private Long[] additionalEducationalProgramsSportsTraining;
    @Column
    private Long[] numberOfStudentsAdditionalGeneralEducationPrograms;

    public Unit4Response(Long[] technical, Long[] naturalScience, Long[] tourismAndLocalHistory, Long[] socialAndHumanitarian, Long[] artisticOrientation, Long[] physicalEducationAndSports, Long[] preprofessionalProgramsInTheFieldOfArts, Long[] additionalEducationalProgramsSportsTraining, Long[] numberOfStudentsAdditionalGeneralEducationPrograms) {
        this.technical = technical;
        this.naturalScience = naturalScience;
        this.tourismAndLocalHistory = tourismAndLocalHistory;
        this.socialAndHumanitarian = socialAndHumanitarian;
        this.artisticOrientation = artisticOrientation;
        this.physicalEducationAndSports = physicalEducationAndSports;
        this.preprofessionalProgramsInTheFieldOfArts = preprofessionalProgramsInTheFieldOfArts;
        this.additionalEducationalProgramsSportsTraining = additionalEducationalProgramsSportsTraining;
        this.numberOfStudentsAdditionalGeneralEducationPrograms = numberOfStudentsAdditionalGeneralEducationPrograms;
    }

    public Long[] getTechnical() {
        return technical;
    }

    public Long[] getNaturalScience() {
        return naturalScience;
    }

    public Long[] getTourismAndLocalHistory() {
        return tourismAndLocalHistory;
    }

    public Long[] getSocialAndHumanitarian() {
        return socialAndHumanitarian;
    }

    public Long[] getArtisticOrientation() {
        return artisticOrientation;
    }

    public Long[] getPhysicalEducationAndSports() {
        return physicalEducationAndSports;
    }

    public Long[] getPreprofessionalProgramsInTheFieldOfArts() {
        return preprofessionalProgramsInTheFieldOfArts;
    }

    public Long[] getAdditionalEducationalProgramsSportsTraining() {
        return additionalEducationalProgramsSportsTraining;
    }

    public Long[] getNumberOfStudentsAdditionalGeneralEducationPrograms() {
        return numberOfStudentsAdditionalGeneralEducationPrograms;
    }
}
