package Modelo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Hernandez Zarazua Carlos Jerack
 */
public class ModeloProductoEntrante {
    private ProductoDAO pdao;
    private ProveedorDAO pvdao;
    private EntProductoDAO epdao;
    private InventarioDAO indao;
            
    public ModeloProductoEntrante() {
        pdao=new ProductoDAO();
        pvdao=new ProveedorDAO();
        epdao=new EntProductoDAO();
        indao=new InventarioDAO();
    }
    
    public ArrayList<Producto> obtenerProductos() throws SQLException {
        ArrayList<Producto> lista=pdao.obtenerTodosLosProductos();
        return lista;
    }
    
    public ArrayList<Proveedor> obtenerProveedores() throws SQLException {
        ArrayList<Proveedor> lista=pvdao.obtenerTodosLosProveedores();
        return lista;
    }

    public void agregarEntrada(EntradaProducto epro) {
        try {
            epdao.agregarEntradaPrducto(epro);
            InventarioProducto ip=indao.obtenerUnInventario(epro.getIdProducto());
            ip.setNoPiezas(ip.getNoPiezas()+epro.getNoPiezas());
            indao.actualizarInventario(ip);
        } catch (SQLException ex) {
            Logger.getLogger(ModeloProductoEntrante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
