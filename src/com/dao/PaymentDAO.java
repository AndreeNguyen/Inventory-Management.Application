package com.dao;

import com.entity.Payment;
import com.model.DatabaseHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class PaymentDAO {
	public List<Payment> select() {
        String sql = """

                     """;
        return select(sql);
    }

    public void insert(Payment model) {
//        String sql = "INSERT INTO SANPHAM (codeProduct, nameProduct, codeProductType, priceProduct, unitProduct, codeSupplier, dateOfManufacture, expiryDate)"
//                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
//                + "";
//        DatabaseHelper.executeUpdate(sql, model.getCodeProduct(), model.getCodeProductType(), model.getCodeSupplier(), model.getDOM(), model.getED());
    }

    public void Update(Payment model) {
//        String sql = "UPDATE Product SET codeProduct=?, nameProduct=?, codeProductType, priceProduct=?, unitProduct=?, dateOfManufacture=?, expiryDate WHERE codeProduct=?";
//        DatabaseHelper.executeUpdate(sql, model.getCodeProduct(), model.getCodeProductType(), model.getCodeSupplier(), model.getDOM(), model.getED());
    }
    
    private List<Payment> select(String sql, Object... args) {
        List<Payment> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = DatabaseHelper.executeQuery(sql, args);
                while (rs.next()) {
                    Payment model = readFromResultSet(rs);
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

    private Payment readFromResultSet(ResultSet rs) throws SQLException {
        Payment model = new Payment();
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
