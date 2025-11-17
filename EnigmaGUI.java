import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.*;
import javax.xml.crypto.dsig.spec.HMACParameterSpec;

import java.awt.*;
import java.awt.event.*;

public class EnigmaGUI {
    public static void main(String args[]){
        JFrame f = new JFrame();
        f.setTitle("Enigma");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton enc = new JButton("Encrypt");
        JButton dec = new JButton("Decrypt");

        JLabel innertxt = new JLabel("Inner");
        JComboBox innerBox = new JComboBox<>();
        JLabel midtxt = new JLabel("Middle");
        JLabel outtxt = new JLabel("Outer");

        JLabel iniPos = new JLabel("Initial Positions");


        JPanel topRow = new JPanel(new BorderLayout());
        JPanel Rotors = new JPanel(new BorderLayout());
        JPanel inPo = new JPanel(new BorderLayout());
        JPanel buttons = new JPanel(new BorderLayout());

        Rotors.add(innertxt, BorderLayout.WEST);
        Rotors.add(midtxt, BorderLayout.CENTER);
        Rotors.add(outtxt, BorderLayout.EAST);

        inPo.add(iniPos);

        buttons.add(enc, BorderLayout.WEST);
        buttons.add(dec, BorderLayout.EAST);

        topRow.add(Rotors, BorderLayout.WEST);
        topRow.add(inPo, BorderLayout.CENTER);
        topRow.add(buttons, BorderLayout.EAST);

        f.add(topRow, BorderLayout.NORTH);


        f.pack();
        f.setVisible(true);
    }
}
