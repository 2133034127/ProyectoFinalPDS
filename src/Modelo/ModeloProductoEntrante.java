package Modelo;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Hernandez Zarazua Carlos Jerack
 */
public class ModeloProductoEntrante {
    private ProductoDAO pdao;

    public ModeloProductoEntrante() {
        pdao=new ProductoDAO();
    }
    public String[] obtenerProductos() throws SQLException {
        ArrayList<Producto> lista=pdao.obtenerTodosLosProductos();
        String productos[]=(String[]) lista.toArray();        
        return productos;
    }
        
}
