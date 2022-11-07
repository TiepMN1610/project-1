/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reposition;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author admin
 */
public class DBConnection {

    public static Connection getConnection() {
        String URL = "jdbc:sqlserver://localhost:1433;databaseName=FINALASS_FPOLY_NET_JAVA_SM22_BL2;encrypt=true;trustservercertificate=true";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(URL, "sa", "123123");
        } // Handle any errors that may have occurred.
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(getConnection());
    }
}
