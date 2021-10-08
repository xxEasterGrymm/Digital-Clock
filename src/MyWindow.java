import javax.swing.*;
import java.awt.*;
import java.util.Date;

public class MyWindow extends JFrame {
    private JLabel label;
    private Font font = new Font("Times New Roman", Font.BOLD, 30);

    MyWindow() {
        setTitle("Digital Clock");
        setSize(570, 300);
        setLocation(500, 200);
        createGUI();
        startClock();
        setVisible(true);
    }

    public void createGUI() {
        label = new JLabel("Digital Clock");
        label.setFont(font);
        setLayout(new GridLayout(2, 1));
        add(label);
    }

    public void startClock() {
        Timer timer = new Timer(1000, e -> {
            String dateTime = new Date().toLocaleString();
            label.setText(dateTime);
        });
        timer.start();
        JLabel ist = new JLabel("IST - Indian Standard Time (UTC + 5:30)");
        ist.setFont(font);
        add(ist);
    }
}
