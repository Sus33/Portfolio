import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.GeneralPath;

public class SnowMan extends JPanel
        implements ActionListener, KeyListener {
    public int x = 1, y = 1, velX = 2, velY = 2;

    Timer tm = new Timer(10, this);

    public SnowMan() {
        tm.start();
//        addKeyListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        setForeground(new Color(20, 200, 249));
        g2d.fillRect(0, 0, getWidth(), getHeight());


        //create body
        g2d.setColor(Color.white);
        g2d.fillOval(x + 70, y + 70, 60, 60);
        g2d.fillOval(x + 50, y + 125, 100, 100);
        g2d.fillOval(x + 10, y + 220, 180, 180);

        //create cap
        g2d.setColor(Color.red);
        g2d.fillArc(x + 75, y + 40, 50, 80,
                -180, -180);

        //create eyes
        g2d.setColor(Color.blue);
        g2d.fillOval(x + 85, y + 90, 6, 6);
        g2d.fillOval(x + 105, y + 90, 6, 6);
        //create nose
        g2d.setColor(Color.orange);
        g2d.fillArc(x + 93, y + 85, 30, 60,
                140, -20);

        //create mouth
        g2d.setColor(Color.red);
        g2d.drawArc(x + 60, y + 95, 60, 20,
                330, -60);

//        create buttons
        g2d.setColor(Color.magenta);
        g2d.fillOval(x + 94, y + 150, 12, 12);

        g2d.setColor(Color.blue);
        g2d.fillOval(x + 93, y + 180, 14, 14);

        g2d.setColor(Color.YELLOW);
        g2d.fillOval(x + 92, y + 250, 16, 16);

        g2d.setColor(Color.GREEN);
        g2d.fillOval(x + 91, y + 290, 18, 18);

        g2d.setColor(Color.BLACK);
        g2d.fillOval(x + 90, y + 330, 20, 20);


        //create hand
        g2d.setColor(Color.WHITE);
        g2d.fillOval(x + 13, y + 140, 50, 50);
        g2d.fillOval(x + 133, y + 140, 50, 50);

//create handwoods
        g2d.setColor(Color.ORANGE);
        g2d.fillRect(x + 170, y + 120, 8, 280);

        int xPoints[] =
                {5, 22, 14, 55, 44, 35, 27, 37, 1, 43};
        int yPoints[] =
                {10, 36, 36, 54, 6, 42, 15, 34, 36, 36};


        // create a star from a series of points
        GeneralPath star = new GeneralPath();

        // set the initial coordinate of the General Path
        star.moveTo(xPoints[0], yPoints[0]);

        // create the star--this does not draw the star
        for (int k = 1; k < xPoints.length; k++) {

            star.lineTo(xPoints[k], yPoints[k]);
        }
        // close the shape
        star.closePath();
        g2d.translate(x + 180, y + 120);

        // rotate around origin and draw stars in random colors
        for (int j = 1; j <= 20; j++) {
            g2d.rotate(Math.PI / 10.0);
            g2d.setColor(
                    new Color((int) (Math.random() * 256),
                            (int) (Math.random() * 256),
                            (int) (Math.random() * 0)));
            ((Graphics2D) g2d).fill(star);   // draw a filled star
        }

    }

    public static void main(String[] args) {

        SnowMan listener = new SnowMan();

        JFrame jFrame = new JFrame();
        jFrame.addKeyListener(listener);
        jFrame.setTitle("First Graphics");
        jFrame.setSize(700, 700);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.add(listener);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (x < 0) {
            velX = 0;
            x = 0;
        }
        if (y < 0) {
            velY = 0;
            y = 0;
        }
        if (x > 250) {
            velX = 0;
            x = 250;
        }
        if (y > 250) {
            velY = 0;
            y = 250;
        }

        x += velX;
        y += velY;
        repaint();
    }


    public void keyTyped(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("Right key typed");
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("Left key typed");
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {

        int c = e.getKeyCode();
        if (c == KeyEvent.VK_LEFT) {
            velX = -1;
            velY = 0;

        }
        if (c == KeyEvent.VK_RIGHT) {
            velX = 1;
            velY = 0;

        }
        if (c == KeyEvent.VK_UP) {
            velX = 0;
            velY = -1;

        }
        if (c == KeyEvent.VK_DOWN) {
            velX = 0;
            velY = 1;
        }
        if (c == KeyEvent.VK_ENTER) {
            velX = 0;
            velY = 0;
        }
        if (c == KeyEvent.VK_SHIFT) {

            velX = 0;
            velY = 0;

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("Right key Released");
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("Left key Released");
        }
    }
}

