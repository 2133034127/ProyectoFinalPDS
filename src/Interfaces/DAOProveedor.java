package Interfaces;

import Modelo.Proveedor;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Hernandez Zarazua Carlos Jerack
 */
public interface DAOProveedor {
    public int agregarProveedor(Proveedor proveedor)throws SQLException;
    public int borrarProveedor(int idProveedor)throws SQLException;
    public int actualizarProveedor(Proveedor proveedor)throws SQLException;
    public Proveedor obtenerProducto(int idProveedor)throws SQLException;
    public ArrayList<Proveedor> obtenerTodosLosProveedores()throws SQLException;
}
