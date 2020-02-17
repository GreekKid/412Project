package com.atzhealthcare.models;

public class BankInfo {
    private int routingNumber;
    private int accountNumber;

    /**
     * Constructor to create a new BankInfo object so customer may transfer funds via direct deposit
     * @param routingNumber integer containing customer bank's routing number
     * @param accountNumber integer containing customer's account number at bank
     */
    public BankInfo(int routingNumber, int accountNumber) {
        this.routingNumber = routingNumber;
        this.accountNumber = accountNumber;
    }
    
    
}
