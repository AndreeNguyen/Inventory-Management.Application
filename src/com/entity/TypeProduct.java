/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.entity;



public class TypeProduct {

    private String codeTypeProduct;
    private String nameTypeProduct;
    private String codeSupplier;

    public TypeProduct() {
        super();
    }

    public TypeProduct(String codeTypeProduct, String nameTypeProduct, String codeSupplier) {
        super();
        this.codeTypeProduct = codeTypeProduct;
        this.nameTypeProduct = nameTypeProduct;
        this.codeSupplier = codeSupplier;
    }

    public String getCodeTypeProduct() {
        return codeTypeProduct;
    }

    public void setCodeTypeProduct(String codeTypeProduct) {
        this.codeTypeProduct = codeTypeProduct;
    }

    public String getNameTypeProduct() {
        return nameTypeProduct;
    }

    public void setNameTypeProduct(String nameTypeProduct) {
        this.nameTypeProduct = nameTypeProduct;
    }

    public String getCodeSupplier() {
        return codeSupplier;
    }

    public void setCodeSupplier(String codeSupplier) {
        this.codeSupplier = codeSupplier;
    }

}
