package complemento;

import capa_datos.clsMarcaDAO;
import capa_logica.clsMarca;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Fernandez Reyes
 */
public class Funciones {

    public static int dialogoPregunta(String cadena) {
        
        Object[] opciones = {"SI", "NO"};
        int respuesta = JOptionPane.showOptionDialog(
            null,
            cadena,
            "Confirmacion",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opciones,
            opciones[0]
        );
        return respuesta;
    }
    
    public static void listarMarcas(JComboBox combo){
        DefaultComboBoxModel modeloMarca = new DefaultComboBoxModel();
        
        try {
            clsMarca[] marcas = clsMarcaDAO.obtener();
            int cantidad = clsMarcaDAO.getCantidad();
            
            for (int i = 0; i < cantidad; i++) {
                modeloMarca.addElement( marcas[i].getNombre() );
            }
            combo.setModel(modeloMarca);
        } catch (Exception e ) {
            JOptionPane.showMessageDialog(null, e.getMessage() + " Error al cargar marcas en el sistema");
        }
    }
}
