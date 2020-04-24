import graphical.Frame;
import graphical.TextPanel;

import java.awt.*;

public class APuMa {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.initWindow();
        frame.createWindow();
        frame.getWindow().setResizable(true);
        TextPanel textPanel = new TextPanel.Builder()
                .setFontFamily("Dialog")
                .setFontBackground(Color.BLUE)
                .setFontColor(Color.BLACK)
                .setFontSize(24)
                .setFontStyle(2)
                .setTextAreaHeight(500)
                .setTextAreaWidth(500)
                .setTextPositionX(15)
                .setTextPositionY(30)
                .build();
        frame.getWindow().add(textPanel);
        textPanel.setDynamicText("X-X-X");

        // TODO: A cég logo meghívása
        // TODO: A játék logo meghívása
        // TODO: Intro meghívása
        // TODO: Menü meghívása
        // TODO: Esetleg valami kilépés után?!?

    }
}
