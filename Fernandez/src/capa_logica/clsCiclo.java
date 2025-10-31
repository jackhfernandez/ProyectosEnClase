package capa_logica;

/**
 *
 * @author Fernandez Reyes
 */
public class clsCiclo {

    private int id;
    private String nombre;
    private String fechaInicio;
    private String fechaFin;
    private boolean estado;

    public clsCiclo() {

        this.id = 0;
        this.nombre = "";
        this.fechaInicio = "";
        this.fechaFin = "";
        this.estado = false;
    }

    public clsCiclo(int id, String nombre, String fechaInicio, String fechaFin, boolean activo) {

        this.id = id;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.estado = activo;
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "\n\t" + id + "\n" + nombre + "\n" + fechaInicio + "\n" + fechaFin + "\n" + estado + "\n";
    }
    
}
