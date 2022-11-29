/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entity;

import java.util.Date;

public class TimeKeeping {

    private String codeStaff;
    private Date checkin;
    private Date checkout;
    private boolean overtime;
    private String codeStorage;

    public TimeKeeping() {
        super();
    }

    public TimeKeeping(String codeStaff, Date checkin, Date checkout, boolean overtime, String codeStorage) {
        super();
        this.codeStaff = codeStaff;
        this.checkin = checkin;
        this.checkout = checkout;
        this.overtime = overtime;
        this.codeStorage = codeStorage;
    }

    public String getCodeStaff() {
        return codeStaff;
    }

    public void setCodeStaff(String codeStaff) {
        this.codeStaff = codeStaff;
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    public boolean isOvertime() {
        return overtime;
    }

    public void setOvertime(boolean overtime) {
        this.overtime = overtime;
    }

    public String getCodeStorage() {
        return codeStorage;
    }

    public void setCodeStorage(String codeStorage) {
        this.codeStorage = codeStorage;
    }

}
