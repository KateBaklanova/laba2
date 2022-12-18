package laba2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LabelExample extends JFrame implements ActionListener {
    JRadioButton jRadioButton1;
    JRadioButton jRadioButton2;
    JRadioButton jRadioButton3;
    JRadioButton jRadioButton4;
    JRadioButton jRadioButton5;
    JRadioButton jRadioButton6;
    JRadioButton jRadioButton7;
    JPanel panel = new JPanel();
    JTextField tf, tf1, tf2, tf3;
    JLabel l, l1, l2, l3, l4, l5;
    JButton b;
    JButton  b1;
    JButton  b2;
    Human person = new Human();
    Human.Head h = new  Human.Head();
    Human.Hand palm = new  Human.Hand();
    Human.Leg legs = new  Human.Leg();

    LabelExample() {
        jRadioButton1 = new JRadioButton();
        jRadioButton2 = new JRadioButton();
        jRadioButton3 = new JRadioButton();
        jRadioButton1.setText("идут");
        jRadioButton2.setText("поднята");
        jRadioButton3.setText("думает");


        tf = new JTextField();
        l = new JLabel("Name");

        setSize(700, 700);
        setPreferredSize(new Dimension(250, 300));

        tf1=new JTextField();
        tf1.setPreferredSize( new Dimension( 100, 30 ) );
        l1 = new JLabel("Surname");

        b1 = new JButton("ABOUT HUMAN");
        b1.setBounds(120, 300, 95, 21);
        b1.addActionListener(this);


        tf2=new JTextField();
        tf2.setPreferredSize( new Dimension( 100, 30 ) );

        b2 = new JButton("Confirm");
        b2.addActionListener(this);


        l2 = new JLabel("Опции");


        l3 = new JLabel("Ноги");

        l4 = new JLabel("Рука");

        l5 = new JLabel("Голова");

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(l);
        panel.add(tf1);
        panel.add(l1);
        panel.add(tf2);
        panel.add(l2);
        panel.add(l3);
        panel.add(jRadioButton1);
        panel.add(l4);
        panel.add(jRadioButton2);
        panel.add(l5);
        panel.add(jRadioButton3);
        panel.add(b2);

        panel.setSize(500, 500);
        add(panel);
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setForeground(Color.GREEN);
        setLocationRelativeTo (null);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b2)
        {
            String s2=tf2.getText();
            String s1=tf1.getText();

            person.setName(s1);
            person.setSurname(s2);
            person.information();

            if(jRadioButton1.isSelected() )
            {
                String s4 = jRadioButton1.getText();
                legs.setLeg(s4);

            }

            if(jRadioButton2.isSelected() )
            {
                String s5 = jRadioButton2.getText();
                palm.setHand(s5);

            }

            if(jRadioButton3.isSelected() )
            {
                String s6 = jRadioButton3.getText();
                h.setHead(s6);

            }


            legs.processLeg1();
            palm.processHand();
            h.processHead1();

        }

    }


}
