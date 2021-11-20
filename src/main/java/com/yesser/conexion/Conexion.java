package com.yesser.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public static Connection conectar() {
        Connection con = null;

        String password = "1234";
        String usuario = "root";
        String url = "jdbc:mysql://localhost:3306/mavenmysql?user=" + usuario
                + "&password=" + password + "&useSSL=false";
        try {
            con = DriverManager.getConnection(url);
            if (con != null) {
                System.out.println("Conectado");
            }
        } catch (SQLException e) {
            System.out.println("No se pudo conectar a la base de datos");
            e.printStackTrace();
        }
        return con;
    }
}
