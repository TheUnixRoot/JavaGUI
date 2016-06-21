package tareaPublish;

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

        TwinBar twin = new TwinBar(panel);
        CousinBar cousin = new CousinBar(panel);
        SexyBar sexy = new SexyBar(panel);

        Controlador controlador = new Controlador(panel, twin, cousin, sexy);

        panel.setControlador(controlador);
        ventana.setContentPane(panel);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.pack();
        ventana.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame ventana = new JFrame("Primos! Publish");
                crearGUI(ventana);
            }
        });
    }
}
