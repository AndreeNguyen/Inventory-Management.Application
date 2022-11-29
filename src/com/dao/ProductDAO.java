/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dao;


import com.entity.Product;
import com.model.DatabaseHelper;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public class ProductDAO {
    public List<Product> select() {
        String sql = """

                     """;
        return select(sql);
    }

    public void insert(Product model) {
        String sql = "INSERT INTO SANPHAM (codeProduct, nameProduct, codeProductType, priceProduct, unitProduct, codeSupplier, dateOfManufacture, expiryDate)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
                + "";
        DatabaseHelper.executeUpdate(sql, model.getCodeProduct(), model.getCodeProductType(), model.getCodeSupplier(), model.getDOM(), model.getED());
    }

    public void Update(Product model) {
        String sql = "UPDATE Product SET codeProduct=?, nameProduct=?, codeProductType, priceProduct=?, unitProduct=?, dateOfManufacture=?, expiryDate WHERE codeProduct=?";
        DatabaseHelper.executeUpdate(sql, model.getCodeProduct(), model.getCodeProductType(), model.getCodeSupplier(), model.getDOM(), model.getED());
    }

    public Product findByName(String codeProduct, String nameStorage) {
        String sql;
        sql = """
        		
        	  """;
        List<Product> list = selectCT(sql, codeProduct, nameStorage);
        return list.size() > 0 ? list.get(0) : null;
    }

    public List<Object[]> getNameStorage(String Kho) {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "{call sp_getNameStorage (?)}";
                rs = DatabaseHelper.executeQuery(sql, Kho);
                while (rs.next()) {
                    Object[] model = {
                        rs.getString("MaSP"),
                        rs.getString("nameStorage"),
                        rs.getString("nameProductType"),
                        rs.getString("amount"),
                        rs.getString("priceProduct"),
                        rs.getString("Unit"),
                        rs.getString("nameArea"),
                        rs.getString("codeStorage"),
                        rs.getString("codeSupplier")
                    };
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;
    }

    public List<Object[]> getProductType(String TenLH) {
        List<Object[]> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                String sql = "{call sp_getNameProductType (?)}";
                rs = DatabaseHelper.executeQuery(sql, TenLH);
                while (rs.next()) {
                    Object[] model = {
                    		rs.getString("MaSP"),
                            rs.getString("nameStorage"),
                            rs.getString("nameProductType"),
                            rs.getString("amount"),
                            rs.getString("priceProduct"),
                            rs.getString("Unit"),
                            rs.getString("nameArea"),
                            rs.getString("codeStorage"),
                            rs.getString("codeSupplier")
                    };
                    list.add(model);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return list;
    }

    private List<Product> select(String sql, Object... args) {
        List<Product> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = DatabaseHelper.executeQuery(sql, args);
                while (rs.next()) {
                    Product model = readFromResultSet(rs);
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

    private Product readFromResultSet(ResultSet rs) throws SQLException {
        Product model = new Product();
//        model.setNameProduct(rs.getString("nameProduct"));
//        model.setNametypeProduct(rs.getString("nameTypeProduct"));
//        model.setAmount(rs.getInt("number"));
//        model.setPrice(rs.getFloat("priceProduct"));
//        model.setUnit(rs.getString("unit"));
//        model.setNameArea(rs.getString("nameArea"));
//        model.setCodeStorage(rs.getString("codeStorage"));
//        model.setCodeSupplier(rs.getString("nameSupplier"));
        return model;
    }

    private List<Product> selectCT(String sql, Object... args) {
        List<Product> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = DatabaseHelper.executeQuery(sql, args);
                while (rs.next()) {
                    Product model = readFromResultSetCT(rs);
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

    private Product readFromResultSetCT(ResultSet rs)  {
        Product model = new Product();
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
