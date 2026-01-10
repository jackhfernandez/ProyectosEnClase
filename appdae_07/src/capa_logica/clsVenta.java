
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
        // Recorremos todas las filas (desde 0) y parseamos limpiando las cadenas
        for (int i = 0; i < detalles.getRowCount(); i++) {
            // codigo
            String sCod = String.valueOf(detalles.getValueAt(i, 0));
            sCod = sCod.replaceAll("\\s+", "").trim();
            int codiProd = 0;
            try {
                codiProd = Integer.parseInt(sCod);
            } catch (NumberFormatException e) {
                // si no se puede parsear, dejamos 0
                codiProd = 0;
            }

            // nombre
            String nombreProducto = String.valueOf(detalles.getValueAt(i, 1));

            // precio (col 2)
            String sPrecio = String.valueOf(detalles.getValueAt(i, 2)).replace(",", "").trim();
            double precio = 0.0;
            try {
                precio = Double.parseDouble(sPrecio);
            } catch (NumberFormatException e) {
                // intentar limpiar caracteres finales como '.'
                if (sPrecio.endsWith(".")) {
                    try {
                        precio = Double.parseDouble(sPrecio.substring(0, sPrecio.length() - 1));
                    } catch (NumberFormatException ex) {
                        precio = 0.0;
                    }
                }
            }

            // cantidad (col 3)
            String sCant = String.valueOf(detalles.getValueAt(i, 3)).replaceAll("\\.0$", "").trim();
            int cant = 0;
            try {
                cant = Integer.parseInt(sCant);
            } catch (NumberFormatException e) {
                try {
                    cant = (int) Math.round(Double.parseDouble(sCant));
                } catch (NumberFormatException ex) {
                    cant = 0;
                }
            }

            // descuento (col 4) - limpiar '%' u otros caracteres
            String sDesc = String.valueOf(detalles.getValueAt(i, 4));
            sDesc = sDesc.replace("%", "").replace(",", "").trim();
            int desc = 0;
            try {
                desc = Integer.parseInt(sDesc);
            } catch (NumberFormatException e) {
                try {
                    desc = (int) Math.round(Double.parseDouble(sDesc));
                } catch (NumberFormatException ex) {
                    desc = 0;
                }
            }

            // nuevo precio (col 5)
            String sNuevo = String.valueOf(detalles.getValueAt(i, 5)).replace(",", "").trim();
            double nuevoPrecio = 0.0;
            try {
                nuevoPrecio = Double.parseDouble(sNuevo);
            } catch (NumberFormatException e) {
                if (sNuevo.endsWith(".")) {
                    try {
                        nuevoPrecio = Double.parseDouble(sNuevo.substring(0, sNuevo.length() - 1));
                    } catch (NumberFormatException ex) {
                        nuevoPrecio = 0.0;
                    }
                }
            }

            // subtotal (col 6)
            String sSub = String.valueOf(detalles.getValueAt(i, 6)).replace(",", "").trim();
            double subTotal = 0.0;
            try {
                subTotal = Double.parseDouble(sSub);
            } catch (NumberFormatException e) {
                if (sSub.endsWith(".")) {
                    try {
                        subTotal = Double.parseDouble(sSub.substring(0, sSub.length() - 1));
                    } catch (NumberFormatException ex) {
                        subTotal = 0.0;
                    }
                }
            }

            clsDetalleVenta objDetalle = new clsDetalleVenta(
                codiProd,
                nombreProducto,
                precio,
                cant,
                desc,
                nuevoPrecio,
                subTotal
            );

            // rellenar en la misma posicion que la fila (si el arreglo fue creado con N = getRowCount())
            if (productosComprados != null && i >= 0 && i < productosComprados.length) {
                productosComprados[i] = objDetalle;
            }
        }
    }
    
    public String toString() {
        return this.numero + "\t" + this.cliente + "\t" + this.subTotal + "\t" + this.igv + "\t" + this.total;
    }
}
