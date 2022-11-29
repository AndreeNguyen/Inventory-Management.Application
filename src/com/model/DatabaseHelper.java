/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author My PC
 */
public class DatabaseHelper {

    public static Connection oppenConnection() throws SQLException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String DB_URL = "jdbc:sqlserver://localhost:1433;"
                    + "databaseName=;";
            String USER_NAME = "sa";
            String PASSWORD = "123";
            Connection con = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            return con;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static PreparedStatement getPreSta(String sql, Object... args) throws SQLException {
        Connection con = DatabaseHelper.oppenConnection();
        PreparedStatement ps = null;
        if (sql.trim().startsWith("{")) {
            ps = con.prepareCall(sql);//proc
        } else {
            ps = con.prepareStatement(sql);//sql
        }
        for (int i = 0; i < args.length; i++) {
            ps.setObject(i + 1, args[i]);
        }
        return ps;

    }

    public static ResultSet executeQuery(String sql, Object... args) {
        try {
            PreparedStatement ps = DatabaseHelper.getPreSta(sql, args);
            return ps.executeQuery();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void executeUpdate(String sql, Object... args) {
        try {
            PreparedStatement ps = DatabaseHelper.getPreSta(sql, args);
            try {
                ps.executeUpdate();
            } finally {
                ps.getConnection().close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Object value(String sql, Object... args) {
        try {
            ResultSet rs = DatabaseHelper.executeQuery(sql, args);
            if (rs.next()) {
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
        } catch (Exception e) {

        }
        return null;
    }
}
