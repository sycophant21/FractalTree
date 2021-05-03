import javax.swing.*;

public class Frame extends JFrame {

    public Frame(Panel panel) {
        this.setTitle("Fractal Tree");
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setResizable(false);
        this.add(panel);
    }
}
