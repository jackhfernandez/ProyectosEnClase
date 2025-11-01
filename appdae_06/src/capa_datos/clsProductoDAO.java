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
    
    public static clsProducto[] obtener(){
        return objetos;
    }
    
    public static int getCantidad(){
        return cantidad;
    }
}
