import graphical.DrawPanel;
import graphical.Frame;
import graphical.ImagePanel;
import graphical.TextPanel;

import java.awt.*;
import java.awt.geom.Line2D;

public class APuMa {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.initWindow();
        frame.createWindow();
        frame.getWindow().setResizable(true);
        //Write in Window
        TextPanel textPanel = new TextPanel.Builder()
                .setFontFamily("Dialog")
                .setFontBackground(Color.BLUE)
                .setFontColor(Color.BLACK)
                .setFontSize(24)
                .setFontStyle(2)
                .setTextAreaHeight(500)
                .setTextAreaWidth(500)
                .setTextPositionX(150)
                .setTextPositionY(300)
                .build();
        frame.getWindow().add(textPanel);
        textPanel.setDynamicText("X-X-X");
        //Draw in Window
        DrawPanel drawPanel = new DrawPanel.Builder().build();
        drawPanel.addPrimitive(new Line2D.Double(10,10,90,90));
        frame.getWindow().getContentPane().add(drawPanel);
        //Image to a Window
        /*ImagePanel imagePanel = new ImagePanel();
        frame.getWindow().pack();
        frame.getWindow().add(imagePanel);
        */
        ImagePanel imagePanel = new ImagePanel.Builder().build();
        frame.getWindow().add(imagePanel);
        imagePanel.init();
        // TODO: A cég logo meghívása
        // TODO: A játék logo meghívása
        // TODO: Intro meghívása
        // TODO: Menü meghívása
        // TODO: Esetleg valami kilépés után?!?

    }
}
