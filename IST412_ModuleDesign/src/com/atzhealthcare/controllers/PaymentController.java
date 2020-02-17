package com.atzhealthcare.controllers;

import com.atzhealthcare.models.Appointment;
import com.atzhealthcare.models.BankInfo;
import com.atzhealthcare.models.CardInfo;
import com.atzhealthcare.models.Invoice;
import com.atzhealthcare.models.Receipt;
import javax.xml.ws.Response;

public class PaymentController {
    
    /**
     * Interacts with external API to process card payments
     * @param cc CardInfo object containing payor information read from the patient's card
     * @param apptID String passed from the front end to identify a specific stored appointment object
     * @param shouldGenerateReceipt flag to determine if generateRecipt method is called
     * @return ResponseEntity to signify that the payment was successful upon completion, also holds Receipt object if present
     */
    public  Class<Response> payBill(CardInfo cc, String apptID, boolean shouldGenerateReceipt){
        //communicate with API, sending card details
         return Response.class;
    }

    /**
     * Interacts with Bank's API to transfer funds via direct deposit
     * @param bankInfo customer's entered banking info
     * @param apptID String passed from the front end to identify a specific stored appointment object
     * @param shouldGenerateReceipt flag to determine if generateRecipt method is called
     * @return ResponseEnity detailing if transaction was successful, also holds Receipt object if present
     */
    public Class<Response> transferFunds(BankInfo bankInfo, String apptID, boolean shouldGenerateReceipt){
        //communicate with API, sending bank details
        
        return Response.class;
    }
    /**
     * Generates a receipt based on information pulled from the appointment database
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
