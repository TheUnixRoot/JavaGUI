package tareaPublish;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * prPracticaEventos class
 * Created by
 *
 * @author Juan Pedro Dominguez Berdun
 * @version 1.0
 *          on 15/06/2016.
 */
public class TwinBar implements PropertyChangeListener {
    private Panel panel;

    public TwinBar(Panel panel) {
        this.panel = panel;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals("progress"))
            panel.setBarTwinValue((Integer) evt.getNewValue());
    }
}
