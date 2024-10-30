package com.eclerx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {

    static final String DB_URL = "jdbc:mysql://localhost/eclerx_db";
    static final String USER = "root";
    static final String PASS = "rootroot";
    static final String QUERY = "SELECT id, name, salary FROM Employees";

    public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(QUERY);) {
         // Extract data from result set

         List<Employee> employees = new ArrayList<>();
         while (rs.next()) {
            // Retrieve by column name
            System.out.print("ID: " + rs.getInt("id"));
            System.out.print(", Name: " + rs.getString("name"));
            System.out.print(", Salary: " + rs.getDouble("salary"));
            // System.out.println(", Last: " + rs.getString("last"));

            // Retrieve by column index
            int id = rs.getInt("id");
            String name = rs.getString(2);
            double salary = rs.getDouble(3);

            Employee employee = new Employee(id, name, salary);
            System.out.println(employee);
            employees.add(employee);

         }

         System.out.println(employees);
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }

    // 1. Create a connection


    // 2. Create a statement/query

    // 3. Execute the query

    // 4. Process the result set

    // 5. Close the connection
}
