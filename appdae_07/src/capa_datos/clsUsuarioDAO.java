
package capa_datos;

import capa_logica.clsUsuario;

/**
 *
 * @author Fernandez Reyes
 */
public class clsUsuarioDAO {
 
    private static final int MAX_USU = 15;
    private static clsUsuario[] objetos= new clsUsuario[MAX_USU];
    private static int cantidad;
    
    public clsUsuarioDAO(){
        cantidad = 0;
    }
    
    static {
        inicializarDatos();
    }
    public static void agregar(clsUsuario clsUsu){
        
        if (cantidad < MAX_USU) {
            objetos[cantidad] = clsUsu;
            cantidad++;
        }
    }
    
    private static void inicializarDatos(){
        
        agregar( new clsUsuario("user1", "1234;", "Ana", "Administrador", true));
        agregar( new clsUsuario("user2", "1234;", "Pedro", "Gerente", true));
        agregar( new clsUsuario("user3", "1234;", "Maria", "Vendedor", true));
        agregar( new clsUsuario("user4", "1234;", "Jose", "Administrativo", true));
        agregar( new clsUsuario("user5", "1234;", "Judas", "Vendedor", true));
        
    }
    
    public static clsUsuario[] obtener(){
        return objetos;
    }
    
    public static int getCantidad(){
        return cantidad;
    }
    
    public static clsUsuario[] usuariosxTipo(String tipo){
        
        // obtener los datos por tipo
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
