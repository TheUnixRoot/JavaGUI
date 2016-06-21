package tareaPublish;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * prPracticaEventos class
 * Created by
 *
 * @author Juan Pedro Dominguez Berdun
 * @version 1.0
 *          on 14/06/2016.
 */
public class Controlador implements ActionListener {
    private Panel panel;
    private TwinBar twinBar;
    private CousinBar cousinBar;
    private SexyBar sexyBar;
    private TwinWorker twinWorker;
    private CousinWorker cousinWorker;
    private SexyWorker sexyWorker;

    public Controlador(Panel panel, TwinBar twinBar, CousinBar cousinBar, SexyBar sexyBar) {
        this.panel = panel;
        this.twinBar = twinBar;
        this.cousinBar = cousinBar;
        this.sexyBar = sexyBar;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Cancelar":
                boolean hayCancelacion = false;
                if (twinWorker != null) {
                    twinWorker.cancel(false);
                    if (twinWorker.isCancelled())
                        panel.msgTwin("Cancelando Worker");
                    hayCancelacion = true;
                }
                if (cousinWorker != null) {
                    cousinWorker.cancel(false);
                    if (cousinWorker.isCancelled())
                        panel.msgCousin("Cancelando Worker");
                    hayCancelacion = true;
                }
                if (sexyWorker != null) {
                    sexyWorker.cancel(false);
                    if (sexyWorker.isCancelled())
                        panel.msgSexy("Cancelando Worker");
                    hayCancelacion = true;
                }
                if (hayCancelacion)
                    panel.msgGUI("Cálculos cancelados");
                else
                    panel.msgGUI("No hay calculos en ejecucion. GUI Creada");
                break;
            case "twinIn":
                twinWorker = new TwinWorker(panel);
                twinWorker.addPropertyChangeListener(twinBar);
                panel.setBarTwinValue(0);
                twinWorker.execute();
                panel.msgTwin("Worker lanzado. Calculando primos twin");
                break;
            case "cousinIn":
                cousinWorker = new CousinWorker(panel);
                cousinWorker.addPropertyChangeListener(cousinBar);
                panel.setBarCousinValue(0);
                cousinWorker.execute();
                panel.msgCousin("Worker lanzado. Calculando primos cousin");
                break;
            case "sexyIn":
                sexyWorker = new SexyWorker(panel);
                sexyWorker.addPropertyChangeListener(sexyBar);
                panel.setBarSexyValue(0);
                sexyWorker.execute();
                panel.msgSexy("Worker lanzado. Calculando primos sexy");
                break;
            default:
                break;
        }
    }
}
