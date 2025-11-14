import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.io.Serializable;

public class CustonSpinner extends JSpinner implements Serializable {

    private final JSpinner spinner;
    private final int MAX_VALUE = 7;


    public CustonSpinner() {
        super();

        spinner = new JSpinner(new SpinnerNumberModel(0, 0, 7, 1));

        this.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int value = (int) getValue();
                if (value == MAX_VALUE) {
                    JOptionPane.showMessageDialog(null,
                            "El número máximo de módulos es " + MAX_VALUE,
                            "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }
}
