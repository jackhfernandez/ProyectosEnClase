package capa_logica;

/**
 *
 * @author Fernandez Reyes
 */
public class clsUsuario {

    private String usuario;
    private String clave;

    public clsUsuario() {

        this.usuario = "";
        this.clave = "";

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

    public boolean iniciaSesion() {
        if (usuario.equals("admin") && clave.equals("5225")) {
            return true;
        } else {
            return false;
        }
    }
}
