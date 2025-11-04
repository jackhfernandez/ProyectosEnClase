package capa_logica;

/**
 *
 * @author Fernandez Reyes
 */
public class clsCategoria {

    private int codigo;
    private String nombre;
    private String descripcion;
    private boolean estado;

    public clsCategoria() {
        this.codigo = 0;
        this.nombre = "";
        this.descripcion = "";
        this.estado = false;
    }

    public clsCategoria(int codigo, String nombre, String descripcion, boolean estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
