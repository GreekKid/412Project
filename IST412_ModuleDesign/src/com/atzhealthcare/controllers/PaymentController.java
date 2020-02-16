/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atzhealthcare.controllers;

import com.atzhealthcare.models.Appointment;
import com.atzhealthcare.models.InsuranceInvoice;
import com.atzhealthcare.models.Invoice;
import com.atzhealthcare.models.PatientInvoice;

/**
 *
 * @author roscoeturner
 */
public class PaymentController {
    
    /**
     * @param appt Appointment object containing data on which to base the invoice on
     * @return PatientInvoice object containing patient's bill
     */
    public PatientInvoice generatePatientInvoice(Appointment appt){
        PatientInvoice patInvoice = new PatientInvoice();
        //add logic for adding info to invoice here
        return patInvoice;
    }
    /**
     * @param appt Appointment object containing data on which to base the invoice on
     * @return InsuranceInvoice object containing insurance providers's bill
     */
    public InsuranceInvoice generateInsuranceInvoice(Appointment appt){
        InsuranceInvoice insuranceInvoice = new InsuranceInvoice();
        //add logic for adding info to invoice here
        return insuranceInvoice;
    }
}
