/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entity;

public class Storage {

    private String codeStorage;
    private String nameStorage;
    private String address;
    private String codeStaff;

    public Storage() {
        super();
    }

    public Storage(String codeStorage, String nameStorage, String address, String codeStaff) {
        super();
        this.codeStorage = codeStorage;
        this.nameStorage = nameStorage;
        this.address = address;
        this.codeStaff = codeStaff;
    }

    public String getCodeStorage() {
        return codeStorage;
    }

    public void setCodeStorage(String codeStorage) {
        this.codeStorage = codeStorage;
    }

    public String getNameStorage() {
        return nameStorage;
    }

    public void setNameStorage(String nameStorage) {
        this.nameStorage = nameStorage;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCodeStaff() {
        return codeStaff;
    }

    public void setCodeStaff(String codeStaff) {
        this.codeStaff = codeStaff;
    }

}
