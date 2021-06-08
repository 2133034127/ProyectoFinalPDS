package Modelo;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Hernandez Zarazua Carlos Jerack
 */
public class ModeloProductoEntrante {
    private ProductoDAO pdao;
    private ProveedorDAO pvdao;

    public ModeloProductoEntrante() {
        pdao=new ProductoDAO();
        pvdao=new ProveedorDAO();
    }
    
    public ArrayList<Producto> obtenerProductos() throws SQLException {
        ArrayList<Producto> lista=pdao.obtenerTodosLosProductos();
        return lista;
    }
    
    public ArrayList<Proveedor> obtenerProveedores() throws SQLException {
        ArrayList<Proveedor> lista=pvdao.obtenerTodosLosProveedores();
        return lista;
    }
}
