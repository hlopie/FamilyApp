package com.FamilyApp.FamilyApp;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Family {
    private String familyName;
    private int id;
    private int nrOfAdults;
    private int nrOfChildren;
    private int nrOfInfants;
}
