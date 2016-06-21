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
public class CousinWorker extends GenericWorker {
    public CousinWorker(Panel panel) {
        super(panel, panel.getCousin(), 4);
    }

    public void done() {
        try {
            panel.cleanCousin();
            panel.listaCousin(get());
            panel.msgCousin("Worker completado");
        } catch (Exception ie) {
            panel.msgCousin("Cousin worker cancelled");
        }
    }
}
