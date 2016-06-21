package tareaPublish;

import javax.swing.*;

/**
 * prPracticaEventos class
 * Created by
 *
 * @author Juan Pedro Dominguez Berdun
 * @version 1.0
 *          on 15/06/2016.
 */
public abstract class GenericWorker extends SwingWorker<Void, Primos> {
    protected Panel panel;
    protected int n;
    protected int k;

    /**
     * Es la clase padre de todos los workers, como en su
     * comportamiento basico no difieren, utilizan el metodo
     * doInBackground del padre.
     *
     * @param panel referencia al panel para mostrar
     *              los pares de primos
     * @param n     numero de pares de primos
     * @param k     diferencia entre los 2 primos
     *              - 2 Twin
     *              - 4 Cousin
     *              - 6 Sexy
     */
    public GenericWorker(Panel panel, int n, int k) {
        this.panel = panel;
        this.n = n;
        this.k = k;
    }

    protected boolean esPrimo(int num) {
        boolean es = true;
        int div = 2;
        while (es && div * div <= num) {
            es = (num % div) != 0;
            div++;
        }
        return es;
    }

    @Override
    protected Void doInBackground() throws Exception {
        int nPrimos = 0;
        int src = 2;
        while (nPrimos < n && !this.isCancelled()) {
            if (esPrimo(src) && esPrimo(src + k)) {
                nPrimos++;
                publish(new Primos(src, src + k, nPrimos));
                this.setProgress(nPrimos * 100 / n);
            }
            src++;
        }
        return null;
    }

}
