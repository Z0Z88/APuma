package graphical;

import javax.imageio.ImageIO;
import java.applet.Applet;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImagePanel extends Applet {


    public static class Builder {
        private Integer positionX = 200;
        private Integer positionY = 200;
        private Integer width = 300;
        private Integer height = 300;

        public void setPositionX(Integer positionX) {
            this.positionX = positionX;
        }

        public void setPositionY(Integer positionY) {
            this.positionY = positionY;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public ImagePanel build() {
            ImagePanel result = new ImagePanel();
            result.setLocation(positionX, positionY);
            result.setSize(width, height);
            return result;
        }
    }

    private BufferedImage image;
    private String fileName = "b_02.png";
    private String path = "./";

    public void setFileName(String newFileName) {
        this.fileName = fileName;
    }

    @Override
    public void init() {
        try {
            File url = new File(path + fileName);
            image = ImageIO.read(url);
        } catch (IOException e) {
        }
    }
    @Override
    public void paint(Graphics g) {
        g.drawImage(image, this.getX(), this.getY(), null);
    }

    private ImagePanel() throws HeadlessException {
    }
}
