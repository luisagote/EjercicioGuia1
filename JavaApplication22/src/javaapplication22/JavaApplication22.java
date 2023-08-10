/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication22;
import javax.swing.SwingUtilities;

/**
 *
 * @author W10
 */
public class JavaApplication22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Aqui empieza la llamada a la clase ByGonza
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ByGonza();
            }
        });//Aqui termina la llamada!
    }

}
