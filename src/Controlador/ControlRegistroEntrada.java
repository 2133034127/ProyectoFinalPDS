package Controlador;

import Modelo.EntProductoDAO;
import Modelo.EntradaProducto;
import Modelo.InventarioDAO;
import Vista.RegistroEntradaProductos;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Hernandez Zarazua Carlos Jerack
 */
public class ControlRegistroEntrada {
    RegistroEntradaProductos vista;

    public ControlRegistroEntrada() {
        this.vista=new RegistroEntradaProductos(this);
    }
    
    public void entradaProductos() throws SQLException{
        ControlEntradaProductos cep = new ControlEntradaProductos();
    }

    public ArrayList<EntradaProducto> obtenerInventario() throws SQLException {
        EntProductoDAO in=new EntProductoDAO();
        return in.obtenerTodosLasEntradasProductos();
    }
}
