
package capa_logica;

/**
 *
 * @author Fernandez Reyes
 */
public class clsDetalleVenta {
    
    private int codProd;
    private String nombreProd;
    private Double precioProd;
    private int cantidad;
    private int descuento;
    private double nuevoPrecio;
    private double subTotal;

    public clsDetalleVenta(int codProd, String nombreProd, Double precioProd, int cantidad, int descuento, double nuevoPrecio, double subTotal) {
        this.codProd = codProd;
        this.nombreProd = nombreProd;
        this.precioProd = precioProd;
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.nuevoPrecio = nuevoPrecio;
        this.subTotal = subTotal;
    }

    public int getCodProd() {
        return codProd;
    }

    public void setCodProd(int codProd) {
        this.codProd = codProd;
    }

    public String getNombreProd() {
        return nombreProd;
    }

    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
    }

    public Double getPrecioProd() {
        return precioProd;
    }

    public void setPrecioProd(Double precioProd) {
        this.precioProd = precioProd;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public double getNuevoPrecio() {
        return nuevoPrecio;
    }

    public void setNuevoPrecio(double nuevoPrecio) {
        this.nuevoPrecio = nuevoPrecio;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
}

