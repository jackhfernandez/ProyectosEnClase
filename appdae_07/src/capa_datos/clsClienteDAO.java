package capa_datos;

import capa_logica.clsCliente;

/**
 *
 * @author Fernandez Reyes
 */
public class clsClienteDAO {

    private static final int MAX_CLI = 15;
    private static clsCliente[] objetos = new clsCliente[MAX_CLI];
    private static int cantidad;

    public clsClienteDAO() {
        cantidad = 0;
    }

    static {
        inicializarDatos();
    }

    public static void agregar(clsCliente objcli) {
        if (cantidad < MAX_CLI) {
            objetos[cantidad] = objcli;
            cantidad++;
        }
    }

    public static void inicializarDatos() {
        agregar(new clsCliente(1, "60606060", "Roberto Carlos", "persona natural", "boleta", "avenida 123", true));
        agregar(new clsCliente(2, "60606061", "Roberto Carlos", "persona natural", "boleta", "avenida 123", true));
        agregar(new clsCliente(3, "60606062", "Roberto Carlos", "persona natural", "boleta", "avenida 123", true));
        agregar(new clsCliente(4, "20112020111", "Empresa A", "empresa", "factura", "avenida 123", true));
        agregar(new clsCliente(5, "20112020112", "Empresa B", "empresa", "factura", "avenida 123", true));
        agregar(new clsCliente(6, "20112020113", "Empresa C", "empresa", "factura", "avenida", true));
    }
    
    public static clsCliente[] obtener(){
        return objetos;
    }
    
    public static int getCantidad() {
        return cantidad;
    }
    
    public static int posicion(int id) {
        int pos = -1;
        for (int i = 0; i < cantidad; i++) {
            if (objetos[i].getId() == id) {
                pos = i;
                break;
            }
        }
        return pos;
    }
    
    public static clsCliente getElemento(int id) {
        int pos = posicion(id);
        if (pos != -1) {
            return objetos[pos];
        } else {
            return null;
        }
    }
    
    public static void darBaja(int id) {
        objetos[id].setEstado(false);
    }
    
    public static void eliminar(int pos) {
        for (int i = 0; i < cantidad; i++) {
            objetos[pos] = objetos[pos + i];
        }
        cantidad--;
    }
    
    public static void modificar(int pos, clsCliente objCli) {
        objetos[pos] = objCli;
    }
    
    public static clsCliente[] clientexTipo(String tipo) {
        int cantReg = 0;
        for (int i = 0; i < cantidad; i++) {
            if  (objetos[i].getTipoCliente().equalsIgnoreCase(tipo))
                cantReg++;
        }
        
        clsCliente[] datos = new clsCliente[cantReg];
        
        int c=0;
        
        for (int i = 0; i < cantidad; i++) {
            if (objetos[i].getTipoCliente().equalsIgnoreCase(tipo)) {
                datos[c] = objetos[i];
                c++;
            }
        }
        return datos;
    }
}
