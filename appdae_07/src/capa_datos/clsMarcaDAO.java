package capa_datos;

import capa_logica.clsMarca;

/**
 *
 * @author Fernandez Reyes
 */
public class clsMarcaDAO {

    private static clsMarca[] objetos = new clsMarca[20];
    private static int cantidad;

    public clsMarcaDAO() {

        cantidad = 0;
    }

    static {
        inicializarDatos();
    }
    
    public static void agregar(clsMarca objMarca) {

        if (cantidad < 20) {
            objetos[cantidad] = objMarca;
            cantidad++;
        }
    }
    
    private static void inicializarDatos(){
        
        agregar( new clsMarca(1, "Alienware", true));
        agregar( new clsMarca(2, "Motorola", true));
        agregar( new clsMarca(3, "Skullcandy", true));
        agregar( new clsMarca(4, "Logitech", true));
        agregar( new clsMarca(5, "Apple", true));
        agregar( new clsMarca(6, "Samsung", true));
        agregar( new clsMarca(7, "Nokia", true));
        agregar( new clsMarca(8, "Lenovo", true));
        agregar( new clsMarca(9, "Hp", true));
        agregar( new clsMarca(10, "Compaq", true));
    }

    public static clsMarca[] obtener() {
        
        return objetos;
    }

    public static int getCantidad() {
        
        return cantidad;
    }

    public static int posicion(int codigo) {
        
        int pos = -1;
        
        for (int i = 0; i < cantidad; i++) {
            if (objetos[i].getCodigo() == codigo) {
                pos = i;
                break;
            }
        }
        return pos;
    }

    public static clsMarca getElemento(int codigo) {

        int pos = posicion(codigo);
        
        if (pos != -1)
            return objetos[pos];
         else
            return null;
    }

    public static void darBaja(int pos) {
        
        objetos[pos].setEstado(false);
    }
    
    public static void eliminar( int pos){
        
        if (pos < 0 || pos >= cantidad) {
            return;
        }
        
        for (int i = pos; i < cantidad -1; i++) {
            objetos[i] = objetos[i+1];
        }
        objetos[cantidad-1] = null;
        cantidad--;
    }
    
    public static void modificar(int pos, clsMarca objMarca) {
        
        objetos[pos] = objMarca;
    }
}
