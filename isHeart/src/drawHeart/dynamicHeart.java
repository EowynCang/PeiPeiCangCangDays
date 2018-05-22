package drawHeart;

import java.awt.Color;  
import java.awt.Graphics;  
import java.awt.Image;  
import java.awt.Toolkit;   
import javax.swing.JFrame;  
  
@SuppressWarnings("serial")
class dynamicHeart extends JFrame {
    // Set the size of the window  
    private static final int WIDTH = 600;  
    private static final int HEIGHT = 700;  
  
    // Get the size of the screen  
    private static int WINDOW_WIDTH = Toolkit.getDefaultToolkit()  
            .getScreenSize().width;  
    private static int WINDOW_HEIGHT = Toolkit.getDefaultToolkit()  
            .getScreenSize().height;  
  
    // Constructor  
    public dynamicHeart() {  
        // Set the title   
        super("Pei & Cang");  
        // Set the background 
        this.setBackground(Color.white);  
        // Set the position of the window  
        this.setLocation((WINDOW_WIDTH - WIDTH) / 2,  
                (WINDOW_HEIGHT - HEIGHT) / 2);  
        // Set the size of the window  
        this.setSize(WIDTH, HEIGHT);  
        // Set the layout of the window  
        this.setLayout(getLayout());  
        // Set the visibility of the window 
        this.setVisible(true);  
        // Set the default close operation  
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);  
    }  
  
    public void paint(Graphics g) {  
  
        double x, y, r; // xy-axis and radius  
        Image image = this.createImage(WIDTH, HEIGHT);  
        Graphics pic = image.getGraphics();  
  
        // draw heart  
        for (int i = 0; i < 86; i++) {  
            for (int j = 0; j < 92; j++) {  
                r = Math.PI / 45 + Math.PI / 45 * i  
                        * (1 - Math.sin(Math.PI / 45 * j)) * 18;  
  
                x = r * Math.cos(Math.PI / 45 * j) * Math.sin(Math.PI / 45 * i)  
                        + WIDTH / 2;  
  
                y = -r * Math.sin(Math.PI / 45 * j) + HEIGHT / 2;  
  
                pic.setColor(Color.red);  
                pic.fillOval((int) x, (int) y, 2, 2);  
            }  
            // create picture  
            g.drawImage(image, 0, 0, this);  
  
        }  
  
    }  
  
    public static void main(String[] args) {  
  
        new dynamicHeart();  
    } 

}
