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
    private int[] personalComputersTotal = new int[3];
    @Column
    private int[] portablePersonalComputers = new int[3];

    @Column
    private int[] tabletComputers = new int[3];
    @Column
    private int[] graphicTabletsComputers = new int[3];

    @Column
    private int[] asPartOfLocalComputerNetworks = new int[3];

    @Column
    private int[] havingAccessToTheInternet = new int[3];

    @Column
    private int[] organizationsWithAccessToTheIntranetPortal = new int[3];

    @Column
    private int[] receivedInTheReportingYear = new int[3];

    @Column
    private int electronicTerminals;

    @Column
    private int electronicTerminalsWithAccessToInternetResources;

    @Column
    private int multimediaProjectors;

    @Column
    private int interactiveWhiteboards;

    @Column
    private int printers;
    @Column
    private int printers3D;

    @Column
    private int scanners;

    @Column
    private int multifunctionDevices;
}
