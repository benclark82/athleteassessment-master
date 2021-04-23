package com.supersapiens.athlete.model;


import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class Athlete {

    private Long id;
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @NotBlank
    private PrimarySport primarySport;
    private SecondarySport secondarySport;

    public enum PrimarySport {
        CYCLING,
        RUNNING,
        SWIMMING
    }

    public enum SecondarySport {
        HIKING,
        PARAGLIDING,
        MARATHON
    }

    public Athlete(String firstName, String lastName, PrimarySport primarySport, SecondarySport secondarySport) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.primarySport = primarySport;
        this.secondarySport = secondarySport;
    }
}
