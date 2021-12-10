import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.plaf.DimensionUIResource;
import java.awt.FlowLayout;

/**
* @author Leone Rodrigues Santos (leonesantos@aluno.uespi.br)
*/

public class VMGUI extends JFrame{
    

    public VMGUI(){

        super();

        // Layout

        this.setLayout(new FlowLayout());

        // Title and proportion

        this.setTitle("Calculadora de velocidade media");
        this.setSize(500, 100);

        // Close the window

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Labels
        
        JLabel v1 = new JLabel("Velocidade inicial(Km) ");
        JLabel v2 = new JLabel("    Velocidade final(km) ");
        JLabel time = new JLabel("Tempo(h) ");

        // Fields

        JTextField txtV1 = new JTextField();
        JTextField txtV2 = new JTextField();
        JTextField txtTime = new JTextField();

        

        // Text filds dimmensions

        txtV1.setPreferredSize(new DimensionUIResource(60, 30));
        txtV2.setPreferredSize(new DimensionUIResource(60, 30));
        txtTime.setPreferredSize(new DimensionUIResource(60, 30));

        // Button 

        JButton calc = new JButton("Calcular velocidade media");

        // Show message after click on the button

        calc.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {

                // To return what was entered

                int v1 = Integer.parseInt(txtV1.getText());
                int v2 = Integer.parseInt(txtV2.getText());
                int time1 = Integer.parseInt(txtTime.getText());

                float vm = (v2 - v1)/time1;

                // Show data 

                JOptionPane.showMessageDialog(null, "\nVelocidade media = " + vm + "km/h");

                JOptionPane.showMessageDialog(null, "Obrigado por utilizar.");
            };
        });

        // Add the components on the Window

        // Initial speed

        this.add(v1);
        this.add(txtV1);

        // Final speed

        this.add(v2);
        this.add(txtV2);

        // Time

        this.add(time);
        this.add(txtTime);
 

        // Button
        
        this.add(calc);
        
        // Show the window

       
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new VMGUI();
    }
}
