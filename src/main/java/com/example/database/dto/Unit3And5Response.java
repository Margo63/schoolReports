package com.example.database.dto;

public class Unit3And5Response {
    private Long[] technical;
    private Long[] naturalScience;
    private Long[] tourismAndLocalHistory;
    private Long[] socialAndHumanitarian;
    private Long[] artisticOrientation;
    private Long[] physicalEducationAndSports;
    private Long[] preprofessionalProgramsInTheFieldOfArts;
    private Long[] additionalEducationalProgramsSportsTraining;

    public Unit3And5Response(Long[] technical, Long[] naturalScience, Long[] tourismAndLocalHistory, Long[] socialAndHumanitarian, Long[] artisticOrientation, Long[] physicalEducationAndSports, Long[] preprofessionalProgramsInTheFieldOfArts, Long[] additionalEducationalProgramsSportsTraining) {
        this.technical = technical;
        this.naturalScience = naturalScience;
        this.tourismAndLocalHistory = tourismAndLocalHistory;
        this.socialAndHumanitarian = socialAndHumanitarian;
        this.artisticOrientation = artisticOrientation;
        this.physicalEducationAndSports = physicalEducationAndSports;
        this.preprofessionalProgramsInTheFieldOfArts = preprofessionalProgramsInTheFieldOfArts;
        this.additionalEducationalProgramsSportsTraining = additionalEducationalProgramsSportsTraining;
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
}
