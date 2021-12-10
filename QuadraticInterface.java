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

public class QuadraticInterface extends JFrame{

    // Graphic interface test

    public QuadraticInterface(){

        // Create and set up the window 

        super();

        // Simple layout, it add the elements one by one on sequence

        this.setLayout(new FlowLayout());

        // Title and proportion

        this.setTitle("Calculadora");
        this.setSize(500, 100);

        // Close the window

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Coefficient labels
        
        JLabel a = new JLabel("Coeficiente \"a\"");
        JLabel b = new JLabel("Coeficiente \"b\"");
        JLabel c = new JLabel("Coeficiente \"c\"");

        // Coefficient fields

        JTextField aAux = new JTextField();
        JTextField bAux = new JTextField();
        JTextField cAux = new JTextField();

        // Text filds dimmensions

        aAux.setPreferredSize(new DimensionUIResource(50, 30));
        bAux.setPreferredSize(new DimensionUIResource(50, 30));
        cAux.setPreferredSize(new DimensionUIResource(50, 30));

        // Button 

        JButton calc = new JButton("Calcular delta");

        
        // Show message after click on the button

        calc.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {

                // To return what was entered

                int a1 = Integer.parseInt(aAux.getText());
                int b1 = Integer.parseInt(bAux.getText());
                int c1 = Integer.parseInt(cAux.getText());

                int delta = (b1*b1)- 4 *(a1 * c1);

                // Show data 

                JOptionPane.showMessageDialog(null, "\nDelta = (b*b)- 4 *( a * c) = " + 
                delta);

                JOptionPane.showMessageDialog(null, "Obrigado por utilizar.");
            };
        });

        
        // Add the components on the Window

        // A

        this.add(a);
        this.add(aAux);

        // B

        this.add(b);
        this.add(bAux);

        // C

        this.add(c);
        this.add(cAux); 

        // Button
        
        this.add(calc);
        
        // Show the window

        
        this.setVisible(true);
    }

    
    public static void main(String[] args){
        
        new QuadraticInterface();
    
    }
}