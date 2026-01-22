package com.example.database.enteties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "unit12")
public class Unit12 {
    @Id
    private Long id;

    @Column
    private Integer[] personalComputersTotal = new Integer[3];
    @Column
    private Integer[] portablePersonalComputers = new Integer[3];

    @Column
    private Integer[] tabletComputers = new Integer[3];
    @Column
    private Integer[] graphicTabletsComputers = new Integer[3];

    @Column
    private Integer[] asPartOfLocalComputerNetworks = new Integer[3];

    @Column
    private Integer[] havingAccessToTheInternet = new Integer[3];

    @Column
    private Integer[] organizationsWithAccessToTheIntranetPortal = new Integer[3];

    @Column
    private Integer[] receivedInTheReportingYear = new Integer[3];

    @Column
    private Integer electronicTerminals;

    @Column
    private Integer electronicTerminalsWithAccessToInternetResources;

    @Column
    private Integer multimediaProjectors;

    @Column
    private Integer interactiveWhiteboards;

    @Column
    private Integer printers;
    @Column
    private Integer printers3D;

    @Column
    private Integer scanners;

    @Column
    private Integer multifunctionDevices;

    public Integer[] getPersonalComputersTotal() {
        return personalComputersTotal;
    }

    public void setPersonalComputersTotal(Integer[] personalComputersTotal) {
        this.personalComputersTotal = personalComputersTotal;
    }

    public Integer[] getPortablePersonalComputers() {
        return portablePersonalComputers;
    }

    public void setPortablePersonalComputers(Integer[] portablePersonalComputers) {
        this.portablePersonalComputers = portablePersonalComputers;
    }

    public Integer[] getTabletComputers() {
        return tabletComputers;
    }

    public void setTabletComputers(Integer[] tabletComputers) {
        this.tabletComputers = tabletComputers;
    }

    public Integer[] getGraphicTabletsComputers() {
        return graphicTabletsComputers;
    }

    public void setGraphicTabletsComputers(Integer[] graphicTabletsComputers) {
        this.graphicTabletsComputers = graphicTabletsComputers;
    }

    public Integer[] getAsPartOfLocalComputerNetworks() {
        return asPartOfLocalComputerNetworks;
    }

    public void setAsPartOfLocalComputerNetworks(Integer[] asPartOfLocalComputerNetworks) {
        this.asPartOfLocalComputerNetworks = asPartOfLocalComputerNetworks;
    }

    public Integer[] getHavingAccessToTheInternet() {
        return havingAccessToTheInternet;
    }

    public void setHavingAccessToTheInternet(Integer[] havingAccessToTheInternet) {
        this.havingAccessToTheInternet = havingAccessToTheInternet;
    }

    public Integer[] getOrganizationsWithAccessToTheIntranetPortal() {
        return organizationsWithAccessToTheIntranetPortal;
    }

    public void setOrganizationsWithAccessToTheIntranetPortal(Integer[] organizationsWithAccessToTheIntranetPortal) {
        this.organizationsWithAccessToTheIntranetPortal = organizationsWithAccessToTheIntranetPortal;
    }

    public Integer[] getReceivedInTheReportingYear() {
        return receivedInTheReportingYear;
    }

    public void setReceivedInTheReportingYear(Integer[] receivedInTheReportingYear) {
        this.receivedInTheReportingYear = receivedInTheReportingYear;
    }

    public Integer getElectronicTerminals() {
        return electronicTerminals;
    }

    public void setElectronicTerminals(Integer electronicTerminals) {
        this.electronicTerminals = electronicTerminals;
    }

    public Integer getElectronicTerminalsWithAccessToInternetResources() {
        return electronicTerminalsWithAccessToInternetResources;
    }

    public void setElectronicTerminalsWithAccessToInternetResources(Integer electronicTerminalsWithAccessToInternetResources) {
        this.electronicTerminalsWithAccessToInternetResources = electronicTerminalsWithAccessToInternetResources;
    }

    public Integer getMultimediaProjectors() {
        return multimediaProjectors;
    }

    public void setMultimediaProjectors(Integer multimediaProjectors) {
        this.multimediaProjectors = multimediaProjectors;
    }

    public Integer getInteractiveWhiteboards() {
        return interactiveWhiteboards;
    }

    public void setInteractiveWhiteboards(Integer interactiveWhiteboards) {
        this.interactiveWhiteboards = interactiveWhiteboards;
    }

    public Integer getPrinters() {
        return printers;
    }

    public void setPrinters(Integer printers) {
        this.printers = printers;
    }

    public Integer getPrinters3D() {
        return printers3D;
    }

    public void setPrinters3D(Integer printers3D) {
        this.printers3D = printers3D;
    }

    public Integer getScanners() {
        return scanners;
    }

    public void setScanners(Integer scanners) {
        this.scanners = scanners;
    }

    public Integer getMultifunctionDevices() {
        return multifunctionDevices;
    }

    public void setMultifunctionDevices(Integer multifunctionDevices) {
        this.multifunctionDevices = multifunctionDevices;
    }
}
