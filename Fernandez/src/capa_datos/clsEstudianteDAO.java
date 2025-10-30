package capa_datos;

import capa_logica.clsEstudiante;

/**
 *
 * @author Fernandez Reyes
 */
public class clsEstudianteDAO {

    private static clsEstudiante[] objetos = new clsEstudiante[20];
    private static int cantidad;

    public clsEstudianteDAO() {
        cantidad = 0;
    }

    public static void agregar(clsEstudiante clsEst) {

        if (cantidad < 20) {
            objetos[cantidad] = clsEst;
            cantidad++;
        }
    }

    public static clsEstudiante[] obtener() {
        return objetos;
    }

    public static int getCantidad() {
        return cantidad;
    }

    public static void eliminar( int pos){
        
        for (int i = 0; i < cantidad; i++) {
            objetos[pos] = objetos[pos+1];
        }
        cantidad--;
    }
    
    public static clsEstudiante getElemento(int codigo) {
        int pos = posicion(codigo);
        
        if (pos != -1)
            return objetos[pos];
        else
            return null;
    }
    
    public static int posicion(int codigo) {
        
        int pos = -1;
        
        for (int i = 0; i < cantidad; i++) {
            if (objetos[i].getId() == codigo) {
                pos = i;
                break;
            }
        }
        return pos;
    }
    
    public static void modificar(int pos, clsEstudiante objEst) {
        
        objetos[pos] = objEst;
    }
}
