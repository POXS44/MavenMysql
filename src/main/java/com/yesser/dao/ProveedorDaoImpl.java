package com.yesser.dao;

import com.yesser.conexion.Conexion;
import com.yesser.modelo.Proveedor;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class ProveedorDaoImpl implements ProveedorDao{

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public List<Proveedor> findAll() {
        return null;
    }

    @Override
    public int insert(Proveedor proveedor) {
        int registrar = -1;

        Statement stm= null;
        Connection con=null;

        String sql="INSERT INTO proveedor values (NULL,'"+proveedor.getNombre()+"')";

        try {
            con= Conexion.conectar();
            stm= con.createStatement();
            stm.execute(sql);
            registrar=1;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método registrar");
            e.printStackTrace();
        }
        return registrar;
    }

    @Override
    public int update(Proveedor proveedor) {

        int actualizar = -1;

        Statement stm= null;
        Connection con=null;

        String sql="UPDATE proveedor SET nombre = '"+proveedor.getNombre()+"' WHERE id = 6";

        try {
            con= Conexion.conectar();
            stm= con.createStatement();
            stm.execute(sql);
            actualizar=1;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: Clase ClienteDaoImple, método registrar");
            e.printStackTrace();
        }
        return actualizar;


    }

}
