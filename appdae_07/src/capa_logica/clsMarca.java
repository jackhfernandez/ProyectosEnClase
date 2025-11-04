
package capa_logica;

/**
 *
 * @author Fernandez Reyes
 */
public class clsMarca {
    
    private int     codigo;
    private String  nombre;
    private boolean estado;
    
    public clsMarca(){
        this.codigo = 0;
        this.nombre = "";
        this.estado = false;
    }
    
    public clsMarca(int codigo, String nombre, boolean estado){
        this.codigo = codigo;
        this.nombre = nombre;
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
