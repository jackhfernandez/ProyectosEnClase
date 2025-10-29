
package capa_datos;

import capa_logica.clsCiclo;

/**
 *
 * @author Fernandez Reyes
 */
public class clsCicloDAO {
    
    private static clsCiclo[] objetos = new clsCiclo[10]; // solo diez ciclos
    private static int cantidad;
    
    public clsCicloDAO(){
        cantidad = 0;
    }
    
    public static void agregar(clsCiclo clsCiclo){
        
        if (cantidad <=10 ){
            objetos[cantidad] = clsCiclo;
            cantidad++;
        }
    }
    
    public static clsCiclo[] obtener(){
        return objetos;
    }
    
    public static int getCantidad(){
        return cantidad;
    }
}
