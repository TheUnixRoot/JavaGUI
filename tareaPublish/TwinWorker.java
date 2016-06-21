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
public class TwinWorker extends GenericWorker {

    public TwinWorker(Panel panel) {
        super(panel, panel.getTwin(), 2);
    }

    public void process(List<Primos> lista) {
        try {
            panel.listaTwin(lista);
        } catch (Exception ie) {
            panel.msgTwin("Twin worker cancelled");
        }
    }

    public void done() {
        panel.msgTwin("Worker completado");
    }
}
