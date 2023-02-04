import java.awt.*;
import javax.swing.*;

public class Frame extends JFrame{

    Panel panel;

    Frame(){

        panel = new Panel();
        this.setVisible(true);
        this.add(panel);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

    }

    

}