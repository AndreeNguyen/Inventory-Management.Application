/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entity;

import java.util.Date;

public class Payment {

    private String codePayment;
    private String codeOrderSupplier;
    private String companyName;
    private String phoneNumber;
    private float amount;
    private float payment;
    private float outstandingAmount;
    private Date dateRegister;
    private String paymentMethod;
    private String note;

    public Payment() {
        super();
    }

    public Payment(String codePayment, String codeOrderSupplier, String companyName, String phoneNumber, float amount,
            float payment, float outstandingAmount, Date dateRegister, String paymentMethod, String note) {
        super();
        this.codePayment = codePayment;
        this.codeOrderSupplier = codeOrderSupplier;
        this.companyName = companyName;
        this.phoneNumber = phoneNumber;
        this.amount = amount;
        this.payment = payment;
        this.outstandingAmount = outstandingAmount;
        this.dateRegister = dateRegister;
        this.paymentMethod = paymentMethod;
        this.note = note;
    }

    public String getCodePayment() {
        return codePayment;
    }

    public void setCodePayment(String codePayment) {
        this.codePayment = codePayment;
    }

    public String getCodeOrderSupplier() {
        return codeOrderSupplier;
    }

    public void setCodeOrderSupplier(String codeOrderSupplier) {
        this.codeOrderSupplier = codeOrderSupplier;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getPayment() {
        return payment;
    }

    public void setPayment(float payment) {
        this.payment = payment;
    }

    public float getOutstandingAmount() {
        return outstandingAmount;
    }

    public void setOutstandingAmount(float outstandingAmount) {
        this.outstandingAmount = outstandingAmount;
    }

    public Date getDateRegister() {
        return dateRegister;
    }

    public void setDateRegister(Date dateRegister) {
        this.dateRegister = dateRegister;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}
