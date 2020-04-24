package graphical;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DrawPanel extends JApplet {
    private ArrayList<Shape> primitives = new ArrayList<Shape>();

    public static class Builder {

        public Builder() {
        }

        private Integer positionX = 0;
        private Integer positionY = 0;
        private Integer width = 100;
        private Integer height = 100;
        private Color fgColor = Color.white;
        private Color bgColor = Color.black;


        public DrawPanel build() {
            DrawPanel result = new DrawPanel();
            result.setLocation(positionX, positionY);
            result.setForeground(fgColor);
            result.setBackground(bgColor);
            result.setSize(width, height);
            return result;
        }
    }

    private DrawPanel() {
    }

    public void addPrimitive (Shape newPrimitive) {
        primitives.add(newPrimitive);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2d = (Graphics2D)g;
        g2d.setPaint(Color.BLUE);
        g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        for (int i = 0; i < primitives.size(); i++) {
            g2d.draw(primitives.get(i));
        }
    }
}