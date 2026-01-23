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
    private Byte assemblyHallInOrganization;

    @Column
    private Byte assemblyHallThirdPartyOrganization;

    @Column
    private Byte concertHallInOrganization;

    @Column
    private Byte concertHallThirdPartyOrganization;

    @Column
    private Byte gameRoomInOrganization;

    @Column
    private Byte gameRoomThirdPartyOrganization;

    @Column
    private Byte trainingClassInOrganization;

    @Column
    private Byte trainingClassThirdPartyOrganization;

    @Column
    private Byte laboratoryInOrganization;

    @Column
    private Byte laboratoryThirdPartyOrganization;

    @Column
    private Byte workshopInOrganization;

    @Column
    private Byte workshopThirdPartyOrganization;

    @Column
    private Byte choreographyClassesInOrganization;

    @Column
    private Byte choreographyClassesThirdPartyOrganization;

    @Column
    private Byte choreographyClassesWithShowerInOrganization;

    @Column
    private Byte choreographyClassesWithShowerThirdPartyOrganization;

    @Column
    private Byte gymInOrganization;

    @Column
    private Byte gymThirdPartyOrganization;

    @Column
    private Byte gymWithShowerInOrganization;

    @Column
    private Byte gymWithShowerThirdPartyOrganization;

    @Column
    private Byte indoorSwimmingPoolInOrganization;

    @Column
    private Byte indoorSwimmingPoolThirdPartyOrganization;

    @Column
    private Byte lectureHallInOrganization;

    @Column
    private Byte lectureHallThirdPartyOrganization;

    @Column
    private Byte computerRoomInOrganization;

    @Column
    private Byte computerRoomThirdPartyOrganization;

    @Column
    private Byte medicalCenterInOrganization;

    @Column
    private Byte medicalCenterThirdPartyOrganization;

    @Column
    private Byte diningRoomInOrganization;

    @Column
    private Byte diningRoomThirdPartyOrganization;

    @Column
    private Byte museumInOrganization;

    @Column
    private Byte museumThirdPartyOrganization;

    @Column
    private Byte wildlifeCornerInOrganization;

    @Column
    private Byte wildlifeCornerThirdPartyOrganization;

    @Column
    private Byte climbingWallInOrganization;

    @Column
    private Byte climbingWallThirdPartyOrganization;

    @Column
    private Byte touristBaseInOrganization;

    @Column
    private Byte touristBaseThirdPartyOrganization;

    @Column
    private Byte libraryInOrganization;

    @Column
    private Byte libraryThirdPartyOrganization;

    public Unit10() {
    }

    public Unit10(Long id) {
        this.id = id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Byte getAssemblyHallInOrganization() {
        return assemblyHallInOrganization;
    }

    public void setAssemblyHallInOrganization(Byte assemblyHallInOrganization) {
        this.assemblyHallInOrganization = assemblyHallInOrganization;
    }

    public Byte getAssemblyHallThirdPartyOrganization() {
        return assemblyHallThirdPartyOrganization;
    }

    public void setAssemblyHallThirdPartyOrganization(Byte assemblyHallThirdPartyOrganization) {
        this.assemblyHallThirdPartyOrganization = assemblyHallThirdPartyOrganization;
    }

    public Byte getConcertHallInOrganization() {
        return concertHallInOrganization;
    }

    public void setConcertHallInOrganization(Byte concertHallInOrganization) {
        this.concertHallInOrganization = concertHallInOrganization;
    }

    public Byte getConcertHallThirdPartyOrganization() {
        return concertHallThirdPartyOrganization;
    }

    public void setConcertHallThirdPartyOrganization(Byte concertHallThirdPartyOrganization) {
        this.concertHallThirdPartyOrganization = concertHallThirdPartyOrganization;
    }

    public Byte getGameRoomInOrganization() {
        return gameRoomInOrganization;
    }

    public void setGameRoomInOrganization(Byte gameRoomInOrganization) {
        this.gameRoomInOrganization = gameRoomInOrganization;
    }

    public Byte getGameRoomThirdPartyOrganization() {
        return gameRoomThirdPartyOrganization;
    }

    public void setGameRoomThirdPartyOrganization(Byte gameRoomThirdPartyOrganization) {
        this.gameRoomThirdPartyOrganization = gameRoomThirdPartyOrganization;
    }

    public Byte getTrainingClassInOrganization() {
        return trainingClassInOrganization;
    }

    public void setTrainingClassInOrganization(Byte trainingClassInOrganization) {
        this.trainingClassInOrganization = trainingClassInOrganization;
    }

    public Byte getTrainingClassThirdPartyOrganization() {
        return trainingClassThirdPartyOrganization;
    }

    public void setTrainingClassThirdPartyOrganization(Byte trainingClassThirdPartyOrganization) {
        this.trainingClassThirdPartyOrganization = trainingClassThirdPartyOrganization;
    }

    public Byte getLaboratoryInOrganization() {
        return laboratoryInOrganization;
    }

    public void setLaboratoryInOrganization(Byte laboratoryInOrganization) {
        this.laboratoryInOrganization = laboratoryInOrganization;
    }

    public Byte getLaboratoryThirdPartyOrganization() {
        return laboratoryThirdPartyOrganization;
    }

    public void setLaboratoryThirdPartyOrganization(Byte laboratoryThirdPartyOrganization) {
        this.laboratoryThirdPartyOrganization = laboratoryThirdPartyOrganization;
    }

    public Byte getWorkshopInOrganization() {
        return workshopInOrganization;
    }

    public void setWorkshopInOrganization(Byte workshopInOrganization) {
        this.workshopInOrganization = workshopInOrganization;
    }

    public Byte getWorkshopThirdPartyOrganization() {
        return workshopThirdPartyOrganization;
    }

    public void setWorkshopThirdPartyOrganization(Byte workshopThirdPartyOrganization) {
        this.workshopThirdPartyOrganization = workshopThirdPartyOrganization;
    }

    public Byte getChoreographyClassesInOrganization() {
        return choreographyClassesInOrganization;
    }

    public void setChoreographyClassesInOrganization(Byte choreographyClassesInOrganization) {
        this.choreographyClassesInOrganization = choreographyClassesInOrganization;
    }

    public Byte getChoreographyClassesThirdPartyOrganization() {
        return choreographyClassesThirdPartyOrganization;
    }

    public void setChoreographyClassesThirdPartyOrganization(Byte choreographyClassesThirdPartyOrganization) {
        this.choreographyClassesThirdPartyOrganization = choreographyClassesThirdPartyOrganization;
    }

    public Byte getChoreographyClassesWithShowerInOrganization() {
        return choreographyClassesWithShowerInOrganization;
    }

    public void setChoreographyClassesWithShowerInOrganization(Byte choreographyClassesWithShowerInOrganization) {
        this.choreographyClassesWithShowerInOrganization = choreographyClassesWithShowerInOrganization;
    }

    public Byte getChoreographyClassesWithShowerThirdPartyOrganization() {
        return choreographyClassesWithShowerThirdPartyOrganization;
    }

    public void setChoreographyClassesWithShowerThirdPartyOrganization(Byte choreographyClassesWithShowerThirdPartyOrganization) {
        this.choreographyClassesWithShowerThirdPartyOrganization = choreographyClassesWithShowerThirdPartyOrganization;
    }

    public Byte getGymInOrganization() {
        return gymInOrganization;
    }

    public void setGymInOrganization(Byte gymInOrganization) {
        this.gymInOrganization = gymInOrganization;
    }

    public Byte getGymThirdPartyOrganization() {
        return gymThirdPartyOrganization;
    }

    public void setGymThirdPartyOrganization(Byte gymThirdPartyOrganization) {
        this.gymThirdPartyOrganization = gymThirdPartyOrganization;
    }

    public Byte getGymWithShowerInOrganization() {
        return gymWithShowerInOrganization;
    }

    public void setGymWithShowerInOrganization(Byte gymWithShowerInOrganization) {
        this.gymWithShowerInOrganization = gymWithShowerInOrganization;
    }

    public Byte getGymWithShowerThirdPartyOrganization() {
        return gymWithShowerThirdPartyOrganization;
    }

    public void setGymWithShowerThirdPartyOrganization(Byte gymWithShowerThirdPartyOrganization) {
        this.gymWithShowerThirdPartyOrganization = gymWithShowerThirdPartyOrganization;
    }

    public Byte getIndoorSwimmingPoolInOrganization() {
        return indoorSwimmingPoolInOrganization;
    }

    public void setIndoorSwimmingPoolInOrganization(Byte indoorSwimmingPoolInOrganization) {
        this.indoorSwimmingPoolInOrganization = indoorSwimmingPoolInOrganization;
    }

    public Byte getIndoorSwimmingPoolThirdPartyOrganization() {
        return indoorSwimmingPoolThirdPartyOrganization;
    }

    public void setIndoorSwimmingPoolThirdPartyOrganization(Byte indoorSwimmingPoolThirdPartyOrganization) {
        this.indoorSwimmingPoolThirdPartyOrganization = indoorSwimmingPoolThirdPartyOrganization;
    }

    public Byte getLectureHallInOrganization() {
        return lectureHallInOrganization;
    }

    public void setLectureHallInOrganization(Byte lectureHallInOrganization) {
        this.lectureHallInOrganization = lectureHallInOrganization;
    }

    public Byte getLectureHallThirdPartyOrganization() {
        return lectureHallThirdPartyOrganization;
    }

    public void setLectureHallThirdPartyOrganization(Byte lectureHallThirdPartyOrganization) {
        this.lectureHallThirdPartyOrganization = lectureHallThirdPartyOrganization;
    }

    public Byte getComputerRoomInOrganization() {
        return computerRoomInOrganization;
    }

    public void setComputerRoomInOrganization(Byte computerRoomInOrganization) {
        this.computerRoomInOrganization = computerRoomInOrganization;
    }

    public Byte getComputerRoomThirdPartyOrganization() {
        return computerRoomThirdPartyOrganization;
    }

    public void setComputerRoomThirdPartyOrganization(Byte computerRoomThirdPartyOrganization) {
        this.computerRoomThirdPartyOrganization = computerRoomThirdPartyOrganization;
    }

    public Byte getMedicalCenterInOrganization() {
        return medicalCenterInOrganization;
    }

    public void setMedicalCenterInOrganization(Byte medicalCenterInOrganization) {
        this.medicalCenterInOrganization = medicalCenterInOrganization;
    }

    public Byte getMedicalCenterThirdPartyOrganization() {
        return medicalCenterThirdPartyOrganization;
    }

    public void setMedicalCenterThirdPartyOrganization(Byte medicalCenterThirdPartyOrganization) {
        this.medicalCenterThirdPartyOrganization = medicalCenterThirdPartyOrganization;
    }

    public Byte getDiningRoomInOrganization() {
        return diningRoomInOrganization;
    }

    public void setDiningRoomInOrganization(Byte diningRoomInOrganization) {
        this.diningRoomInOrganization = diningRoomInOrganization;
    }

    public Byte getDiningRoomThirdPartyOrganization() {
        return diningRoomThirdPartyOrganization;
    }

    public void setDiningRoomThirdPartyOrganization(Byte diningRoomThirdPartyOrganization) {
        this.diningRoomThirdPartyOrganization = diningRoomThirdPartyOrganization;
    }

    public Byte getMuseumInOrganization() {
        return museumInOrganization;
    }

    public void setMuseumInOrganization(Byte museumInOrganization) {
        this.museumInOrganization = museumInOrganization;
    }

    public Byte getMuseumThirdPartyOrganization() {
        return museumThirdPartyOrganization;
    }

    public void setMuseumThirdPartyOrganization(Byte museumThirdPartyOrganization) {
        this.museumThirdPartyOrganization = museumThirdPartyOrganization;
    }

    public Byte getWildlifeCornerInOrganization() {
        return wildlifeCornerInOrganization;
    }

    public void setWildlifeCornerInOrganization(Byte wildlifeCornerInOrganization) {
        this.wildlifeCornerInOrganization = wildlifeCornerInOrganization;
    }

    public Byte getWildlifeCornerThirdPartyOrganization() {
        return wildlifeCornerThirdPartyOrganization;
    }

    public void setWildlifeCornerThirdPartyOrganization(Byte wildlifeCornerThirdPartyOrganization) {
        this.wildlifeCornerThirdPartyOrganization = wildlifeCornerThirdPartyOrganization;
    }

    public Byte getClimbingWallInOrganization() {
        return climbingWallInOrganization;
    }

    public void setClimbingWallInOrganization(Byte climbingWallInOrganization) {
        this.climbingWallInOrganization = climbingWallInOrganization;
    }

    public Byte getClimbingWallThirdPartyOrganization() {
        return climbingWallThirdPartyOrganization;
    }

    public void setClimbingWallThirdPartyOrganization(Byte climbingWallThirdPartyOrganization) {
        this.climbingWallThirdPartyOrganization = climbingWallThirdPartyOrganization;
    }

    public Byte getTouristBaseInOrganization() {
        return touristBaseInOrganization;
    }

    public void setTouristBaseInOrganization(Byte touristBaseInOrganization) {
        this.touristBaseInOrganization = touristBaseInOrganization;
    }

    public Byte getTouristBaseThirdPartyOrganization() {
        return touristBaseThirdPartyOrganization;
    }

    public void setTouristBaseThirdPartyOrganization(Byte touristBaseThirdPartyOrganization) {
        this.touristBaseThirdPartyOrganization = touristBaseThirdPartyOrganization;
    }

    public Byte getLibraryInOrganization() {
        return libraryInOrganization;
    }

    public void setLibraryInOrganization(Byte libraryInOrganization) {
        this.libraryInOrganization = libraryInOrganization;
    }

    public Byte getLibraryThirdPartyOrganization() {
        return libraryThirdPartyOrganization;
    }

    public void setLibraryThirdPartyOrganization(Byte libraryThirdPartyOrganization) {
        this.libraryThirdPartyOrganization = libraryThirdPartyOrganization;
    }
}
