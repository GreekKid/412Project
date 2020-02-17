/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atzhealthcare.controllers;

import java.util.ArrayList;

/**
 *
 * @author reedm
 */
public class PatientRecords {
    
    /**
     * Takes in patient ID number, and returns patient chart as a JSON array to be parsed
     * @param ID Integer ID of patient that will be requested to the database.
     * @return JSON array from associated medical records database.
     */
    public ArrayList getRecord(Integer ID){
        //xmlhttp request to get from MongoDB, or however you pull from it
        ArrayList<String> records = new ArrayList<>();
        //Using JSON instead of ArrayList in the JavaScript code
        return records;
    }
    
    /**
     * Translates the records into a human-readable format.
     * @param records Patient chart normally gained from getRecord(). In JSON form.
     * @return Appropriately processed JSON.
     */
    public ArrayList parseRecords(ArrayList records){
        while(records.size() > 0){
            records = records;  //filler for breaking down the code however we see fit
        }
        
        return records;
    }
    
    
    /**
     * Adds prescription to patient records.
     * @param ID Patient ID
     * @param prescription Prescription medication being added to patient's record.
     */
    public void addRX(Integer ID, String prescription){
        //add prescription to patient's records in the DB
    }
}
