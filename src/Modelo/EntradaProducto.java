package Modelo;

/**
 * @author Hernandez Zarazua Carlos Jerack
 */
public class EntradaProducto {
    private int idEntradaProducto;
    private int idProvedor;
    private int idProducto;
    private int noPiezas;
    private String fecha;

    public int getIdEntradaProducto() {
        return idEntradaProducto;
    }

    public void setIdEntradaProducto(int idEntradaProducto) {
        this.idEntradaProducto = idEntradaProducto;
    }

    public int getIdProvedor() {
        return idProvedor;
    }

    public void setIdProvedor(int idProvedor) {
        this.idProvedor = idProvedor;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getNoPiezas() {
        return noPiezas;
    }

    public void setNoPiezas(int idPiezas) {
        this.noPiezas = idPiezas;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "EntradaProducto{" + "idEntradaProducto=" + idEntradaProducto + ", idProvedor=" + idProvedor + ", idProducto=" + idProducto + ", idPiezas=" + noPiezas + ", fecha=" + fecha + '}';
    }    
}
