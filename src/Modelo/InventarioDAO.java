package Modelo;

import Interfaces.DAOInventario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Hernandez Zarazua Carlos Jerack
 */
public class InventarioDAO implements DAOInventario{

    private Connection conexionBD;

    private void conectarBD() {
        conexionBD = ConexionBD.obtenerConexion();
    }
    
    @Override
    public int agregarInventario(InventarioProducto inventario) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int actualizarInventario(InventarioProducto inventario) throws SQLException {
        conectarBD();
        String query="UPDATE InventarioProducto SET numero_piezas=? WHERE Producto_idProducto=?";
        PreparedStatement ps=conexionBD.prepareStatement(query);        
        ps.setInt(1, inventario.getNoPiezas());
        ps.setInt(2, inventario.getIdProducto());
        int i=ps.executeUpdate();        
        return i;                
    }

    @Override
    public InventarioProducto obtenerUnInventario(int idProducto) throws SQLException {
        conectarBD();
        String query="SELECT * from InventarioProducto WHERE Producto_idProducto=?";
        PreparedStatement ps=conexionBD.prepareStatement(query);
        ps.setInt(1, idProducto);
        ResultSet rs=ps.executeQuery();
        InventarioProducto ipro=new InventarioProducto();
        boolean check=false;
        while(rs.next()){
            check=true;
            ipro.setIdProducto(rs.getInt("Producto_idProducto"));
            ipro.setIdInventario(rs.getInt("idInventarioProducto"));
            ipro.setNoPiezas(rs.getInt("numero_piezas"));
            
        }        
        if(check)
            return ipro;
        else
            return null;
    }

    @Override
    public ArrayList<InventarioProducto> obtenerTodoInventario() throws SQLException {
        conectarBD();
        String query="SELECT * from InventarioProducto";
        PreparedStatement ps=conexionBD.prepareStatement(query);        
        ResultSet rs=ps.executeQuery();
        InventarioProducto pro;
        ArrayList<InventarioProducto> lista=new ArrayList();
        while(rs.next()){            
            pro=new InventarioProducto();
            pro.setIdProducto(rs.getInt("Producto_idProducto"));
            pro.setIdInventario(rs.getInt("idInventarioProducto"));
            pro.setNoPiezas(rs.getInt("numero_piezas"));
            lista.add(pro);
        }            
        return lista;
    }
    
}
