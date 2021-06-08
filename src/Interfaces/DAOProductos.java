package Interfaces;

import Modelo.Producto;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Hernandez Zarazua Carlos Jerack
 */
public interface DAOProductos {
    public int agregarPrducto(Producto prodcuto)throws SQLException;
    public int borrarPrducto(int idProducto)throws SQLException;
    public int actualizarPrducto(Producto prodcuto)throws SQLException;
    public Producto obtenerProducto(int idProducto)throws SQLException;
    public ArrayList<Producto> obtenerTodosLosProductos()throws SQLException;
}
