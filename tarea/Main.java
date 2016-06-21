package tarea;

import javax.swing.*;

/**
 * prPracticaEventos class
 * Created by
 *
 * @author Juan Pedro Dominguez Berdun
 * @version 1.0
 *          on 14/06/2016.
 */
public class Main {

    public static void crearGUI(JFrame ventana) {
        Panel panel = new Panel();
        Controlador controlador = new Controlador(panel);

        panel.setControlador(controlador);
        ventana.setContentPane(panel);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack();
        ventana.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame ventana = new JFrame("Primos! Basico");
                crearGUI(ventana);
            }
        });
    }
}
