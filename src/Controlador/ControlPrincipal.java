package Controlador;

import Vista.Principal;
import java.sql.SQLException;

/**
 * @author Hernandez Zarazua Carlos Jerack
 */
public class ControlPrincipal {
    Principal principal;

    public ControlPrincipal() {
        crearVentanaPrincipal();
    }
    
    public void entradaProductos() throws SQLException{
        ControlEntradaProductos cep = new ControlEntradaProductos();
    }
        
    public void crearVentanaPrincipal(){
        principal=new Principal(this);        
    }
}
