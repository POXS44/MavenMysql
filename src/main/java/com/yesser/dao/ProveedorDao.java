package com.yesser.dao;

import com.yesser.modelo.Proveedor;

import java.util.List;

public interface ProveedorDao {

    public int delete(int id);
    public List<Proveedor> findAll();
    public int insert(Proveedor proveedor);
    public int update(Proveedor proveedor);
}
