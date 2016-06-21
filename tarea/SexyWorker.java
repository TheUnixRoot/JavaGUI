package tarea;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * prPracticaEventos class
 * Created by
 *
 * @author Juan Pedro Dominguez Berdun
 * @version 1.0
 *          on 14/06/2016.
 */
public class SexyWorker extends GenericWorker {
    public SexyWorker(Panel panel) {
        super(panel, panel.getSexy(), 6);
    }

    public void done() {
        try {
            panel.cleanSexy();
            panel.listaSexy(get());
            panel.msgSexy("Worker completado");
        } catch (Exception ie) {
            panel.msgSexy("Sexy worker cancelled");
        }
    }
}
