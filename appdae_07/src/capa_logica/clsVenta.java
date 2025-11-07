
package capa_logica;

/**
 *
 * @author Fernandez Reyes
 */
public class clsVenta {
    
    private String fecha;
    private int numero;
    private String dniORuc;
    private String tipoCliente;
    private int codCliente;
    private String nomCliente;
    private String tipoComprobante;
    private String descripcion;
    private int codProducto;
    private String nomProducto;
    private int cantidad;
    private double dscto;
    private double subTotal;
    private double IGV;
    private double total;

    public clsVenta() {
        
        this.fecha = "";
        this.numero = 0;
        this.dniORuc = "";
        this.tipoCliente = "";
        this.codCliente = 0;
        this.nomCliente = "";
        this.tipoComprobante = "";
        this.descripcion = "";
        this.codProducto = 0;
        this.nomProducto = "";
        this.cantidad = 0;
        this.dscto = 0.0;
        this.subTotal = 0.0;
        this.IGV = 0.0;
        this.total = 0.0;
    }

    public clsVenta(String fecha, int numero, String dniORuc, String tipoCliente, int codCliente, String nomCliente, String tipoComprobante, String descripcion, int codProducto, String nomProducto, int cantidad, double dscto, double subTotal, double IGV, double total) {
        this.fecha = fecha;
        this.numero = numero;
        this.dniORuc = dniORuc;
        this.tipoCliente = tipoCliente;
        this.codCliente = codCliente;
        this.nomCliente = nomCliente;
        this.tipoComprobante = tipoComprobante;
        this.descripcion = descripcion;
        this.codProducto = codProducto;
        this.nomProducto = nomProducto;
        this.cantidad = cantidad;
        this.dscto = dscto;
        this.subTotal = subTotal;
        this.IGV = IGV;
        this.total = total;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDniORuc() {
        return dniORuc;
    }

    public void setDniORuc(String dniORuc) {
        this.dniORuc = dniORuc;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public String getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(String tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getDscto() {
        return dscto;
    }

    public void setDscto(double dscto) {
        this.dscto = dscto;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getIGV() {
        return IGV;
    }

    public void setIGV(double IGV) {
        this.IGV = IGV;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
