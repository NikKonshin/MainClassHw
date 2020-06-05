package homework7a;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCalc extends JFrame {
    private String text = "";
    private int result = 0;
    private char summ = ' ';
    private int a = 0;
    private int b = 0;
    public MyCalc()  {

        setBounds(600, 400, 210 ,265 );
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("My calculator");
        setResizable(false);


        setLayout(new FlowLayout());


        JTextField textField = new JTextField(15);
        add(textField);

        JButton button7 = new JButton("  7  ");
        add(button7);

        JButton button8 = new JButton("  8  ");
        add(button8);

        JButton button9 = new JButton("  9  ");
        add(button9);

        JButton button4 = new JButton("  4  ");
        add(button4);

        JButton button5 = new JButton("  5  ");
        add(button5);

        JButton button6 = new JButton("  6  ");
        add(button6);

        JButton button1 = new JButton("  1  ");
        add(button1);

        JButton button2 = new JButton("  2  ");
        add(button2);

        JButton button3 = new JButton("  3  ");
        add(button3);

        JButton button0 = new JButton("  0  ");
        add(button0);

        JButton buttonDot = new JButton("  .  ");
        add(buttonDot);

        JButton buttonDivision = new JButton("  /  ");
        add(buttonDivision);

        JButton buttonMultiplication = new JButton("  *  ");
        add(buttonMultiplication);

        JButton buttonSubtraction = new JButton("  -  ");
        add(buttonSubtraction);

        JButton buttonSumm = new JButton("  +  ");
        add(buttonSumm);

        JButton buttonEqually = new JButton("  =  ");
        add(buttonEqually);

        JButton buttonClear = new JButton("  C  ");
        add(buttonClear);

        button7.addActionListener(e -> {
            if (e.getSource() == button7) {
                text = text + "7";
                textField.setText(text);
            }
        });

        button8.addActionListener(e -> {

            if (e.getSource() == button8) {
                text = text + "8";
                textField.setText(text);
            }
        });
        button9.addActionListener(e -> {

            if (e.getSource() == button9) {
                text = text + "9";
                textField.setText(text);
            }
        });
        button4.addActionListener(e -> {

            if (e.getSource() == button4) {
                text = text + "4";
                textField.setText(text);
            }
        });
        button5.addActionListener(e -> {

            if (e.getSource() == button5) {
                text = text + "5";
                textField.setText(text);
            }
        });
        button6.addActionListener(e -> {

            if (e.getSource() == button6) {
                text = text + "6";
                textField.setText(text);
            }
        });
        button1.addActionListener(e -> {

            if (e.getSource() == button1) {
                text = text + "1";
                textField.setText(text);
            }
        });
        button2.addActionListener(e -> {

            if (e.getSource() == button2) {
                text = text + "2";
                textField.setText(text);
            }
        });
        button3.addActionListener(e -> {

            if (e.getSource() == button3) {
                text = text + "3";
                textField.setText(text);
            }
        });
        button0.addActionListener(e -> {

            if (e.getSource() == button0) {
                text = text + "0";
                textField.setText(text);
            }
        });
        buttonDot.addActionListener(e -> {

            if (e.getSource() == buttonDot) {
                text = text + ".";
                textField.setText(text);
            }
        });
        buttonDivision.addActionListener(e -> {

            if (e.getSource() == buttonDivision) {
                a = Integer.parseInt(text);
                text = "";
                summ = '/';
                textField.setText(text);
            }
        });
        buttonMultiplication.addActionListener(e -> {

            if (e.getSource() == buttonMultiplication) {
                a = Integer.parseInt(text);
                text = "";
                summ = '*';
                textField.setText(text);
            }
        });
        buttonSubtraction.addActionListener(e -> {

            if (e.getSource() == buttonSubtraction) {
                a = Integer.parseInt(text);
                text = "";
                summ = '-';
                textField.setText(text);
            }
        });
        buttonSumm.addActionListener(e -> {

            if (e.getSource() == buttonSumm) {
                a = Integer.parseInt(text);
                text = "";
                summ = '+';
                textField.setText(text);
            }
        });
        buttonClear.addActionListener(e -> {

            if (e.getSource() == buttonClear) {
                text = "";
                textField.setText(text);
            }
        });
        buttonEqually.addActionListener(e -> {

            if (e.getSource() == buttonEqually) {
                if(summ == '+') {
                    b = Integer.parseInt(text);
                    textField.setText(String.valueOf(a + b));
                }
            }
            if(summ == '-') {
                b = Integer.parseInt(text);
                textField.setText(String.valueOf(a - b));
            }
            if(summ == '*') {
                b = Integer.parseInt(text);
                textField.setText(String.valueOf(a * b));
            }
            if(summ == '/') {
                b = Integer.parseInt(text);
                textField.setText(String.valueOf((double) a / b));
            }
        });

        setVisible(true);

    }
}
