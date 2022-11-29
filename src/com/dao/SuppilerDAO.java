/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dao;


import com.entity.Supplier;
import com.model.DatabaseHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class SuppilerDAO{
	public List<Supplier> select() {
        String sql = """

                     """;
        return select(sql);
    }

    public void insert(Supplier model) {
//        String sql = "INSERT INTO SANPHAM (codeProduct, nameProduct, codeProductType, priceProduct, unitProduct, codeSupplier, dateOfManufacture, expiryDate)"
//                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
//                + "";
//        DatabaseHelper.executeUpdate(sql, model.getCodeProduct(), model.getCodeProductType(), model.getCodeSupplier(), model.getDOM(), model.getED());
    }

    public void Update(Supplier model) {
//        String sql = "UPDATE Product SET codeProduct=?, nameProduct=?, codeProductType, priceProduct=?, unitProduct=?, dateOfManufacture=?, expiryDate WHERE codeProduct=?";
//        DatabaseHelper.executeUpdate(sql, model.getCodeProduct(), model.getCodeProductType(), model.getCodeSupplier(), model.getDOM(), model.getED());
    }
    
    private List<Supplier> select(String sql, Object... args) {
        List<Supplier> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = DatabaseHelper.executeQuery(sql, args);
                while (rs.next()) {
                    Supplier model = readFromResultSet(rs);
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;

    }

    private Supplier readFromResultSet(ResultSet rs) throws SQLException {
        Supplier model = new Supplier();
//        model.setCodeProduct(rs.getString("codeProduct"));
//        model.setCodeProductType(rs.getString("codeProductType"));
//        model.setNameProduct(rs.getString("nameProduct"));
//        model.setPrice(rs.getFloat("priceProduct"));
//        model.setAmount(rs.getInt("number"));
//        model.setUnit(rs.getString("unit"));
//        model.setDOM(rs.getString("dateOfManufacture"));
//        model.setED(rs.getString("expiryDate"));
//        model.setNameArea(rs.getString("nameArea"));
//        model.setCodeStorage(rs.getString("codeStorage"));
//        model.setCodeSupplier(rs.getString("codeSupplier"));
        return model;
    }
	
}

