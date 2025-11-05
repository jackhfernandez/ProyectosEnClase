package capa_datos;

import capa_logica.clsProducto;

/**
 *
 * @author Fenandez Reyes
 */
public class clsProductoDAO {

    private static final int MAX_PRO = 20;
    private static clsProducto[] objetos = new clsProducto[MAX_PRO];
    private static int cantidad;

    public clsProductoDAO() {
        
        cantidad = 0;
    }

    public static void agregar(clsProducto objPro) {

        if (cantidad < MAX_PRO) {
            objetos[cantidad] = objPro;
            cantidad++;
        }
    }

    public static clsProducto[] obtener() {
        
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

    public static clsProducto getElemento(int codigo) {

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
    
    public static void eliminar( int pos) {
        
        for (int i = 0; i < cantidad; i++) {
            objetos[pos] = objetos[pos + i];
        }
        cantidad--;
    }
    
    public static void  modificar(int pos, clsProducto objprod){
        
        objetos[pos] = objprod;
    }
}
