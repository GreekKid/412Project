/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atzhealthcare.models;

public class Invoice {
    private double insuranceCopay;
    private double patientCopay;
    private Appointment appt;

    /**
     * Default constructor to create a new blank invoice instance.
     */
    public Invoice() {
       
    }

    /**
     * Creates a new invoice instance populated with relevant patient data
     * @param insuranceCopay amount of bill insurance will pay.
     * @param patientCopay amount of bill patient will pay.
     * @param appt Appointment object holding data relevant to patient's appointment
     */
    public Invoice(double insuranceCopay, double patientCopay, Appointment appt) {
        this.insuranceCopay = insuranceCopay;
        this.patientCopay = patientCopay;
        this.appt = appt;
    }
    
    /**
     * retrieves insurance provider's balance.
     * @return insurance bill
     */
    public double getInsuranceCopay() {
        return insuranceCopay;
    }

    /**
     * sets insurance provider's balance.
     * @param insuranceCopay insurance bill
     */
    public void setInsuranceCopay(double insuranceCopay) {
        this.insuranceCopay = insuranceCopay;
    }
    
    /**
     * retrieves patient's balance
     * @return patient bill
     */
    public double getPatientCopay() {
        return patientCopay;
    }
    
    /**
     * sets patient's balance.
     * @param patientCopay patient's bill
     */
    public void setPatientCopay(double patientCopay) {
        this.patientCopay = patientCopay;
    }

    /**
     * retrieves data about patient's appointment
     * @return Appointment object containing relevant appointment data
     */
    public Appointment getAppt() {
        return appt;
    }

    /**
     * sets patient appointment data
     * @param appt Appointment object containing relevant patient appointment data
     */
    public void setAppt(Appointment appt) {
        this.appt = appt;
    }
    
    
}
