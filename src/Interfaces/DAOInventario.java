package Interfaces;

import Modelo.InventarioProducto;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Hernandez Zarazua Carlos Jerack
 */
public interface DAOInventario {
    public int agregarInventario(InventarioProducto inventario)throws SQLException;    
    public int actualizarInventario(InventarioProducto inventario)throws SQLException;
    public InventarioProducto obtenerUnInventario(int idProducto)throws SQLException;
    public ArrayList<InventarioProducto> obtenerTodoInventario()throws SQLException;    
}
