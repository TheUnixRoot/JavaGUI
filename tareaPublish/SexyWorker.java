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
public class SexyWorker extends GenericWorker {
    public SexyWorker(Panel panel) {
        super(panel, panel.getSexy(), 6);
    }

    public void process(List<Primos> lista) {
        try {
            panel.listaSexy(lista);
        } catch (Exception ie) {
            panel.msgSexy("Sexy worker cancelled");
        }
    }

    public void done(){
        panel.msgSexy("Worker completado");
    }
}
