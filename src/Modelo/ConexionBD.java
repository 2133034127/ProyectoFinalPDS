package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Hernandez Zarazua Carlos Jerack
 */
public class ConexionBD {

    private static Connection conexionBD;

    public static synchronized Connection obtenerConexion() {
        if (conexionBD == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                //                                           URL del manejador         nombre BD        usuario    contraseña
                conexionBD = DriverManager.getConnection("jdbc:mysql://localhost:3306/comercializadora", "root", "123abc");
                if (conexionBD != null) {
                    System.out.println("Conectado a la base de datos");
                }
            } catch (SQLException ex ) {
                System.err.println(ex.getMessage());                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return conexionBD;
    }

    /*
    public void cerrarConexion() {
        try {
            if (this.conexionBD != null) {
                this.conexionBD.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (conexionBD == null)
            System.out.println("La conexion vuelve hacer null");
    }
    */
}
