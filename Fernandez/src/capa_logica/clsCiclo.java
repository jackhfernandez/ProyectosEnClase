package capa_logica;

import java.util.Arrays;

/**
 *
 * @author Fernandez Reyes
 */
public class clsCiclo {

    private int id;
    private String nombre;
    private String fechaInicio;
    private String fechaFin;
    private boolean activo;
    private String[] cursos;

    public clsCiclo() {

        this.id = 0;
        this.nombre = "";
        this.fechaInicio = "";
        this.fechaFin = "";
        this.activo = false;
        this.cursos = null;
    }

    public clsCiclo(int id, String nombre, String fechaInicio, String fechaFin, boolean activo, String[] cursos) {

        this.id = id;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.activo = activo;
        this.cursos = cursos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public String[] getCursos() {
        return cursos;
    }

    public void setCursos(String[] cursos) {
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return "\n\t" + id + "\n" + nombre + "\n" + fechaInicio + "\n" + fechaFin + "\n" + activo + "\n" + Arrays.toString(cursos);
    }
    
}
