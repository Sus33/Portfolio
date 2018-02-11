import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.GeneralPath;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MyKeyListener extends JPanel implements ActionListener, KeyListener {

    private static final long serialVersionUID = 1L;

    Timer tm = new Timer(3, this);
    int x = 1, y = 1, velX = 2, velY = 2;

    public MyKeyListener() {
        tm.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.blue);
        setBackground(new Color(55, 00, 00));
        setForeground(new Color(1522422));
        g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(Color.white);
        g.fillOval(x + 45, y - 80, 60, 50);
        g.fillOval(x + 30, y - 35, 80, 100);
        g.fillOval(x + 10, y + 60, 120, 180);
        g.setColor(Color.black);
        g.fillOval(x + 63, y - 60, 8, 4);
        g.fillOval(x + 77, y - 60, 8, 4);
        g.fillOval(x + 65, y + 35, 10, 5);
        g.fillOval(x + 65, y + 15, 10, 5);
        g.fillOval(x + 65, y + 140, 10, 5);
        g.fillOval(x + 65, y + 120, 10, 5);
        g.fillOval(x + 65, y + 100, 10, 5);
        g.setColor(Color.orange);
        g.fillArc(x + 40, y - 75, 60, 30, 310, -20);
        g.setColor(Color.red);
        g.drawArc(x + 38, y - 60, 50, 20, 330, -50);
        g.setColor(Color.red);
        g.fillArc(x + 50, y - 110, 50, 80, -180, -180);


        int xPoints[] =
                {55, 167, 209, 73, 83, 55, 27, 37, 1, 43};
        int yPoints[] =
                {10, 36, 36, 54, 96, 72, 196, 54, 36, 36};

        Graphics2D g2d = (Graphics2D) g;

        // create a star from a series of points
        GeneralPath star = new GeneralPath();

        // set the initial coordinate of the General Path
        star.moveTo(xPoints[0], yPoints[0]);

        // create the star--this does not draw the star
        for (int k = 1; k < xPoints.length; k++)
            star.lineTo(xPoints[k], yPoints[k]);

        // close the shape
        star.closePath();

        // translate the origin to (200, 200)
        g2d.translate(200, 200);

        // rotate around origin and draw stars in random colors
        for (int j = 1; j <= 20; j++) {
            g2d.rotate(Math.PI / 10.0);
            g2d.setColor(
                    new Color((int) (Math.random() * 256),
                            (int) (Math.random() * 256),
                            (int) (Math.random() * 256)));
            g2d.fill(star);   // draw a filled star
        }
    }


    public static void main(String[] args) {
        MyKeyListener listener = new MyKeyListener();
        JFrame jFrame = new JFrame();
        jFrame.setTitle("MyKeyListener");
        jFrame.setSize(900, 900);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(listener);
    }

    public void actionPerformed(ActionEvent arg0) {
        if (x < 0) {
            velX = 0;
            x = 0;
        }
        if (y < 0) {
            velY = 0;
            y = 0;
        }
        if (x > 750) {
            velX = 0;
            x = 750;
        }
        if (y > 650) {
            velY = 0;
            y = 650;
        }

        x += velX;
        y += velY;
        repaint();
    }

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


    public void keyReleased(KeyEvent e) {
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
    }

    public void keyTyped(KeyEvent e) {
    }

}


