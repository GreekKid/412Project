/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atzhealthcare.controllers;

import com.atzhealthcare.models.Appointment;
import com.atzhealthcare.models.CardInfo;
import com.atzhealthcare.models.InsuranceInvoice;
import com.atzhealthcare.models.Invoice;
import com.atzhealthcare.models.PatientInvoice;
import com.atzhealthcare.models.Receipt;

/**
 *
 * @author roscoeturner
 */
public class PaymentController {
    
    /**
     * @param appt id to locate record in database containing data on which to base the invoice
     * @return PatientInvoice object containing patient's bill
     */
    public PatientInvoice generatePatientInvoice(String appt){
        PatientInvoice patInvoice = new PatientInvoice();
        //add logic for adding info to invoice here
        return patInvoice;
    }
    /**
     * @param appt id to locate record in database containing data on which to base the invoice
     * @return InsuranceInvoice object containing insurance providers's bill
     */
    public InsuranceInvoice generateInsuranceInvoice(String appt){
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
    public Invoice generateTotalInvoice(PatientInvoice pat, InsuranceInvoice insur){
        Invoice invoice = new Invoice(pat, insur);
        return invoice;
    }
    
    /**
     * Interacts with external API to process card payments
     * @param cc CardInfo object containing payor information read from the patient's card
     * @return ResponseEntity to signify that the payment was successful upon completion
     */
    public ResponseEntity<Void> payBill(CardInfo cc){
        //communicate with API, sending card details
        return ResponseEntity.ok();
    }

    /**
     * Interacts with Bank's API to transfer funds via direct deposit
     * @param bankInfo customer's entered banking info
     * @return ResponseEnity detailing if transaction was successful
     */
    public ResponseEntity<Void> transferFunds(BankInfo bankInfo){
        //communicate with API, sending bank details
        return ResponseEntity.ok();
    }
    /**
     * generates a receipt based on information pulled from the appointment database
     * @param apptID String passed from the front end to identify a specific stored appointment object
     * @return Receipt object containing data for the front end to render a new receipt document
     */
    public Receipt generateReceipt(String apptID){
        //look up appointment in db based on id. 
        Appointment appointment = new Appointment();
        Invoice invoice = new Invoice();
        return new Receipt(appointment, invoice);
    }
}
