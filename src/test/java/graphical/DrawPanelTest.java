package graphical;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DrawPanelTest {
    private DrawPanel drawPanel;

    @Test
    public void buildProperlyTest() {
        drawPanel = new DrawPanel.Builder()
                .build();
        Assertions.assertTrue(drawPanel instanceof DrawPanel);
    }
}
