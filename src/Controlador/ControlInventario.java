package Controlador;

import Modelo.InventarioDAO;
import Modelo.InventarioProducto;
import Vista.Inventario;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Hernandez Zarazua Carlos Jerack
 */
public class ControlInventario {
    Inventario vista;

    public ControlInventario() {
        this.vista=new Inventario(this);
    }
    
    public void entradaProductos() throws SQLException{
        ControlEntradaProductos cep = new ControlEntradaProductos();
    }

    public ArrayList<InventarioProducto> obtenerInventario() throws SQLException {
        InventarioDAO in=new InventarioDAO();
        return in.obtenerTodoInventario();
    }
}
