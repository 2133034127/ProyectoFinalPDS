package Modelo;

import Interfaces.DAOEntradaProducto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Hernandez Zarazua Carlos Jerack
 */
public class EntProductoDAO implements DAOEntradaProducto{
    
    private Connection conexionBD;

    private void conectarBD() {
        conexionBD = ConexionBD.obtenerConexion();
    }

    @Override
    public int agregarEntradaPrducto(EntradaProducto eprodcuto) throws SQLException {
        conectarBD();
        String query="INSERT INTO EntradaProducto(Proveedor_idProveedor,Producto_idProducto,numero_piezas,fecha_entrada) VALUES (?,?,?,?)";
        PreparedStatement ps=conexionBD.prepareStatement(query);
        ps.setInt(1, eprodcuto.getIdProvedor());
        ps.setInt(2, eprodcuto.getIdProducto());
        ps.setInt(3, eprodcuto.getNoPiezas());
        ps.setString(4, eprodcuto.getFecha());
        int i=ps.executeUpdate();        
        return i;
    }

    @Override
    public int borrarEntradaPrducto(int idEntradaProducto) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int actualizarEntradaPrducto(EntradaProducto eprodcuto) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EntradaProducto obtenerEntradaProducto(int idEntradaProducto) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<EntradaProducto> obtenerTodosLasEntradasProductos() throws SQLException {
        conectarBD();
        String query="SELECT * from entradaproducto";
        PreparedStatement ps=conexionBD.prepareStatement(query);        
        ResultSet rs=ps.executeQuery();
        EntradaProducto eproducto;
        ArrayList<EntradaProducto> lista=new ArrayList();
        while(rs.next()){            
            eproducto=new EntradaProducto();
            eproducto.setIdEntradaProducto(rs.getInt("idEntradaProducto"));
            eproducto.setIdProvedor(rs.getInt("Proveedor_idProveedor"));            
            eproducto.setIdProducto(rs.getInt("Producto_idProducto"));
            eproducto.setNoPiezas(rs.getInt("numero_piezas"));
            eproducto.setFecha(rs.getString("fecha_entrada"));
            lista.add(eproducto);
        }            
        return lista;
    }
    
}
