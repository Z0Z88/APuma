package graphical;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

public class TextPanelTest {
    private TextPanel textPanel;

    @Test
    public void buildProperlyTest() {
        textPanel = new TextPanel.Builder()
                .fontFamily("Dialog")
                .setFontBackground(Color.BLUE)
                .setFontColor(Color.CYAN)
                .setFontSize(24)
                .setFontStyle(2)
                .setTextAreaHeight(500)
                .setTextAreaWidth(500)
                .setTextPositionX(15)
                .setTextPositionY(30)
                .build();
        Assertions.assertTrue(textPanel instanceof TextPanel);
    }
}
