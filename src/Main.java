import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        frame.add(panel);
        panel.setLayout(null);


        JButton add = new JButton("+");
        add.setBounds(100, 70, 100, 30); // x, y, width, height
        panel.add(add);

        JTextField input = new JTextField(10);
        input.setBounds(1000, 150, 400, 40);
        panel.add(input);

        JButton minus = new JButton("-");
        minus.setBounds(100, 100, 100, 30);
        panel.add(minus);
        JButton divide = new JButton("/");
        divide.setBounds(100, 130, 100, 30);
        panel.add(divide);
        JButton multiply = new JButton("*");
        multiply.setBounds(100, 160, 100, 30);
        panel.add(multiply);
        JButton eq = new JButton("=");
        eq.setBounds(100, 200, 300, 60);
        panel.add(eq);
        int x = 200;
        int y = 70;
        int i = 0;
        for ( i = 0; i<10; i++) {
            JButton b = new JButton("" + i);
            b.setBounds(x, y, 100, 30);
            x = x + 100;
            if (i == 0) {
                y = y + 30;
                x = x - 100;
            }
            else if ( i == 3 ) {
                y = y + 30;
                x = x - 300;
            }
            else if ( i == 6 ) {
                y = y + 30;
                x = x - 300;
            }

            panel.add(b);
        }




        frame.setVisible(true);
        }

}
