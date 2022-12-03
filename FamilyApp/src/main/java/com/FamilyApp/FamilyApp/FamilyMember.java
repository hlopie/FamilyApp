package com.FamilyApp.FamilyApp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class FamilyMember {
    private int familyID;
    private String familyName;
    private String givenName;
    private int id;
}
