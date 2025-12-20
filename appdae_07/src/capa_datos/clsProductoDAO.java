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

    static {
        inicializarDatos();
    }

    public static void agregar(clsProducto objPro) {

        if (cantidad < MAX_PRO) {
            objetos[cantidad] = objPro;
            cantidad++;
        }
    }

    private static void inicializarDatos() {

        agregar(new clsProducto(1, "Celular", "Cel importado", 1500, 10, true, "Motorola", "Tech"));
        agregar(new clsProducto(2, "Audifono", "Aud canc ruido", 500, 10, true, "Skullcandy", "Tech"));
        agregar(new clsProducto(3, "Mouse", "Mou ionic", 90, 10, true, "Logitech", "Tech"));
        agregar(new clsProducto(4, "Laptop", "Lap gamer", 5500, 10, true, "Alienware", "Tech"));
        agregar(new clsProducto(5, "Teclado", "Tecla mecanico", 150, 10, true, "Terabyte", "Tech"));
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

    public static void eliminar(int pos) {

        if (pos < 0 || pos >= cantidad) {
            return;
        }

        for (int i = pos; i < cantidad - 1; i++) {
            objetos[i] = objetos[i + 1];
        }
        objetos[cantidad - 1] = null;
        cantidad--;
    }

    public static void modificar(int pos, clsProducto objprod) {

        objetos[pos] = objprod;
    }
    
    public static clsProducto[] productosxIniciales( String texto) {
        int cantReg = 0;
        
        int canLetras = texto.length();
        
        for (int i = 0; i < cantidad; i++) {
            String nombProd = objetos[i].getNombre().substring(0, canLetras);
            if (nombProd.equalsIgnoreCase(texto)) {
                cantReg = cantReg + 1;
            }
        }
        
        clsProducto[] datos = null;
        if (cantReg > 0) {
            datos = new clsProducto[cantReg];
            int c = 0;
            
            for (int i = 0; i < cantidad; i++) {
                String nombProd = objetos[i].getNombre().substring(0, canLetras);
                if (nombProd.equalsIgnoreCase(texto)) {
                    datos[c] = objetos[i];
                    c++;
                }
            }
        }
        return datos;
    }
}
