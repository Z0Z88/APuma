package graphical;

import javax.swing.*;
import java.awt.*;

public class Frame {

    private static final String WINDOWTITLE = "APuMa";
    private static final boolean WINDOWRESIZE = false;
    private static final int WINDOWLOCX = 50;
    private static final int WINDOWLOCY = 50;
    private static final int WINDOWSIZEX = 800;
    private static final int WINDOWSIZEY = 600;
    private static final boolean WINDOWVISIBLE = true;
    private JFrame window;

    static GraphicsConfiguration gc;

    public void createWindow(){
        //JFrame window = new JFrame(gc);
        window.setTitle(WINDOWTITLE);
        window.setResizable(WINDOWRESIZE);
        window.setLocation(WINDOWLOCX, WINDOWLOCY);
        window.setSize(WINDOWSIZEX, WINDOWSIZEY);
        window.setVisible(WINDOWVISIBLE);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void initWindow(){
        window = new JFrame();
    }

    public JFrame getWindow(){
        return window;
    }




}
