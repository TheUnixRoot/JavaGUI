package tareaPublish;

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

    public void process(List<Primos> lista) {
        try {
            panel.listaCousin(lista);
        } catch (Exception ie) {
            panel.msgCousin("Cousin worker cancelled");
        }
    }

    public void done() {
        panel.msgCousin("Worker completado");
    }
}
