package com.atzhealthcare.controllers;

import com.atzhealthcare.models.Appointment;
import com.atzhealthcare.models.CardInfo;
import com.atzhealthcare.models.Invoice;
import com.atzhealthcare.models.Receipt;

public class PaymentController {
    
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
    private Receipt generateReceipt(String apptID){
        //look up appointment in db based on id. 
        Appointment appointment = new Appointment();
        Invoice invoice = new Invoice();
        return new Receipt(appointment, invoice);
    }
}
