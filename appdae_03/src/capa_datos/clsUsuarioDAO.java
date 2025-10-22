
package capa_datos;

import capa_logica.clsUsuario;

/**
 *
 * @author Fernandez Reyes
 */
public class clsUsuarioDAO {
 
    private static clsUsuario[] objetos= new clsUsuario[20];
    private static int cantidad;
    
    public clsUsuarioDAO(){
        cantidad = 0;
    }
    
    public static void agregar(clsUsuario clsUsu){
        if (cantidad < 20) {
            objetos[cantidad] = clsUsu;
            cantidad++;
        }
    }
    
    public static clsUsuario[] obtener(){
        return objetos;
    }
    
    public static int getCantidad(){
        return cantidad;
    }
    
    public static clsUsuario[] usuariosxTipo(String tipo){
        
        int cantReg = 0;
        for (int i = 0; i < cantidad; i++) {
            if (objetos[i].getTipo().equalsIgnoreCase(tipo))
                cantReg++;
        }
        clsUsuario[] datos = new clsUsuario[cantReg];
        
        int c=0;
        
        for (int i = 0; i < cantidad; i++) {
            if (objetos[i].getTipo().equalsIgnoreCase(tipo)) {
                datos[c] = objetos[i];
                c++;
            }
        }
        return datos;
    }
}
