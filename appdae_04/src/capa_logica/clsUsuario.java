package capa_logica;

/**
 *
 * @author Fernandez Reyes
 */
public class clsUsuario {

    private String usuario;
    private String clave;
    private String nombre;
    private String tipo;
    private boolean estado;

    // Constructor por defecto
    public clsUsuario() {

        this.usuario = "";
        this.clave = "";
        this.nombre = "";
        this.tipo = "";
        this.estado = false;
    }
    
    // Constructor con parametros
    public clsUsuario(String usuario, String clave, String nombre, String tipo, boolean estado){
        
        this.usuario = usuario;
        this.clave = clave;
        this.nombre = nombre;
        this.tipo = tipo;
        this.estado = estado;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        
        return "\n\t" + nombre + "\t" + usuario +  "\t" + tipo + "\t" + estado;
    }

    public boolean iniciaSesion() {
        if (usuario.equals("admin") && clave.equals("5225")) {
            return true;
        } else {
            return false;
        }
    }
}
