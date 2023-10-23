import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main extends JFrame {
    private int clickCount = 0;
    private JButton clickButton;
    private JLabel countLabel;

    public main() {
        setTitle("Click Counter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));

        clickButton = new JButton("YOU!");
        countLabel = new JLabel("abuh 0");

        clickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clickCount++;
                countLabel.setText("abuh " + clickCount);
            }
        });

        add(clickButton);
        add(countLabel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                main counter = new main();
                counter.setVisible(true);
            }
        });
    }
}
