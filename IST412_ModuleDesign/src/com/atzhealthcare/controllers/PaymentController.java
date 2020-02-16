/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.atzhealthcare.controllers;

import com.atzhealthcare.models.Appointment;
import com.atzhealthcare.models.Invoice;

/**
 *
 * @author roscoeturner
 */
public class PaymentController {
    
    /**
     * @param appt Appointment object containing data on which to base the invoice on
     * @return Invoice object containing total bill
     */
    public Invoice generateInvoice(Appointment appt){
        Invoice invoice = new Invoice();
        //add logic for adding info to invoice here
        return invoice;
    }
}
