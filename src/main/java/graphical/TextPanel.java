package graphical;

import javax.swing.*;
import java.awt.*;

public class TextPanel extends JComponent {
    private String dynamicText;

    public static class Builder {
        private String fontFamily;
        private Integer fontStyle;
        private Integer fontSize;
        private Color fontColor;
        private Color fontBackground;
        private Integer textPositionX;
        private Integer textPositionY;
        private Integer textAreaWidth;
        private Integer textAreaHeight;

        public Builder() {
        }

        public Builder setFontFamily(String fontFamilyName) {
            fontFamily = fontFamilyName;
            return this;
        }

        public Builder setFontStyle(Integer fontStyle) {
            this.fontStyle = fontStyle;
            return this;
        }

        public Builder setFontSize(Integer fontSize) {
            this.fontSize = fontSize;
            return this;
        }

        public Builder setFontColor(Color fontColor) {
            this.fontColor = fontColor;
            return this;
        }

        public Builder setFontBackground(Color fontBackground) {
            this.fontBackground = fontBackground;
            return this;
        }

        public Builder setTextPositionX(Integer textPositionX) {
            this.textPositionX = textPositionX;
            return this;
        }

        public Builder setTextPositionY(Integer textPositionY) {
            this.textPositionY = textPositionY;
            return this;
        }

        public Builder setTextAreaWidth(Integer textAreaWidth) {
            this.textAreaWidth = textAreaWidth;
            return this;
        }

        public Builder setTextAreaHeight(Integer textAreaHeight) {
            this.textAreaHeight = textAreaHeight;
            return this;
        }

        public TextPanel build() {
            TextPanel result = new TextPanel();
            result.setFont(new Font(fontFamily, fontStyle, fontSize));
            result.setLocation(textPositionX, textPositionY);
            result.setForeground(fontColor);
            result.setBackground(fontBackground);
            result.setSize(textAreaWidth, textAreaHeight);
            return result;
        }
    }

    private TextPanel() {
    }

    public void setDynamicText (String newTextValue) {
        dynamicText = newTextValue;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D)g;
        g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2d.drawString(dynamicText,30,30);
    }
}
