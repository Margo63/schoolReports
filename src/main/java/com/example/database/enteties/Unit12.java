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
    private String[] personalComputersTotal = new String[3];
    @Column
    private String[] portablePersonalComputers = new String[3];

    @Column
    private String[] tabletComputers = new String[3];
    @Column
    private String[] graphicTabletsComputers = new String[3];

    @Column
    private String[] asPartOfLocalComputerNetworks = new String[3];

    @Column
    private String[] havingAccessToTheInternet = new String[3];

    @Column
    private String[] organizationsWithAccessToTheIntranetPortal = new String[3];

    @Column
    private String[] receivedInTheReportingYear = new String[3];

    @Column
    private String electronicTerminals;

    @Column
    private String electronicTerminalsWithAccessToInternetResources;

    @Column
    private String multimediaProjectors;

    @Column
    private String interactiveWhiteboards;

    @Column
    private String printers;
    @Column
    private String printers3D;

    @Column
    private String scanners;

    @Column
    private String multifunctionDevices;

    public Unit12() {
    }

    public Unit12(Long id) {
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String[] getPersonalComputersTotal() {
        return personalComputersTotal;
    }

    public void setPersonalComputersTotal(String[] personalComputersTotal) {
        this.personalComputersTotal = personalComputersTotal;
    }

    public String[] getPortablePersonalComputers() {
        return portablePersonalComputers;
    }

    public void setPortablePersonalComputers(String[] portablePersonalComputers) {
        this.portablePersonalComputers = portablePersonalComputers;
    }

    public String[] getTabletComputers() {
        return tabletComputers;
    }

    public void setTabletComputers(String[] tabletComputers) {
        this.tabletComputers = tabletComputers;
    }

    public String[] getGraphicTabletsComputers() {
        return graphicTabletsComputers;
    }

    public void setGraphicTabletsComputers(String[] graphicTabletsComputers) {
        this.graphicTabletsComputers = graphicTabletsComputers;
    }

    public String[] getAsPartOfLocalComputerNetworks() {
        return asPartOfLocalComputerNetworks;
    }

    public void setAsPartOfLocalComputerNetworks(String[] asPartOfLocalComputerNetworks) {
        this.asPartOfLocalComputerNetworks = asPartOfLocalComputerNetworks;
    }

    public String[] getHavingAccessToTheInternet() {
        return havingAccessToTheInternet;
    }

    public void setHavingAccessToTheInternet(String[] havingAccessToTheInternet) {
        this.havingAccessToTheInternet = havingAccessToTheInternet;
    }

    public String[] getOrganizationsWithAccessToTheIntranetPortal() {
        return organizationsWithAccessToTheIntranetPortal;
    }

    public void setOrganizationsWithAccessToTheIntranetPortal(String[] organizationsWithAccessToTheIntranetPortal) {
        this.organizationsWithAccessToTheIntranetPortal = organizationsWithAccessToTheIntranetPortal;
    }

    public String[] getReceivedInTheReportingYear() {
        return receivedInTheReportingYear;
    }

    public void setReceivedInTheReportingYear(String[] receivedInTheReportingYear) {
        this.receivedInTheReportingYear = receivedInTheReportingYear;
    }

    public String getElectronicTerminals() {
        return electronicTerminals;
    }

    public void setElectronicTerminals(String electronicTerminals) {
        this.electronicTerminals = electronicTerminals;
    }

    public String getElectronicTerminalsWithAccessToInternetResources() {
        return electronicTerminalsWithAccessToInternetResources;
    }

    public void setElectronicTerminalsWithAccessToInternetResources(String electronicTerminalsWithAccessToInternetResources) {
        this.electronicTerminalsWithAccessToInternetResources = electronicTerminalsWithAccessToInternetResources;
    }

    public String getMultimediaProjectors() {
        return multimediaProjectors;
    }

    public void setMultimediaProjectors(String multimediaProjectors) {
        this.multimediaProjectors = multimediaProjectors;
    }

    public String getInteractiveWhiteboards() {
        return interactiveWhiteboards;
    }

    public void setInteractiveWhiteboards(String interactiveWhiteboards) {
        this.interactiveWhiteboards = interactiveWhiteboards;
    }

    public String getPrinters() {
        return printers;
    }

    public void setPrinters(String printers) {
        this.printers = printers;
    }

    public String getPrinters3D() {
        return printers3D;
    }

    public void setPrinters3D(String printers3D) {
        this.printers3D = printers3D;
    }

    public String getScanners() {
        return scanners;
    }

    public void setScanners(String scanners) {
        this.scanners = scanners;
    }

    public String getMultifunctionDevices() {
        return multifunctionDevices;
    }

    public void setMultifunctionDevices(String multifunctionDevices) {
        this.multifunctionDevices = multifunctionDevices;
    }
}
