package Modelo;

/**
 * @author Hernandez Zarazua Carlos Jerack
 */
public class InventarioProducto {
    private int idInventario;
    private int idProducto;
    private int noPiezas;

    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
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

    public void setNoPiezas(int noPiezas) {
        this.noPiezas = noPiezas;
    }

    @Override
    public String toString() {
        return "InventarioProducto{" + "idInventario=" + idInventario + ", idProducto=" + idProducto + ", noPiezas=" + noPiezas + '}';
    }
    
    
}
