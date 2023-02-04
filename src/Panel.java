import javax.swing.*;
import java.awt.*;
public class Panel extends JPanel{
    Panel(){

        this.setPreferredSize(new Dimension(800,600));

    }

    public void paint(Graphics g){

        /*
         * This method will be called each frame.
         * The setup will be to draw the background,
         * then the projectile sprites,
         * then the enemy sprites,
         * and finally the player sprite.
         * These should all be in ArrayLists.
         */


        Graphics2D g2D = (Graphics2D)g;
        ImageIcon image = new ImageIcon("resources/sprites/testimage.png");
        g2D.drawImage(image.getImage(), 300, 300, 100, 100, getFocusCycleRootAncestor());

    }
}
