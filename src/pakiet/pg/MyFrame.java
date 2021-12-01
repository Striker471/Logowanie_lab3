package pakiet.pg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame  {
    Dane dane = new Dane();
    public MyFrame() {

        JPanel panel = new JPanel();
        JFrame frame = new JFrame("Logowanie");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setLayout(null);
        panel.setBackground(Color.DARK_GRAY);

        JLabel userlabel = new JLabel("User");
        userlabel.setBounds(20, 50, 60, 20);
        userlabel.setForeground(Color.white);

        JTextField login = new JTextField();
        login.setBounds(120, 50, 165, 20);

        JLabel passwordlabel = new JLabel("Password");
        passwordlabel.setBounds(20, 100, 60, 20);
        passwordlabel.setForeground(Color.white);

        JPasswordField password = new JPasswordField();
        password.setBounds(120, 100, 165, 20);

        JButton button = new JButton("Login");
        button.setBounds(20, 150, 100, 20);


        JButton buttonclear = new JButton("Clear");
        buttonclear.setBounds(220, 150, 100, 20);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String probne_logowanie = login.getText();
                char[] haslo =  password.getPassword();
                if(dane.porownanie(probne_logowanie,haslo))
                    panel.setBackground(Color.GREEN);
                else
                    panel.setBackground(Color.RED);
            }
        });

        buttonclear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login.setText("");
                password.setText("");
                panel.setBackground(Color.DARK_GRAY);
            }
        });


        frame.setVisible(true);


        panel.add(login);
        panel.add(userlabel);
        panel.add(passwordlabel);
        panel.add(password);
        panel.add(button);
        panel.add(buttonclear);
        frame.add(panel);

    }
}


