package Tester;

import Modelo.Producto;
import Modelo.ProductoDAO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author Hernandez Zarazua Carlos Jerack
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException{
        int resultado;
        Producto prueba=new Producto();
        ProductoDAO pdao=new ProductoDAO();
        
        prueba.setNombre("unaCosa");
        prueba.setDescripcion("haceAlgoChido");
        prueba.setDepartamento(1);
        // El id no se colo ya que la BD lo asigna automaticamente
        resultado=pdao.agregarPrducto(prueba);
        // el resultado 1 indica exito en la ejecucion de la sentencia
        System.out.println("Resultado: "+resultado);
        
        // Elnumero 8 es el id que le dio en mi caso BD al producto
        prueba.setIdProducto(8);
        prueba.setNombre("otroNombre");
        prueba.setDescripcion("hace Nada");
        resultado=pdao.actualizarPrducto(prueba);
        System.out.println("Resultado: "+resultado);
        
        //Obtencion del prodcuto 1
        prueba=pdao.obtenerProducto(1);
        System.out.println(prueba);
        
        ArrayList<Producto>lista=pdao.obtenerTodosLosProductos();
        System.out.println(lista);
        
        pdao.borrarPrducto(7);
        pdao.borrarPrducto(8);
        pdao.borrarPrducto(9);
        pdao.borrarPrducto(10);
        pdao.borrarPrducto(11);
        
        lista=pdao.obtenerTodosLosProductos();
        System.out.println(lista);
    }
    
}