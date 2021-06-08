package Controlador;

import Modelo.EntradaProducto;
import Modelo.ModeloProductoEntrante;
import Vista.ProductoEntrante;
import java.sql.SQLException;

/**
 * @author Hernandez Zarazua Carlos Jerack
 */
public class ControlEntradaProductos {
    private ProductoEntrante ventanaPE;
    private ModeloProductoEntrante modelo;
    
    public ControlEntradaProductos() throws SQLException{
        modelo=new ModeloProductoEntrante();
        crearVentanaProductoEntrante();
    }
    
    public void controlPrincipal(){
        ControlPrincipal cp=new ControlPrincipal();        
    }
    
    public void crearVentanaProductoEntrante() throws SQLException{        
        ventanaPE=new ProductoEntrante(this,modelo);      
        ventanaPE.llenarComboProductos(modelo.obtenerProductos());
        ventanaPE.llenarComboProveedores(modelo.obtenerProveedores());
    }

    public void agregarEntrada(EntradaProducto epro) {
        modelo.agregarEntrada(epro);
    }
}
