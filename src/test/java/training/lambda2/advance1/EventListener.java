package training.lambda2.advance1;

import javax.swing.*;

public class EventListener {
    public static void main(String[] args) {
        JTextField jTextField = new JTextField("dsddddd");

        jTextField.setBounds(50, 50, 150, 20);

        JButton button = new JButton("KLick");
        button.setBounds(80, 100, 70, 30);

        button.addActionListener(e -> jTextField.setText("Hello Miro"));

        JFrame frame = new JFrame();
        frame.add(jTextField);
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(300,200);
        frame.setVisible(true);

    }
}
