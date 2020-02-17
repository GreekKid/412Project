package com.atzhealthcare.models;

public class Receipt {
    private Appointment appt;
    private Invoice invoice;

    /**
     * Constructor to create a receipt object
     * @param appt patient appointment object holding information regarding the passed in appointment 
     * @param invoice invoice containing billing information  for the patient and insurance provider
     */
    public Receipt(Appointment appt, Invoice invoice) {
        this.appt = appt;
        this.invoice = invoice;
    }
    
    
}
