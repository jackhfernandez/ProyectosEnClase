
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
        objetos = new clsCiclo[cantidad];
        cantidad = 0;
        inicializarCiclo();
    }
    
    public static void agregar(clsCiclo clsCiclo){
        
        if (cantidad <=10 ){
            objetos[cantidad] = clsCiclo;
            cantidad++;
        }
    }
    
    // Inicializar ciclo
    private void inicializarCiclo() {

        agregar( new clsCiclo(1, "Ciclo-2025", "01/03/2025", "30/06/205", true, null));
        agregar( new clsCiclo(2, "Ciclo-2025", "01/03/2025", "30/06/205", true, null));
        agregar( new clsCiclo(3, "Ciclo-2025", "01/03/2025", "30/06/205", true, null));
        agregar( new clsCiclo(4, "Ciclo-2025", "01/03/2025", "30/06/205", true, null));
        agregar( new clsCiclo(5, "Ciclo-2025", "01/03/2025", "30/06/205", true, null));
        
    }
    
    public static clsCiclo[] obtener(){
        return objetos;
    }
    
    public static int getCantidad(){
        return cantidad;
    }
}
