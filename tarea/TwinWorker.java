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
public class TwinWorker extends GenericWorker {

    public TwinWorker(Panel panel) {
        super(panel, panel.getTwin(), 2);
    }

    public void done() {
        try {
            panel.cleanTwin();
            panel.listaTwin(get());
            panel.msgTwin("Worker completado");
        } catch (Exception ie) {
            panel.msgTwin("Twin worker cancelled");
        }
    }
}
