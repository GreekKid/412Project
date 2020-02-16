/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atzhealthcare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author reedm
 */
public class PrescriptionHandling {
    private final List<String> restrictedMedications;

    public PrescriptionHandling() {
        this.restrictedMedications = Arrays.asList("Adderall", "Oxy", "Something Else");
    }
    
    public void check(String checkedMed, Integer ID){
        if (restrictedMedications.contains(checkedMed)){
            //do API or other web check to check medical databases for this person associated with the ID  
            ArrayList<String> databaseResults = new ArrayList<>();
            databaseParse(databaseResults);
        }
        
    }
    
    private void databaseParse(ArrayList<String> databaseResults){
        
    }
}
