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


public class TConverterGUI extends JFrame{
    
    public TConverterGUI(){

        super();

        // Layout

        this.setLayout(new FlowLayout());

        // Title and proportion

        this.setTitle("Conversor de temperatura");
        this.setSize(500, 100);

        // Close the window

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Label and field

        JLabel f = new JLabel("Temperatura em graus Fahrenheit(°F) ");

        JTextField txtF = new JTextField();
        txtF.setPreferredSize(new DimensionUIResource(60, 30));

        // Button 

        JButton calc = new JButton("Converter para °C");

        // Show message after click on the button

        calc.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {

                // To return what was entered

                Float f1 = Float.parseFloat(txtF.getText());
                
                float convert = 5 * ((f1 - 32)/9);

                // Show data 

                JOptionPane.showMessageDialog(null, "\nTemperatura inserida: " + f1 +
                "°F\nTemperatura convertida para °C: " + convert);

                JOptionPane.showMessageDialog(null, "Obrigado por utilizar.");
            };
        });

        // Add the components on the Window

        // Temperature

        this.add(f);
        this.add(txtF);

        // Button
        
        // Button
        
        this.add(calc);
        
        // Show the window

       
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new TConverterGUI();
    }
}
