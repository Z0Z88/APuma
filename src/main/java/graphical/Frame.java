package graphical;

import javax.swing.*;
import java.awt.*;

public class Frame {


    static GraphicsConfiguration gc;

    public void createWindow(){
        JFrame window = new JFrame(gc);
        window.setTitle("APuMa");
        window.setResizable(false);
        window.setLocation(50,50);
        window.setSize(800,600);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }





}
