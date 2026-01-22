package com.example.database.enteties;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "unit4")
public class Unit4 {

    @Id
    private Long id;

    @Column
    private Integer[] technical = new Integer[17];
    @Column
    private Integer[] naturalScience = new Integer[17];
    @Column
    private Integer[] tourismAndLocalHistory = new Integer[17];
    @Column
    private Integer[] socialAndHumanitarian = new Integer[17];
    @Column
    private Integer[] artisticOrientation = new Integer[17];
    @Column
    private Integer[] physicalEducationAndSports = new Integer[17];

    @Column
    private Integer[] preprofessionalProgramsInTheFieldOfArts = new Integer[17];
    @Column
    private Integer[] additionalEducationalProgramsSportsTraining = new Integer[17];
    @Column
    private Integer[] numberOfStudentsAdditionalGeneralEducationPrograms = new Integer[17];

    public Unit4() {
    }

    public Unit4(Long id) {
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Integer[] getTechnical() {
        return technical;
    }

    public void setTechnical(Integer[] technical) {
        this.technical = technical;
    }

    public Integer[] getNaturalScience() {
        return naturalScience;
    }

    public void setNaturalScience(Integer[] naturalScience) {
        this.naturalScience = naturalScience;
    }

    public Integer[] getTourismAndLocalHistory() {
        return tourismAndLocalHistory;
    }

    public void setTourismAndLocalHistory(Integer[] tourismAndLocalHistory) {
        this.tourismAndLocalHistory = tourismAndLocalHistory;
    }

    public Integer[] getSocialAndHumanitarian() {
        return socialAndHumanitarian;
    }

    public void setSocialAndHumanitarian(Integer[] socialAndHumanitarian) {
        this.socialAndHumanitarian = socialAndHumanitarian;
    }

    public Integer[] getArtisticOrientation() {
        return artisticOrientation;
    }

    public void setArtisticOrientation(Integer[] artisticOrientation) {
        this.artisticOrientation = artisticOrientation;
    }

    public Integer[] getPhysicalEducationAndSports() {
        return physicalEducationAndSports;
    }

    public void setPhysicalEducationAndSports(Integer[] physicalEducationAndSports) {
        this.physicalEducationAndSports = physicalEducationAndSports;
    }

    public Integer[] getPreprofessionalProgramsInTheFieldOfArts() {
        return preprofessionalProgramsInTheFieldOfArts;
    }

    public void setPreprofessionalProgramsInTheFieldOfArts(Integer[] preprofessionalProgramsInTheFieldOfArts) {
        this.preprofessionalProgramsInTheFieldOfArts = preprofessionalProgramsInTheFieldOfArts;
    }

    public Integer[] getAdditionalEducationalProgramsSportsTraining() {
        return additionalEducationalProgramsSportsTraining;
    }

    public void setAdditionalEducationalProgramsSportsTraining(Integer[] additionalEducationalProgramsSportsTraining) {
        this.additionalEducationalProgramsSportsTraining = additionalEducationalProgramsSportsTraining;
    }

    public Integer[] getNumberOfStudentsAdditionalGeneralEducationPrograms() {
        return numberOfStudentsAdditionalGeneralEducationPrograms;
    }

    public void setNumberOfStudentsAdditionalGeneralEducationPrograms(Integer[] numberOfStudentsAdditionalGeneralEducationPrograms) {
        this.numberOfStudentsAdditionalGeneralEducationPrograms = numberOfStudentsAdditionalGeneralEducationPrograms;
    }
}
