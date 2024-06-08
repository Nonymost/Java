import javax.swing.*;
import java.awt.*;

public class App {

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {

            new SFrame();
        });
    }
}

class SFrame extends JFrame {

    Toolkit kit = Toolkit.getDefaultToolkit();
    Dimension screenSize = kit.getScreenSize();
    Image img = new ImageIcon("img.png").getImage();
    int x = screenSize.width / 2;
    int y = screenSize.height / 2;

    public SFrame() {
        setIconImage(img);
        setTitle("ZeyNoteBook");
        setVisible(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}