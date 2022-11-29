/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entity;

public class Salary {

    private String codeSatff;
    private double bonusOT;
    private double bonusKPI;
    private double basicSalary;
    private String dateReceived;
    private double totalSalary;
    private String codeStorage;

    public Salary() {
        super();
    }

    public Salary(String codeSatff, double bonusOT, double bonusKPI, double basicSalary, String dateReceived,
            double totalSalary, String codeStorage) {
        super();
        this.codeSatff = codeSatff;
        this.bonusOT = bonusOT;
        this.bonusKPI = bonusKPI;
        this.basicSalary = basicSalary;
        this.dateReceived = dateReceived;
        this.totalSalary = totalSalary;
        this.codeStorage = codeStorage;
    }

    public String getCodeSatff() {
        return codeSatff;
    }

    public void setCodeSatff(String codeSatff) {
        this.codeSatff = codeSatff;
    }

    public double getBonusOT() {
        return bonusOT;
    }

    public void setBonusOT(double bonusOT) {
        this.bonusOT = bonusOT;
    }

    public double getBonusKPI() {
        return bonusKPI;
    }

    public void setBonusKPI(double bonusKPI) {
        this.bonusKPI = bonusKPI;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public String getDateReceived() {
        return dateReceived;
    }

    public void setDateReceived(String dateReceived) {
        this.dateReceived = dateReceived;
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }

    public String getCodeStorage() {
        return codeStorage;
    }

    public void setCodeStorage(String codeStorage) {
        this.codeStorage = codeStorage;
    }

}
