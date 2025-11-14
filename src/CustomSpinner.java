import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.io.Serializable;

public class CustomSpinner extends JSpinner implements Serializable {

   private int valorObjetivo = 7;

    public CustomSpinner() {
        super(new SpinnerNumberModel(0, 0, 100, 1));

        this.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int value = (int) getValue();
                if (value == valorObjetivo) {
                    JOptionPane.showMessageDialog(CustomSpinner.this,
                            "El número máximo de módulos es " + valorObjetivo,
                            "Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }
    public int getValorObjetivo() {
        return valorObjetivo;
    }
    public void setValorObjetivo(int valorObjetivo) {
        this.valorObjetivo = valorObjetivo;
    }
}


