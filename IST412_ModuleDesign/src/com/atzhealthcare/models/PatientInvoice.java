/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atzhealthcare.models;

public class PatientInvoice {

    private double patientCopay;
    private Appointment appt;
    
    /**
     *Default constructor to generate an empty PatientInvoice object
     */
    public PatientInvoice(){}
    /**
     * Creates a new invoice instance populated with relevant patient data
     *
     * @param patientCopay amount of bill patient will pay.
     * @param appt Appointment object holding data relevant to patient's
     * appointment
     */
    public PatientInvoice(double patientCopay, Appointment appt) {
        this.patientCopay = patientCopay;
        this.appt = appt;
    }

    /**
     * retrieves patient's balance
     *
     * @return patient bill
     */
    public double getPatientCopay() {
        return patientCopay;
    }

    /**
     * sets patient's balance.
     *
     * @param patientCopay patient's bill
     */
    public void setPatientCopay(double patientCopay) {
        this.patientCopay = patientCopay;
    }

    /**
     * retrieves data about patient's appointment
     *
     * @return Appointment object containing relevant appointment data
     */
    public Appointment getAppt() {
        return appt;
    }

    /**
     * sets patient appointment data
     *
     * @param appt Appointment object containing relevant patient appointment
     * data
     */
    public void setAppt(Appointment appt) {
        this.appt = appt;
    }

}
