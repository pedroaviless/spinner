import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);
            frame.setLocationRelativeTo(null);

            JLabel label = new JLabel("¿De cuántos módulos estas matriculado?", JLabel.CENTER);
            CustomSpinner spinner = new CustomSpinner();

            JPanel panel = new JPanel();
            panel.add(label);
            panel.add(spinner);

            frame.add(panel);
            frame.setVisible(true);
        });
    }
}

