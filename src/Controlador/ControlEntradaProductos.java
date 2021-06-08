package Controlador;

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
        crearVentanaProductoEntrante();
        modelo=new ModeloProductoEntrante();
    }
    
    public void controlPrincipal(){
        ControlPrincipal cp=new ControlPrincipal();        
    }
    
    public void crearVentanaProductoEntrante() throws SQLException{        
        ventanaPE=new ProductoEntrante(this,modelo);        
    }
}
