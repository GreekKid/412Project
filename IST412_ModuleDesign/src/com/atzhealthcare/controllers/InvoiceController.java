package com.atzhealthcare.controllers;

import com.atzhealthcare.models.InsuranceInvoice;
import com.atzhealthcare.models.Invoice;
import com.atzhealthcare.models.PatientInvoice;

public class InvoiceController {

    /**
     * @param appt id to locate record in database containing data on which to
     * base the invoice
     * @return PatientInvoice object containing patient's bill
     */
    public PatientInvoice generatePatientInvoice(String appt) {
        PatientInvoice patInvoice = new PatientInvoice();
        //add logic for adding info to invoice here
        return patInvoice;
    }

    /**
     * @param appt id to locate record in database containing data on which to
     * base the invoice
     * @return InsuranceInvoice object containing insurance providers's bill
     */
    public InsuranceInvoice generateInsuranceInvoice(String appt) {
        InsuranceInvoice insuranceInvoice = new InsuranceInvoice();
        //add logic for adding info to invoice here
        return insuranceInvoice;
    }

    /**
     *
     * @param pat PatientInvoice object containing patient's bill
     * @param insur InsuranceInvoice object containing provider's bill
     * @return Invoice object, a newly formatted combined bill
     */
    public Invoice generateTotalInvoice(PatientInvoice pat, InsuranceInvoice insur) {
        Invoice invoice = new Invoice(pat, insur);
        return invoice;
    }
}
