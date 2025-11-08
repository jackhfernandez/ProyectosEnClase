
package capa_datos;

import capa_logica.clsCategoria;

/**
 *
 * @author Fernandez Reyes
 */
public class clsCategoriaDAO {
    
    private static clsCategoria[] objetos = new clsCategoria[20];
    private static int cantidad;
    
    public clsCategoriaDAO(){
        
        cantidad = 0;
    }
    
    static {
        inicializarDatos();
    }
    
    public static void agregar(clsCategoria objCat){
        
        if (cantidad <=20 ) {
            objetos[cantidad] = objCat;
            cantidad++;
        }
    }
    
    private static void inicializarDatos(){
        
        agregar( new clsCategoria(1, "Tech", "Equipos tecnologicos", true));
        agregar( new clsCategoria(2, "Home", "Equipos para el hogar", true));
        agregar( new clsCategoria(3, "Electo", "Electrodomesticos", true));
        agregar( new clsCategoria(4, "School", "Equipos para la escuela", true));
        agregar( new clsCategoria(5, "Multimedia", "Social media", true));
    }
    
    public static clsCategoria[] obtener(){
        
        return objetos;
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
    
    public static clsCategoria getElement(int codigo) {
        
        int pos = posicion(codigo);
        
        if (pos != -1) {
            return objetos[pos];
        } else {
            return null;
        }
    }
    
    public static void darBaja(int pos) {
        
        objetos[pos].setEstado(false);
    }
    
    public static void eliminar( int pos ) {
        
        for (int i = pos; i < cantidad-1; i++) {
            
            objetos[i] = objetos[i + 1];
        }
        objetos[cantidad-1] = null;
        cantidad--;
    }
    
    public static void modificar(int pos, clsCategoria objCat) {
        
        objetos[pos] = objCat;
    }
    
    public static int getCantidad(){
        return cantidad;
    }
}
