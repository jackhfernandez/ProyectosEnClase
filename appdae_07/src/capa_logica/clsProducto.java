package capa_logica;

/**
 *
 * @author Fernandez Reyes
 */
public class clsProducto {

    private int codigo;
    private String nombre;
    private String descripcion;
    private double precio;
    private int Stock;
    private boolean estado;
    private String nomMarca;
    private String nomCategoria;

    public clsProducto () {
        this.codigo = 0;
        this.nombre = "";
        this.descripcion = "";
        this.precio = 0;
        this.Stock = 0;
        this.estado = false;
        this.nomMarca = "";
        this.nomCategoria = "";
    }

    public clsProducto(int codigo, String nombre, String descripcion, double
            precio, int Stock, boolean estado, String nomMarca, String nomCategoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.Stock = Stock;
        this.estado = estado;
        this.nomMarca = nomMarca;
        this.nomCategoria = nomCategoria;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getNomMarca() {
        return nomMarca;
    }

    public void setNomMarca(String nomMarca) {
        this.nomMarca = nomMarca;
    }

    public String getNomCategoria() {
        return nomCategoria;
    }

    public void setNomCategoria(String nomCategoria) {
        this.nomCategoria = nomCategoria;
    }   
}
