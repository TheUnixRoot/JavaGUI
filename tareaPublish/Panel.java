package tareaPublish;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * prPracticaEventos class
 * Created by
 *
 * @author Juan Pedro Dominguez Berdun
 * @version 1.0
 *          on 14/06/2016.
 */
public class Panel extends JPanel {
    private JButton buttonCancelar;
    private JLabel bottomLabelGUI;
    private JTextArea       areaTwinRes,        areaCousinRes,      areaSexyRes;
    private JTextField      fieldTwinIn,        fieldCousinIn,      fieldSexyIn;
    private JLabel          labelTwin,          labelCousin,        labelSexy;
    private JLabel          bottomLabelTwin,    bottomLabelCousin,  bottomLabelSexy;
    private JScrollPane     scrollTwin,         scrollCousin,       scrollSexy;
    private JProgressBar    barTwin,            barCousin,          barSexy;

    public Panel() {
        // Inicializacion de componentes individuales
        buttonCancelar = new JButton("Cancelar");
        bottomLabelGUI = new JLabel("GUI Creada");

        areaTwinRes = new JTextArea(10, 40);
        fieldTwinIn = new JTextField(3);
        labelTwin = new JLabel("Cuantos primos Twin quieres?");
        bottomLabelTwin = new JLabel("Area Twin creada");

        areaCousinRes = new JTextArea(10, 40);
        fieldCousinIn = new JTextField(3);
        labelCousin = new JLabel("Cuantos primos Cousin quieres?");
        bottomLabelCousin = new JLabel("Area Cousin creada");

        areaSexyRes = new JTextArea(10, 40);
        fieldSexyIn = new JTextField(3);
        labelSexy = new JLabel("Cuantos primos Sexy quieres?");
        bottomLabelSexy = new JLabel("Area Sexy creada");

        scrollTwin = new JScrollPane(areaTwinRes);
        scrollCousin = new JScrollPane(areaCousinRes);
        scrollSexy = new JScrollPane(areaSexyRes);

        barTwin = new JProgressBar();
        barCousin = new JProgressBar();
        barSexy = new JProgressBar();


        // Montaje de la interfaz {
        this.setLayout(new BorderLayout());

        // Insercion de Cancelar en el panel superior
        // North Panel
        JPanel thisArriba = new JPanel();
        thisArriba.add(buttonCancelar);
        this.add(thisArriba, BorderLayout.NORTH);

        // Creando panel de Centre
        JPanel thisCentre = new JPanel();
        thisCentre.setLayout(new GridLayout(1, 3));

        // Creando el panel Twin, ira en First
        JPanel twinPane = new JPanel();
        twinPane.setLayout(new BorderLayout());

        // North Twin
        JPanel twinArriba = new JPanel();
        twinArriba.add(labelTwin);
        twinArriba.add(fieldTwinIn);
        twinPane.add(twinArriba, BorderLayout.NORTH);

        // Middle Twin
        twinPane.add(scrollTwin, BorderLayout.CENTER);

        // South Twin
        JPanel twinAbajo = new JPanel();
        twinAbajo.add(bottomLabelTwin);
        twinAbajo.add(barTwin);
        twinPane.add(twinAbajo, BorderLayout.SOUTH);
        // First Panel
        thisCentre.add(twinPane);

        // Creando el panel Cousin, ira en Second
        JPanel cousinPane = new JPanel();
        cousinPane.setLayout(new BorderLayout());

        // North Cousin
        JPanel cousinArriba = new JPanel();
        cousinArriba.add(labelCousin);
        cousinArriba.add(fieldCousinIn);
        cousinPane.add(cousinArriba, BorderLayout.NORTH);

        // Middle Cousin
        cousinPane.add(scrollCousin, BorderLayout.CENTER);

        // South Cousin
        JPanel cousinAbajo = new JPanel();
        cousinAbajo.add(bottomLabelCousin);
        cousinAbajo.add(barCousin);
        cousinPane.add(cousinAbajo, BorderLayout.SOUTH);
        // Second Panel
        thisCentre.add(cousinPane);


        // Creando el panel Sexy, ira en Third
        JPanel sexyPane = new JPanel();
        sexyPane.setLayout(new BorderLayout());

        // North Sexy
        JPanel sexyArriba = new JPanel();
        sexyArriba.add(labelSexy);
        sexyArriba.add(fieldSexyIn);
        sexyPane.add(sexyArriba, BorderLayout.NORTH);

        // Middle Sexy
        sexyPane.add(scrollSexy, BorderLayout.CENTER);

        // South Sexy
        JPanel sexyAbajo = new JPanel();
        sexyAbajo.add(bottomLabelSexy);
        sexyAbajo.add(barSexy);
        sexyPane.add(sexyAbajo, BorderLayout.SOUTH);
        // Third Panel
        thisCentre.add(sexyPane);

        // Centre Panel
        this.add(thisCentre, BorderLayout.CENTER);

        // South Panel
        this.add(bottomLabelGUI, BorderLayout.SOUTH);

        // Inicializando barras a 0
        barTwin.setValue(0);
        barTwin.setStringPainted(true);
        barCousin.setValue(0);
        barCousin.setStringPainted(true);
        barSexy.setValue(0);
        barSexy.setStringPainted(true);

        // } Interfaz montada


    }

    public void setControlador(Controlador controlador) {
        buttonCancelar.setActionCommand("Cancelar");
        buttonCancelar.addActionListener(controlador);

        fieldTwinIn.setActionCommand("twinIn");
        fieldTwinIn.addActionListener(controlador);

        fieldCousinIn.setActionCommand("cousinIn");
        fieldCousinIn.addActionListener(controlador);

        fieldSexyIn.setActionCommand("sexyIn");
        fieldSexyIn.addActionListener(controlador);

    }

    public void msgTwin(String msg) {
        bottomLabelTwin.setText(msg);
    }

    public void cleanTwin() {
        areaTwinRes.setText("");
    }

    public void msgCousin(String msg) {
        bottomLabelCousin.setText(msg);
    }

    public void cleanCousin() {
        areaCousinRes.setText("");
    }

    public void msgSexy(String msg) {
        bottomLabelSexy.setText(msg);
    }

    public void cleanSexy() {
        areaSexyRes.setText("");
    }

    public void msgGUI(String msg) {
        bottomLabelGUI.setText(msg);
    }

    public int getTwin() {
        return Integer.parseInt(fieldTwinIn.getText());
    }

    public int getCousin() {
        return Integer.parseInt(fieldCousinIn.getText());
    }

    public int getSexy() {
        return Integer.parseInt(fieldSexyIn.getText());
    }

    public void listaTwin(List<Primos> lista) {
        for (int i = 0; i < lista.size(); i++) {
            Primos p = lista.get(i);
            areaTwinRes.append(p.toString());
            if (p.pos() % 5 == 0) areaTwinRes.append("\n");
        }
    }

    public void listaCousin(List<Primos> lista) {
        for (int i = 0; i < lista.size(); i++) {
            Primos p = lista.get(i);
            areaCousinRes.append(p.toString());
            if (p.pos() % 5 == 0) areaCousinRes.append("\n");
        }
    }

    public void listaSexy(List<Primos> lista) {
        for (int i = 0; i < lista.size(); i++) {
            Primos p = lista.get(i);
            areaSexyRes.append(p.toString());
            if (p.pos() % 5 == 0) areaSexyRes.append("\n");
        }
    }

    public void setBarTwinValue(int n) {
        barTwin.setValue(n);
    }

    public void setBarCousinValue(int n) {
        barCousin.setValue(n);
    }

    public void setBarSexyValue(int n) {
        barSexy.setValue(n);
    }
}

