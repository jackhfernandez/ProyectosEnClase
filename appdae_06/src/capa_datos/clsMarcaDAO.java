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

    public static void agregar(clsMarca objMarca) {

        if (cantidad < 20) {
            objetos[cantidad] = objMarca;
            cantidad++;
        }
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
        
        for (int i = 0; i < cantidad; i++) {
            objetos[pos] = objetos[pos+1];
        }
        cantidad--;
    }
    
    public static void modificar(int pos, clsMarca objMarca) {
        
        objetos[pos] = objMarca;
    }
}
