package com.atzhealthcare.models;

public class Invoice {
    
    private PatientInvoice patInvoice;
    private InsuranceInvoice insuranceInvoice;
    /**
     * Default constructor to create a new blank invoice instance.
     */
    public Invoice() {
       
    }

    /**
     * Constructor to combine existing patient and insurance invoice objects
     * @param patInvoice a populated PatientInvoice object
     * @param insuranceInvoice a populated InsuranceInvoice object
     */
    public Invoice(PatientInvoice patInvoice, InsuranceInvoice insuranceInvoice) {
        this.patInvoice = patInvoice;
        this.insuranceInvoice = insuranceInvoice;
    }
    
    
    
}
