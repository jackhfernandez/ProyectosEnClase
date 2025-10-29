package capa_logica;

/**
 *
 * @author Fernandez Reyes
 */
public class clsEstudiante {

    private int id;
    private String nombres;
    private String apellidos;
    private String sexo;
    private String telefono;
    private String direccion;

    public clsEstudiante(){
        
        this.id = 0;
        this.nombres = "";
        this.apellidos = "";
        this.sexo = "";
        this.telefono = "";
        this.direccion = "";
    }
    
    public clsEstudiante(int id, String nombres, String apellidos, String sexo, String telefono, String direccion) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString(){
        return "\n\t" + id + "\t" + nombres + "\t" + apellidos + "\t" + sexo + "\t" + telefono + "\t" + direccion;
    }
}
