package Modelo;

import Interfaces.DAOProductos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Hernandez Zarazua Carlos Jerack
 */
public class ProductoDAO implements DAOProductos {

    private Connection conexionBD;

    private void conectarBD() {
        conexionBD = ConexionBD.obtenerConexion();
    }

    @Override
    public int agregarPrducto(Producto producto) throws SQLException {
        conectarBD();
        String query="INSERT INTO Producto(nombre,descripcion,Departamento_idDepartamento) VALUES (?,?,?)";
        PreparedStatement ps=conexionBD.prepareStatement(query);
        ps.setString(1, producto.getNombre());
        ps.setString(2, producto.getDescripcion());
        ps.setInt(3, producto.getDepartamento());
        int i=ps.executeUpdate();        
        return i;
    }

    @Override
    public int borrarPrducto(int idProducto) throws SQLException {
        conectarBD();
        String query="DELETE FROM Producto WHERE idProducto=?";
        PreparedStatement ps=conexionBD.prepareStatement(query);        
        ps.setInt(1, idProducto);
        int i=ps.executeUpdate();        
        return i;
    }

    @Override
    public int actualizarPrducto(Producto producto) throws SQLException {
        conectarBD();
        String query="UPDATE Producto SET nombre=?,descripcion=?,Departamento_idDepartamento=? WHERE idProducto=?";
        PreparedStatement ps=conexionBD.prepareStatement(query);
        ps.setString(1, producto.getNombre());
        ps.setString(2, producto.getDescripcion());
        ps.setInt(3, producto.getDepartamento());
        ps.setInt(4, producto.getIdProducto());
        int i=ps.executeUpdate();        
        return i;        
    }

    @Override
    public Producto obtenerProducto(int idProducto) throws SQLException {
        conectarBD();
        String query="SELECT * from Producto WHERE idProducto=?";
        PreparedStatement ps=conexionBD.prepareStatement(query);
        ps.setInt(1, idProducto);
        ResultSet rs=ps.executeQuery();
        Producto producto=new Producto();
        boolean check=false;
        while(rs.next()){
            check=true;
            producto.setIdProducto(rs.getInt("idProducto"));
            producto.setNombre(rs.getString("nombre"));
            producto.setDescripcion(rs.getString("descripcion"));
            producto.setDepartamento(rs.getInt("Departamento_idDepartamento"));
        }        
        if(check)
            return producto;
        else
            return null;
    }

    @Override
    public ArrayList<Producto> obtenerTodosLosProductos() throws SQLException {
        conectarBD();
        String query="SELECT * from Producto";
        PreparedStatement ps=conexionBD.prepareStatement(query);        
        ResultSet rs=ps.executeQuery();
        Producto producto;
        ArrayList<Producto> lista=new ArrayList();
        while(rs.next()){            
            producto=new Producto();
            producto.setIdProducto(rs.getInt("idProducto"));
            producto.setNombre(rs.getString("nombre"));
            producto.setDescripcion(rs.getString("descripcion"));
            producto.setDepartamento(rs.getInt("Departamento_idDepartamento"));
            lista.add(producto);
        }    
        System.out.print(lista);
        return lista;
    }
}
