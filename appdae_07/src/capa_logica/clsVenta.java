
package capa_logica;

import java.util.Date;
import javax.swing.JTable;

/**
 *
 * @author Fernandez Reyes
 */
public class clsVenta {
    
    private int numero;
    private Date fecha;
    private String cliente;
    private double subTotal;
    private double igv;
    private double total;
    
    clsDetalleVenta[] productosComprados;
    
    public clsVenta() {
    }

    public clsVenta(int numero, Date fecha, String cliente, double subTotal, double igv, double total, int N) {
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
        this.subTotal = subTotal;
        this.igv = igv;
        this.total = total;
        this.productosComprados = new clsDetalleVenta[N];
    }

    public void llenarDetalle(JTable detalles) {
        for (int i = 1; i < detalles.getRowCount(); i++) {
            int codiProd= Integer.parseInt((String) detalles.getValueAt(i, 0));
            String nombreProducto = detalles.getValueAt(i, 1).toString();
            double precio = Double.parseDouble((String) detalles.getValueAt(i, 2));
            int cant = Integer.parseInt(detalles.getValueAt(i, 3).toString());
            int desc = Integer.parseInt(detalles.getValueAt(i, 4).toString());
            double nuevoPrecio = Double.parseDouble((String) detalles.getValueAt(i, 5));
            double subTotal = Double.parseDouble((String) detalles.getValueAt(i, 6));
            
            clsDetalleVenta objDetalle = new clsDetalleVenta(
                codiProd,
                nombreProducto,
                precio,
                cant,
                desc,
                nuevoPrecio,
                subTotal
            );
            
            productosComprados[i-1] = objDetalle;
            
        }
    }
}
