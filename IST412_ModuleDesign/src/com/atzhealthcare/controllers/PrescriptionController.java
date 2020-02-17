/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atzhealthcare.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author reedm
 */
public class PrescriptionController {
    private final List<String> restrictedMedications;

    public PrescriptionController() {
        this.restrictedMedications = Arrays.asList("Adderall", "Oxy", "Something Else");
    }
    
    
    /**
     * Confirms if the medication being checked is in restrictedMedications, and if so, checks the state medical database and returns any records the patient has.  
     * Calls databaseParse() to parse what is gathered into JSON.
     * @param checkedMed String specifying the name of the medication that is intended to be prescribed.
     * @param ID ID of the patient that is going to be receiving the medication in order to check the database for them.
     * @return Returns either null or JSON of a database call.
     */
    public ArrayList<String> check(String checkedMed, Integer ID){
        ArrayList<String> dbRes = new ArrayList<>();
        if (restrictedMedications.contains(checkedMed)){
            //do API or other web check to check medical databases for this person associated with the ID  
            dbRes = databaseParse(dbRes);
            return dbRes;
        }
        return dbRes;
    }
    
    
    /**
     * Parses and formats database pull in check() into JSON.  
     * 
     * Will likely be multiple functions later on.
     * @param databaseResults Takes in the JSON to be parsed in whatever way is needed.
     * @return Appropriately formatted JSON.
     */
    private ArrayList<String> databaseParse(ArrayList<String> databaseResults){
        databaseResults = databaseResults;  //take whatever is needed.  May need to be multiple separate functions
        return databaseResults;
    }
    
    
    
    /**
     * Adds to state database if medication is special one, and adds the medication to the patient records. 
     * @param meds Medication to be added.
     * @param ID Patient ID.
     */
    public void addPrescription(String meds, Integer ID){
        if (restrictedMedications.contains(meds)){
            //add record of this to medical database from before if medication is one that needs to be monitored
        }
        //PatientRecords.addRX(ID, meds);     //I know this is not right but I'm waiting for the file structure to be finalized
        
    }
}
