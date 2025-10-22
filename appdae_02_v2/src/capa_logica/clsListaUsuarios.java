package capa_logica;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Clase para gestionar una lista de usuarios mediante un array
 *
 * @author Fernandez Reyes
 */
public class clsListaUsuarios {

    private static final int MAX_USU = 5;
    private clsUsuario[] listaUsuarios;
    private int contador;

    /**
     * Constructor que inicia el array de usuarios
     */
    public clsListaUsuarios() {

        this.listaUsuarios = new clsUsuario[MAX_USU];
        this.contador = 0;
        inicializarUsuarioPorDefecto();
    }

    /**
     * Inicializar algunos usuarios por defecto
     */
    private void inicializarUsuarioPorDefecto() {

        agregarUsuario(new clsUsuario("admin", "5225", "Administrador", "Administrador", true));
        agregarUsuario(new clsUsuario("gerente", "1234", "John Doe", "Gerente", true));
        agregarUsuario(new clsUsuario("vendedor", "9876", "Jordan Belfort", "Administrador", true));
    }

    public boolean agregarUsuario(clsUsuario u) {

        if (estaLleno()) {
            return false;
        }

        // Verificar si el usuario ya existe
        if (buscarUsuarioPorNombre(u.getUsuario()) != null) {
            return false; // Usuario ya existe
        }
        
        listaUsuarios[contador] = u;
        contador++;
        return true;
    }

    /**
     * Busca usuario por nombre de usuario
     */
    public clsUsuario buscarUsuarioPorNombre(String nombreUsuario) {

        for (int i = 0; i < contador; i++) {
            if (listaUsuarios[i].getUsuario().equals(nombreUsuario)) {
                return listaUsuarios[i];
            }
        }
        return null;
    }

    /**
     * Verifica las credenciales de un usuario
     *
     */
    public boolean verificarUsuario(String nombreUsuario, String clave) {

        clsUsuario usuario = buscarUsuarioPorNombre(nombreUsuario);
        return usuario != null
            && usuario.getClave().equals(clave)
            && usuario.isEstado();
    }

    /**
     * Obtiene un usuario poor su posicion
     */
    public clsUsuario obtenerUsuario(int i) {

        if (i >= 0 && i <= contador) {
            return listaUsuarios[i];
        }
        return null;
    }

    /**
     * Elimina un usuario por nombre de usuario
     */
    public boolean eliminarUsuario(String nombreUsuario) {

        for (int i = 0; i < contador; i++) {
            if (listaUsuarios[i].getUsuario().equals(nombreUsuario)) {
                // Mover todos los elementos hacia la izquierda
                for (int j = i; j < contador - 1; j++) {
                    listaUsuarios[j] = listaUsuarios[j + 1];
                }
                listaUsuarios[contador - 1] = null;
                contador--;
                return true;
            }
        }
        return false;
    }

    /**
     * Actualiza los datos de un usuario existente
     */
    public boolean actualizarUsuario(clsUsuario usuarioActualizado) {

        for (int i = 0; i < contador; i++) {
            if (listaUsuarios[i].getUsuario().equals(usuarioActualizado)) {
                listaUsuarios[i] = usuarioActualizado;
                return true;
            }
        }
        return false;
    }

    /**
     * Ordena los usuario por estado (Activos primero)
     */
    public void ordenarPorEstado() {
        Arrays.sort(listaUsuarios, 0, contador, new Comparator<clsUsuario>() {
            @Override
            public int compare(clsUsuario u1, clsUsuario u2) {
                return Boolean.compare(u2.isEstado(), u1.isEstado());
            }
        });
    }
    
    /**
     * Ordena los usuarios por tipo alfabéticamente
     */
    public void ordenarPorTipo() {
        Arrays.sort(listaUsuarios, 0, contador, new Comparator<clsUsuario>() {
            @Override
            public int compare(clsUsuario u1, clsUsuario u2) {
                return u1.getTipo().compareTo(u2.getTipo());
            }
        });
    }
    
    /**
     * Ordena los usuarios por nombre alfabéticamente
     */
    public void ordenarPorNombre() {
        Arrays.sort(listaUsuarios, 0, contador, new Comparator<clsUsuario>() {
            @Override
            public int compare(clsUsuario u1, clsUsuario u2) {
                return u1.getNombre().compareTo(u2.getNombre());
            }
        });
    }
    
    /**
     * Verifica si el array está lleno
     * @return true si el array está lleno, false en caso contrario
     */
    public boolean estaLleno() {
        return contador >= MAX_USU;
    }
    
    /**
     * Verifica si el array está vacío
     * @return true si el array está vacío, false en caso contrario
     */
    public boolean estaVacio() {
        return contador == 0;
    }
    
    /**
     * Obtiene el número actual de usuarios registrados
     * @return Número de usuarios en el array
     */
    public int getContador() {
        return contador;
    }
    
    /**
     * Obtiene la capacidad máxima del array
     * @return Capacidad máxima
     */
    public int getCapacidadMaxima() {
        return MAX_USU;
    }
    
    /**
     * Retorna una representación en String de todos los usuarios
     * @return String con la lista de usuarios
     */
    public String mostrarListaUsuarios() {
        if (estaVacio()) {
            return "No hay usuarios registrados.";
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append("\n\tLista de Usuarios Registrados");
        sb.append("\n\t").append("=".repeat(50));
        sb.append("\n\tNombre\t\tUsuario\t\tTipo\t\tEstado");
        sb.append("\n\t").append("-".repeat(50));
        
        for (int i = 0; i < contador; i++) {
            sb.append(listaUsuarios[i].toString());
        }
        
        sb.append("\n\t").append("=".repeat(50));
        sb.append("\n\tTotal de usuarios: ").append(contador);
        sb.append("/").append(MAX_USU);
        
        return sb.toString();
    }
    
     /**
     * Obtiene una copia del array de usuarios (solo los elementos ocupados)
     * @return Array con los usuarios registrados
     */
    public clsUsuario[] obtenerTodosLosUsuarios() {
        clsUsuario[] copia = new clsUsuario[contador];
        System.arraycopy(listaUsuarios, 0, copia, 0, contador);
        return copia;
    }
}
