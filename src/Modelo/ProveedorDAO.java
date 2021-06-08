package Modelo;

import Interfaces.DAOProveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Hernandez Zarazua Carlos Jerack
 */
public class ProveedorDAO implements DAOProveedor{
    
    private Connection conexionBD;

    private void conectarBD() {
        conexionBD = ConexionBD.obtenerConexion();
    }
    
    @Override
    public int agregarProveedor(Proveedor proveedor) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int borrarProveedor(int idProveedor) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int actualizarProveedor(Proveedor proveedor) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Proveedor obtenerProducto(int idProveedor) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Proveedor> obtenerTodosLosProveedores() throws SQLException {
        conectarBD();
        String query="SELECT * from Proveedor";
        PreparedStatement ps=conexionBD.prepareStatement(query);        
        ResultSet rs=ps.executeQuery();
        Proveedor proveedor;
        ArrayList<Proveedor> lista=new ArrayList();
        while(rs.next()){            
            proveedor=new Proveedor();
            proveedor.setIdProveedor(rs.getInt("idProveedor"));
            proveedor.setNombre(rs.getString("nombre"));
            proveedor.setDireccion(rs.getString("direccion"));
            proveedor.setTelefono(rs.getString("telefono"));
            lista.add(proveedor);
        }            
        return lista;
    }
    
}
