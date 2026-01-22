package com.example.database.enteties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "unit10")
public class Unit10 {

    @Id
    private Long id;

    @Column
    private Integer assemblyHallInOrganization;

    @Column
    private Integer assemblyHallThirdPartyOrganization;

    @Column
    private Integer concertHallInOrganization;

    @Column
    private Integer concertHallThirdPartyOrganization;

    @Column
    private Integer gameRoomInOrganization;

    @Column
    private Integer gameRoomThirdPartyOrganization;

    @Column
    private Integer trainingClassInOrganization;

    @Column
    private Integer trainingClassThirdPartyOrganization;

    @Column
    private Integer laboratoryInOrganization;

    @Column
    private Integer laboratoryThirdPartyOrganization;

    @Column
    private Integer workshopInOrganization;

    @Column
    private Integer workshopThirdPartyOrganization;

    @Column
    private Integer choreographyClassesInOrganization;

    @Column
    private Integer choreographyClassesThirdPartyOrganization;

    @Column
    private Integer choreographyClassesWithShowerInOrganization;

    @Column
    private Integer choreographyClassesWithShowerThirdPartyOrganization;

    @Column
    private Integer gymInOrganization;

    @Column
    private Integer gymThirdPartyOrganization;

    @Column
    private Integer gymWithShowerInOrganization;

    @Column
    private Integer gymWithShowerThirdPartyOrganization;

    @Column
    private Integer indoorSwimmingPoolInOrganization;

    @Column
    private Integer indoorSwimmingPoolThirdPartyOrganization;

    @Column
    private Integer lectureHallInOrganization;

    @Column
    private Integer lectureHallThirdPartyOrganization;

    @Column
    private Integer computerRoomInOrganization;

    @Column
    private Integer computerRoomThirdPartyOrganization;

    @Column
    private Integer medicalCenterInOrganization;

    @Column
    private Integer medicalCenterThirdPartyOrganization;

    @Column
    private Integer diningRoomInOrganization;

    @Column
    private Integer diningRoomThirdPartyOrganization;

    @Column
    private Integer museumInOrganization;

    @Column
    private Integer museumThirdPartyOrganization;

    @Column
    private Integer wildlifeCornerInOrganization;

    @Column
    private Integer wildlifeCornerThirdPartyOrganization;

    @Column
    private Integer climbingWallInOrganization;

    @Column
    private Integer climbingWallThirdPartyOrganization;

    @Column
    private Integer touristBaseInOrganization;

    @Column
    private Integer touristBaseThirdPartyOrganization;

    @Column
    private Integer libraryInOrganization;

    @Column
    private Integer libraryThirdPartyOrganization;

    public Integer getAssemblyHallInOrganization() {
        return assemblyHallInOrganization;
    }

    public void setAssemblyHallInOrganization(Integer assemblyHallInOrganization) {
        this.assemblyHallInOrganization = assemblyHallInOrganization;
    }

    public Integer getAssemblyHallThirdPartyOrganization() {
        return assemblyHallThirdPartyOrganization;
    }

    public void setAssemblyHallThirdPartyOrganization(Integer assemblyHallThirdPartyOrganization) {
        this.assemblyHallThirdPartyOrganization = assemblyHallThirdPartyOrganization;
    }

    public Integer getConcertHallInOrganization() {
        return concertHallInOrganization;
    }

    public void setConcertHallInOrganization(Integer concertHallInOrganization) {
        this.concertHallInOrganization = concertHallInOrganization;
    }

    public Integer getConcertHallThirdPartyOrganization() {
        return concertHallThirdPartyOrganization;
    }

    public void setConcertHallThirdPartyOrganization(Integer concertHallThirdPartyOrganization) {
        this.concertHallThirdPartyOrganization = concertHallThirdPartyOrganization;
    }

    public Integer getGameRoomInOrganization() {
        return gameRoomInOrganization;
    }

    public void setGameRoomInOrganization(Integer gameRoomInOrganization) {
        this.gameRoomInOrganization = gameRoomInOrganization;
    }

    public Integer getGameRoomThirdPartyOrganization() {
        return gameRoomThirdPartyOrganization;
    }

    public void setGameRoomThirdPartyOrganization(Integer gameRoomThirdPartyOrganization) {
        this.gameRoomThirdPartyOrganization = gameRoomThirdPartyOrganization;
    }

    public Integer getTrainingClassInOrganization() {
        return trainingClassInOrganization;
    }

    public void setTrainingClassInOrganization(Integer trainingClassInOrganization) {
        this.trainingClassInOrganization = trainingClassInOrganization;
    }

    public Integer getTrainingClassThirdPartyOrganization() {
        return trainingClassThirdPartyOrganization;
    }

    public void setTrainingClassThirdPartyOrganization(Integer trainingClassThirdPartyOrganization) {
        this.trainingClassThirdPartyOrganization = trainingClassThirdPartyOrganization;
    }

    public Integer getLaboratoryInOrganization() {
        return laboratoryInOrganization;
    }

    public void setLaboratoryInOrganization(Integer laboratoryInOrganization) {
        this.laboratoryInOrganization = laboratoryInOrganization;
    }

    public Integer getLaboratoryThirdPartyOrganization() {
        return laboratoryThirdPartyOrganization;
    }

    public void setLaboratoryThirdPartyOrganization(Integer laboratoryThirdPartyOrganization) {
        this.laboratoryThirdPartyOrganization = laboratoryThirdPartyOrganization;
    }

    public Integer getWorkshopInOrganization() {
        return workshopInOrganization;
    }

    public void setWorkshopInOrganization(Integer workshopInOrganization) {
        this.workshopInOrganization = workshopInOrganization;
    }

    public Integer getWorkshopThirdPartyOrganization() {
        return workshopThirdPartyOrganization;
    }

    public void setWorkshopThirdPartyOrganization(Integer workshopThirdPartyOrganization) {
        this.workshopThirdPartyOrganization = workshopThirdPartyOrganization;
    }

    public Integer getChoreographyClassesInOrganization() {
        return choreographyClassesInOrganization;
    }

    public void setChoreographyClassesInOrganization(Integer choreographyClassesInOrganization) {
        this.choreographyClassesInOrganization = choreographyClassesInOrganization;
    }

    public Integer getChoreographyClassesThirdPartyOrganization() {
        return choreographyClassesThirdPartyOrganization;
    }

    public void setChoreographyClassesThirdPartyOrganization(Integer choreographyClassesThirdPartyOrganization) {
        this.choreographyClassesThirdPartyOrganization = choreographyClassesThirdPartyOrganization;
    }

    public Integer getChoreographyClassesWithShowerInOrganization() {
        return choreographyClassesWithShowerInOrganization;
    }

    public void setChoreographyClassesWithShowerInOrganization(Integer choreographyClassesWithShowerInOrganization) {
        this.choreographyClassesWithShowerInOrganization = choreographyClassesWithShowerInOrganization;
    }

    public Integer getChoreographyClassesWithShowerThirdPartyOrganization() {
        return choreographyClassesWithShowerThirdPartyOrganization;
    }

    public void setChoreographyClassesWithShowerThirdPartyOrganization(Integer choreographyClassesWithShowerThirdPartyOrganization) {
        this.choreographyClassesWithShowerThirdPartyOrganization = choreographyClassesWithShowerThirdPartyOrganization;
    }

    public Integer getGymInOrganization() {
        return gymInOrganization;
    }

    public void setGymInOrganization(Integer gymInOrganization) {
        this.gymInOrganization = gymInOrganization;
    }

    public Integer getGymThirdPartyOrganization() {
        return gymThirdPartyOrganization;
    }

    public void setGymThirdPartyOrganization(Integer gymThirdPartyOrganization) {
        this.gymThirdPartyOrganization = gymThirdPartyOrganization;
    }

    public Integer getGymWithShowerInOrganization() {
        return gymWithShowerInOrganization;
    }

    public void setGymWithShowerInOrganization(Integer gymWithShowerInOrganization) {
        this.gymWithShowerInOrganization = gymWithShowerInOrganization;
    }

    public Integer getGymWithShowerThirdPartyOrganization() {
        return gymWithShowerThirdPartyOrganization;
    }

    public void setGymWithShowerThirdPartyOrganization(Integer gymWithShowerThirdPartyOrganization) {
        this.gymWithShowerThirdPartyOrganization = gymWithShowerThirdPartyOrganization;
    }

    public Integer getIndoorSwimmingPoolInOrganization() {
        return indoorSwimmingPoolInOrganization;
    }

    public void setIndoorSwimmingPoolInOrganization(Integer indoorSwimmingPoolInOrganization) {
        this.indoorSwimmingPoolInOrganization = indoorSwimmingPoolInOrganization;
    }

    public Integer getIndoorSwimmingPoolThirdPartyOrganization() {
        return indoorSwimmingPoolThirdPartyOrganization;
    }

    public void setIndoorSwimmingPoolThirdPartyOrganization(Integer indoorSwimmingPoolThirdPartyOrganization) {
        this.indoorSwimmingPoolThirdPartyOrganization = indoorSwimmingPoolThirdPartyOrganization;
    }

    public Integer getLectureHallInOrganization() {
        return lectureHallInOrganization;
    }

    public void setLectureHallInOrganization(Integer lectureHallInOrganization) {
        this.lectureHallInOrganization = lectureHallInOrganization;
    }

    public Integer getLectureHallThirdPartyOrganization() {
        return lectureHallThirdPartyOrganization;
    }

    public void setLectureHallThirdPartyOrganization(Integer lectureHallThirdPartyOrganization) {
        this.lectureHallThirdPartyOrganization = lectureHallThirdPartyOrganization;
    }

    public Integer getComputerRoomInOrganization() {
        return computerRoomInOrganization;
    }

    public void setComputerRoomInOrganization(Integer computerRoomInOrganization) {
        this.computerRoomInOrganization = computerRoomInOrganization;
    }

    public Integer getComputerRoomThirdPartyOrganization() {
        return computerRoomThirdPartyOrganization;
    }

    public void setComputerRoomThirdPartyOrganization(Integer computerRoomThirdPartyOrganization) {
        this.computerRoomThirdPartyOrganization = computerRoomThirdPartyOrganization;
    }

    public Integer getMedicalCenterInOrganization() {
        return medicalCenterInOrganization;
    }

    public void setMedicalCenterInOrganization(Integer medicalCenterInOrganization) {
        this.medicalCenterInOrganization = medicalCenterInOrganization;
    }

    public Integer getMedicalCenterThirdPartyOrganization() {
        return medicalCenterThirdPartyOrganization;
    }

    public void setMedicalCenterThirdPartyOrganization(Integer medicalCenterThirdPartyOrganization) {
        this.medicalCenterThirdPartyOrganization = medicalCenterThirdPartyOrganization;
    }

    public Integer getDiningRoomInOrganization() {
        return diningRoomInOrganization;
    }

    public void setDiningRoomInOrganization(Integer diningRoomInOrganization) {
        this.diningRoomInOrganization = diningRoomInOrganization;
    }

    public Integer getDiningRoomThirdPartyOrganization() {
        return diningRoomThirdPartyOrganization;
    }

    public void setDiningRoomThirdPartyOrganization(Integer diningRoomThirdPartyOrganization) {
        this.diningRoomThirdPartyOrganization = diningRoomThirdPartyOrganization;
    }

    public Integer getMuseumInOrganization() {
        return museumInOrganization;
    }

    public void setMuseumInOrganization(Integer museumInOrganization) {
        this.museumInOrganization = museumInOrganization;
    }

    public Integer getMuseumThirdPartyOrganization() {
        return museumThirdPartyOrganization;
    }

    public void setMuseumThirdPartyOrganization(Integer museumThirdPartyOrganization) {
        this.museumThirdPartyOrganization = museumThirdPartyOrganization;
    }

    public Integer getWildlifeCornerInOrganization() {
        return wildlifeCornerInOrganization;
    }

    public void setWildlifeCornerInOrganization(Integer wildlifeCornerInOrganization) {
        this.wildlifeCornerInOrganization = wildlifeCornerInOrganization;
    }

    public Integer getWildlifeCornerThirdPartyOrganization() {
        return wildlifeCornerThirdPartyOrganization;
    }

    public void setWildlifeCornerThirdPartyOrganization(Integer wildlifeCornerThirdPartyOrganization) {
        this.wildlifeCornerThirdPartyOrganization = wildlifeCornerThirdPartyOrganization;
    }

    public Integer getClimbingWallInOrganization() {
        return climbingWallInOrganization;
    }

    public void setClimbingWallInOrganization(Integer climbingWallInOrganization) {
        this.climbingWallInOrganization = climbingWallInOrganization;
    }

    public Integer getClimbingWallThirdPartyOrganization() {
        return climbingWallThirdPartyOrganization;
    }

    public void setClimbingWallThirdPartyOrganization(Integer climbingWallThirdPartyOrganization) {
        this.climbingWallThirdPartyOrganization = climbingWallThirdPartyOrganization;
    }

    public Integer getTouristBaseInOrganization() {
        return touristBaseInOrganization;
    }

    public void setTouristBaseInOrganization(Integer touristBaseInOrganization) {
        this.touristBaseInOrganization = touristBaseInOrganization;
    }

    public Integer getTouristBaseThirdPartyOrganization() {
        return touristBaseThirdPartyOrganization;
    }

    public void setTouristBaseThirdPartyOrganization(Integer touristBaseThirdPartyOrganization) {
        this.touristBaseThirdPartyOrganization = touristBaseThirdPartyOrganization;
    }

    public Integer getLibraryInOrganization() {
        return libraryInOrganization;
    }

    public void setLibraryInOrganization(Integer libraryInOrganization) {
        this.libraryInOrganization = libraryInOrganization;
    }

    public Integer getLibraryThirdPartyOrganization() {
        return libraryThirdPartyOrganization;
    }

    public void setLibraryThirdPartyOrganization(Integer libraryThirdPartyOrganization) {
        this.libraryThirdPartyOrganization = libraryThirdPartyOrganization;
    }
}
