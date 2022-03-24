package com.codurance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyFirstDatabaseConnection {

  public static void main(String[] args) throws SQLException {
    String url = "jdbc:derby://localhost:1527/zoo";
    try (Connection conn = DriverManager.getConnection(url);
        PreparedStatement ps = conn.prepareStatement("SELECT name FROM exhibits");
        ResultSet rs = ps.executeQuery()) {
      while (rs.next()) {
        System.out.println(rs.getString(1));
      }
    }
  }
}
