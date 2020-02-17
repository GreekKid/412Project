package com.atzhealthcare.models;

public class CardInfo {

    private int cardNumber;
    private String fName;
    private String lName;

    /**
     * Constructor to generate a populated credit card object
     *
     * @param cardNumber integer credit card number
     * @param fName String first name of payor
     * @param lName String last name of payor
     */
    public CardInfo(int cardNumber, String fName, String lName) {
        this.cardNumber = cardNumber;
        this.fName = fName;
        this.lName = lName;
    }

    /**
     * retrieve card number of payor
     *
     * @return int cardNumber
     */
    public int getCardNumber() {
        return cardNumber;
    }

    /**
     * set card number of payor
     *
     * @param cardNumber integer holding credit card number
     */
    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * retrieve first name of payor
     *
     * @return String first name of payor
     */
    public String getfName() {
        return fName;
    }

    /**
     * sets first name of payor
     *
     * @param fName String first name of payor
     */
    public void setfName(String fName) {
        this.fName = fName;
    }

    /**
     * retrieves last name of payor
     *
     * @return String last name of payor
     */
    public String getlName() {
        return lName;
    }

    /**
     * sets last name of payor
     *
     * @param lName String last name of payor
     */
    public void setlName(String lName) {
        this.lName = lName;
    }

}
