package graphical;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ImagePanelTest {

    @Test
    public void buildProperlyTest() {
        ImagePanel imagePanel = new ImagePanel.Builder()
                .build();
        Assertions.assertTrue(imagePanel instanceof ImagePanel);
    }

}
