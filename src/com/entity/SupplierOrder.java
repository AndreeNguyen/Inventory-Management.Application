/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entity;

import java.util.Date;

public class SupplierOrder {

    private String codeOrderSupplier;
    private float amount;
    private Date dateOrder;
    private String nameStaffOrder;
    private byte status;

    public SupplierOrder() {
        super();
    }

    public SupplierOrder(String codeOrderSupplier, float amount, Date dateOrder, String nameStaffOrder, byte status) {
        super();
        this.codeOrderSupplier = codeOrderSupplier;
        this.amount = amount;
        this.dateOrder = dateOrder;
        this.nameStaffOrder = nameStaffOrder;
        this.status = status;
    }

    public String getCodeOrderSupplier() {
        return codeOrderSupplier;
    }

    public void setCodeOrderSupplier(String codeOrderSupplier) {
        this.codeOrderSupplier = codeOrderSupplier;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Date getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(Date dateOrder) {
        this.dateOrder = dateOrder;
    }

    public String getNameStaffOrder() {
        return nameStaffOrder;
    }

    public void setNameStaffOrder(String nameStaffOrder) {
        this.nameStaffOrder = nameStaffOrder;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }

}
