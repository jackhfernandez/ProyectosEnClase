
package capa_logica;

/**
 *
 * @author Fernandez Reyes
 */
public class clsCliente {
    private int id;
    private String documento;
    private String nombre;
    private String tipoCliente;
    private String tipoComprobante;
    private String direccion;
    private boolean estado;

    public clsCliente() {
        this.id = 0;
        this.documento = "";
        this.nombre = "";
        this.tipoCliente = "";
        this.tipoComprobante = "";
        this.direccion = "";
        this.estado = false;
    }

    public clsCliente(int id, String documento, String nombre, String tipoCliente, String tipoComprobante, String direccion, boolean estado) {
        this.id = id;
        this.documento = documento;
        this.nombre = nombre;
        this.tipoCliente = tipoCliente;
        this.tipoComprobante = tipoComprobante;
        this.direccion = direccion;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(String tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
