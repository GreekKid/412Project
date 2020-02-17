package com.atzhealthcare.controllers;

import com.atzhealthcare.models.Appointment;
import com.atzhealthcare.models.InsuranceInvoice;
import com.atzhealthcare.models.Invoice;
import com.atzhealthcare.models.PatientInvoice;

public class InvoiceController {

    /**
     * Generates a patient invoice based on specific appointment information
     * @param appt appointment information from appointment database
     * @return PatientInvoice object containing patient's bill
     */
    public PatientInvoice generatePatientInvoice(Appointment appt) {
        PatientInvoice patInvoice = new PatientInvoice();
        //add logic for adding info to invoice here
        return patInvoice;
    }

    /**
     * Generates an invoice used tfor billing the patient's insurance provider
     * @param appt appointment information from appointment database
     * @return InsuranceInvoice object containing insurance providers's bill
     */
    public InsuranceInvoice generateInsuranceInvoice(Appointment appt) {
        InsuranceInvoice insuranceInvoice = new InsuranceInvoice();
        //add logic for adding info to invoice here
        return insuranceInvoice;
    }

    /**
     * Generates a combined invoice of insurance and patient invoices
     * @param appt id to locate record in database containing data on which to
     * base the invoice
     * @return Invoice object, a newly formatted combined bill
     */
    public Invoice generateTotalInvoice(String appt) {
        Invoice invoice = new Invoice();
        return invoice;
    }
}
