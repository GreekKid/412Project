/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

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
    
}
