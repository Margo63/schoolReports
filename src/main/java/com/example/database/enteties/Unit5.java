package com.example.database.enteties;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "unit5")
public class Unit5 {
    @Id
    private Long id;

    @Column
    private Integer[] technical = new Integer[5];
    @Column
    private Integer[] naturalScience = new Integer[5];

    @Column
    private Integer[] tourismAndLocalHistory = new Integer[5];
    @Column
    private Integer[] socialAndHumanitarian = new Integer[5];
    @Column
    private Integer[] artisticOrientation = new Integer[5];
    @Column
    private Integer[] physicalEducationAndSports = new Integer[5];

    @Column
    private Integer[] preprofessionalProgramsIntegerheFieldOfArts = new Integer[5];
    @Column
    private Integer[] additionalEducationalProgramsSportsTraining = new Integer[5];

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

    public Integer[] getPreprofessionalProgramsIntegerheFieldOfArts() {
        return preprofessionalProgramsIntegerheFieldOfArts;
    }

    public void setPreprofessionalProgramsIntegerheFieldOfArts(Integer[] preprofessionalProgramsIntegerheFieldOfArts) {
        this.preprofessionalProgramsIntegerheFieldOfArts = preprofessionalProgramsIntegerheFieldOfArts;
    }

    public Integer[] getAdditionalEducationalProgramsSportsTraining() {
        return additionalEducationalProgramsSportsTraining;
    }

    public void setAdditionalEducationalProgramsSportsTraining(Integer[] additionalEducationalProgramsSportsTraining) {
        this.additionalEducationalProgramsSportsTraining = additionalEducationalProgramsSportsTraining;
    }
}
