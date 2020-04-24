package graphical;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImagePanel extends Component {
    private Integer positionX = 200;
    private Integer positionY = 200;
    private Integer width = 300;
    private Integer height = 300;
    private String fileName = "x.jpg";
    private String path = "./";
    private BufferedImage image;

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

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setImage() {
        try {
            this.image = ImageIO.read(new File(path+fileName));
        } catch (IOException e) {
        }
    }

    @Override
    public Dimension getPreferredSize() {
        if (image == null) {
            return new Dimension(width,height);
        } else {
            return new Dimension(image.getWidth(null), image.getHeight(null));
        }
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(image, positionX, positionY, null);
    }

}
