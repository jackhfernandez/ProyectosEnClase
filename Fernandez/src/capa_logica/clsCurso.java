
package capa_logica;

/**
 *
 * @author Fernandez Reyes
 */
public class clsCurso {
    
    private int id;
    private String codigo;
    private String nombre;
    private int creditos; 
    private int ciclo;
    private int cantEstudiantes;
    private boolean estado;

    public clsCurso() {
        
        this.id = 0;
        this.codigo = "";
        this.nombre = "";
        this.creditos = 0;
        this.ciclo = 0;
        this.cantEstudiantes = 0;
        this.estado = false;

    }

    public clsCurso(int id, String codigo, String nombre, int creditos, int ciclo, int cantEstudiantes, boolean estado) {
        
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.ciclo = ciclo;
        this.cantEstudiantes = cantEstudiantes;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public int getCantEstudiantes() {
        return cantEstudiantes;
    }

    public void setCantEstudiantes(int cantEstudiantes) {
        this.cantEstudiantes = cantEstudiantes;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString(){
        return "\n\t" + id + "\t" + codigo + "\t" + nombre + "\t" + creditos + "\t" + ciclo + "\t" + cantEstudiantes; 
    } 
}
