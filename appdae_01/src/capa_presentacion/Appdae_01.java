package capa_presentacion;

import javax.swing.ImageIcon;

/**
 * 
 * @author Fernandez Reyes
 */

public class Appdae_01 {

    public static void main(String[] args) {
        
        jdInicionSesion objForm = new jdInicionSesion(null, true);
        objForm.setLocationRelativeTo(objForm);
        objForm.setTitle("Login by Fernandez");
        objForm.setIconImage( new ImageIcon("src/img/unprg.png").getImage());
        objForm.setVisible(true);
    }
    
}
