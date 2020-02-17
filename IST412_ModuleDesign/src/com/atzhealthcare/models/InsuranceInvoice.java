package com.atzhealthcare.models;

public class InsuranceInvoice {

    private double insuranceCopay;
    private Appointment appt;
    
    /**
     *Default constructor to generate an empty InsuranceInvoice object
     */
    public InsuranceInvoice(){}
    /**
     * Creates a new invoice instance populated with relevant patient data
     *
     * @param insuranceCopay amount of bill insurance will pay.
     * @param appt Appointment object holding data relevant to patient's
     * appointment
     */
    public InsuranceInvoice(double insuranceCopay, Appointment appt) {
        this.insuranceCopay = insuranceCopay;
        this.appt = appt;
    }

    /**
     * retrieves insurance provider's balance.
     *
     * @return insurance bill
     */
    public double getInsuranceCopay() {
        return insuranceCopay;
    }

    /**
     * sets insurance provider's balance.
     *
     * @param insuranceCopay insurance bill
     */
    public void setInsuranceCopay(double insuranceCopay) {
        this.insuranceCopay = insuranceCopay;
    }
}
