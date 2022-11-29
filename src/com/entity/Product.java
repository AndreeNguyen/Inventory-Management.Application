/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entity;

public class Product {

    private String nameProduct;
    private String nametypeProduct;
    private int amount;
    private float price;
    private String unit;
    private String nameArea;
    private String codeProduct;
    private String codeProductType;
    private String codeStorage;
    private String codeSupplier;
    private String DOM;
    private String ED;

    public Product() {

    }

    public Product(String nameProduct, String nametypeProduct, int amount, float price, String unit, String nameArea,
            String codeProduct, String codeProductType, String codeStorage, String codeSupplier, String dOM,
            String eD) {
        super();
        this.nameProduct = nameProduct;
        this.nametypeProduct = nametypeProduct;
        this.amount = amount;
        this.price = price;
        this.unit = unit;
        this.nameArea = nameArea;
        this.codeProduct = codeProduct;
        this.codeProductType = codeProductType;
        this.codeStorage = codeStorage;
        this.codeSupplier = codeSupplier;
        DOM = dOM;
        ED = eD;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getNametypeProduct() {
        return nametypeProduct;
    }

    public void setNametypeProduct(String nametypeProduct) {
        this.nametypeProduct = nametypeProduct;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getNameArea() {
        return nameArea;
    }

    public void setNameArea(String nameArea) {
        this.nameArea = nameArea;
    }

    public String getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(String codeProduct) {
        this.codeProduct = codeProduct;
    }

    public String getCodeProductType() {
        return codeProductType;
    }

    public void setCodeProductType(String codeProductType) {
        this.codeProductType = codeProductType;
    }

    public String getCodeStorage() {
        return codeStorage;
    }

    public void setCodeStorage(String codeStorage) {
        this.codeStorage = codeStorage;
    }

    public String getCodeSupplier() {
        return codeSupplier;
    }

    public void setCodeSupplier(String codeSupplier) {
        this.codeSupplier = codeSupplier;
    }

    public String getDOM() {
        return DOM;
    }

    public void setDOM(String dOM) {
        DOM = dOM;
    }

    public String getED() {
        return ED;
    }

    public void setED(String eD) {
        ED = eD;
    }

}
