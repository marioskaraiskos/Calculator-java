import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

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


        //operations//

        JButton minus = new JButton("-");
        minus.setBounds(100, 100, 100, 30);
        panel.add(minus);
        JButton divide = new JButton("/");
        divide.setBounds(100, 130, 100, 30);
        panel.add(divide);
        JButton multiply = new JButton("*");
        multiply.setBounds(100, 160, 100, 30);
        panel.add(multiply);



        //numbers//

        JButton one = new JButton("1");
        one.setBounds(200, 70, 100, 30);
        panel.add(one);
        JButton two = new JButton("2");
        two.setBounds(300, 70, 100, 30);
        panel.add(two);
        JButton three = new JButton("3");
        three.setBounds(400, 70, 100, 30);
        panel.add(three);
        JButton four = new JButton("4");
        four.setBounds(200, 100, 100, 30);
        panel.add(four);
        JButton five = new JButton("5");
        five.setBounds(300, 100, 100, 30);
        panel.add(five);
        JButton six = new JButton("6");
        six.setBounds(400, 100, 100, 30);
        panel.add(six);
        JButton seven = new JButton("7");
        seven.setBounds(200, 130, 100, 30);
        panel.add(seven);
        JButton eight = new JButton("8");
        eight.setBounds(300, 130, 100, 30);
        panel.add(eight);
        JButton nine = new JButton("9");
        nine.setBounds(400, 130, 100, 30);
        panel.add(nine);
        JButton zero = new JButton("0");
        zero.setBounds(300, 160, 100, 30);
        panel.add(zero);
        JButton clear = new JButton("clear");
        clear.setBounds(200, 160, 100, 30);
        panel.add(clear);
        JButton equals = new JButton("=");
        equals.setBounds(400, 160, 100, 30);
        panel.add(equals);

        //textField//

        JTextField input = new JTextField(10);
        input.setBounds(100, 190, 400, 40);
        panel.add(input);

        //adding action event listener //
        one.addActionListener(e -> {
            // Set the text of the JTextField to "5" when the button is pressed
            input.setText("1");
        });
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText("1");
            }
        });
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText("2");
            }
        });
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText("3");
            }
        });
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText("4");
            }
        });
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText("5");
            }
        });
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText("6");
            }
        });
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText("7");
            }
        });
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText("8");
            }
        });
        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText("9");
            }
        });
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText("0");
            }
        });
        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText("result");
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText("-");
            }
        });
        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText("*");
            }
        });
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText("/");
            }
        });
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText("");
            }
        });
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input.setText("+");
            }
        });

        //result//
        Number result;
         result = 0.0f;





        frame.setVisible(true);
        }





        }


