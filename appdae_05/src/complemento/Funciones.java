package complemento;

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
}
