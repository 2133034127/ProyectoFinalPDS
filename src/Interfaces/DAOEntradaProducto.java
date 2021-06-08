package Interfaces;

import Modelo.EntradaProducto;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Hernandez Zarazua Carlos Jerack
 */
public interface DAOEntradaProducto {
    public int agregarEntradaPrducto(EntradaProducto eprodcuto)throws SQLException;
    public int borrarEntradaPrducto(int idEntradaProducto)throws SQLException;
    public int actualizarEntradaPrducto(EntradaProducto eprodcuto)throws SQLException;
    public EntradaProducto obtenerEntradaProducto(int idEntradaProducto)throws SQLException;
    public ArrayList<EntradaProducto> obtenerTodosLasEntradasProductos()throws SQLException;
}
