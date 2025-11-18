import java.awt.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EnigmaFrame {
    
    public EnigmaFrame(){
        JFrame f = new JFrame();
        f.setTitle("Enigma");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton enc = new JButton("Encrypt");
        JButton dec = new JButton("Decrypt");

        JLabel innertxt = new JLabel("Inner");
        String innerOptions[] = {"1", "2", "3"};
        JComboBox<String> innerBox = new JComboBox<>(innerOptions);

        JLabel midtxt = new JLabel("Middle");
        String midOptions[] = {"1", "2", "3"};
        JComboBox<String> midBox = new JComboBox<>(midOptions);

        JLabel outtxt = new JLabel("Outer");
        String outOptions[] = {"1", "2", "3"};
        JComboBox<String> outBox = new JComboBox<>(outOptions);

        JLabel iniPos = new JLabel("Initial Positions");
        JTextField posTxt = new JTextField(" ", 3);
        

        JPanel inner = new JPanel(new BorderLayout());
        JPanel mid = new JPanel(new BorderLayout());
        JPanel out = new JPanel(new BorderLayout());
        
        JPanel topRow = new JPanel(new BorderLayout());
        JPanel Rotors = new JPanel(new BorderLayout());
        JPanel inPo = new JPanel(new BorderLayout());
        JPanel buttons = new JPanel(new BorderLayout());

        JPanel TEXT = new JPanel(new BorderLayout());
        JPanel input = new JPanel(new BorderLayout());
        JPanel output = new JPanel(new BorderLayout());


        inner.add(innertxt, BorderLayout.WEST);
        inner.add(innerBox, BorderLayout.EAST);

        mid.add(midtxt, BorderLayout.WEST);
        mid.add(midBox, BorderLayout.EAST);

        out.add(outtxt, BorderLayout.WEST);
        out.add(outBox, BorderLayout.EAST);

        Rotors.add(inner, BorderLayout.WEST);
        Rotors.add(mid, BorderLayout.CENTER);
        Rotors.add(out, BorderLayout.EAST);

        inPo.add(iniPos, BorderLayout.WEST);
        inPo.add(posTxt, BorderLayout.EAST);

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
