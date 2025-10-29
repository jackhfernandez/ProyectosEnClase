package capa_logica;

import java.util.Random;

/**
 *
 * @author Fernandez Reyes
 */
public class clsUsuario {

    private String usuario;
    private String clave;
    private String nombres;
    private String tipo;
    private boolean estado;

    // Constructor por defecto
    public clsUsuario() {

        this.usuario = "";
        this.clave = "";
        this.nombres = "";
        this.tipo = "";
        this.estado = false;
    }

    // Constructor con parametros
    public clsUsuario(String usuario, String clave, String nombres, String tipo, boolean estado) {

        this.usuario = usuario;
        this.clave = clave;
        this.nombres = nombres;
        this.tipo = tipo;
        this.estado = estado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
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

        return "\n\t" + nombres + "\t" + usuario + "\t" + tipo + "\t" + estado;
    }

    public boolean iniciarSesion() {

        if (usuario.equalsIgnoreCase("admin") && clave.equals("1234")) {
            return true;
        } else {
            return false;
        }
    }
    
    public int generarAleatorio(){
        
        Random rand = new Random();
        int numAleat = rand.nextInt(99999 - 10000 +1);
        return numAleat;
    }
}
