import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.plaf.DimensionUIResource;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;


/**
* @author Leone Rodrigues Santos (leonesantos@aluno.uespi.br)
*/

public class SimpleWindow extends JFrame{

    // Super builder

    public SimpleWindow(){

        super();

        // Title and proportion

        this.setTitle("Cadastro");
        this.setSize(500, 300);

        // Simple layout, it add the elements one by one on sequence

        this.setLayout(new FlowLayout());

        // Close the window

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cadastro components

        JLabel name = new JLabel("Nome");
        JTextField nameAux = new JTextField();
        JButton enter = new JButton("Inserir");


        // Age and weight components

        JLabel age = new JLabel("Idade");
        JTextField ageAux = new JTextField();

        JLabel weight = new JLabel("Peso");
        JTextField weightAux = new JTextField();

        // Text field dimmension

        nameAux.setPreferredSize(new DimensionUIResource(450, 30));
        ageAux.setPreferredSize(new DimensionUIResource(100, 30));
        weightAux.setPreferredSize(new DimensionUIResource(100, 30));
       
        // Show message after click on the button

        enter.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {

                // To return what was entered

                String name1 = nameAux.getText();
                int age1 = Integer.parseInt(ageAux.getText());
                float weight1 = Float.parseFloat(weightAux.getText());

                // Show data 

                JOptionPane.showMessageDialog(null, "Dados inseridos no cadastro " + 
                "\nNome: " + name1 + "\nIdade: " + age1 + "\nPeso: " + weight1);

                JOptionPane.showMessageDialog(null, "Cadastro concluido com sucesso.");
            };
        });

        // Add the components in the frame

        // Name

        this.add(name);
        this.add(nameAux);

        // Age

        this.add(age);
        this.add(ageAux);

        // Weight

        this.add(weight);
        this.add(weightAux);

        // Button 
        
        this.add(enter);

        // Visibility

        this.setVisible(true);
    }

    public static void main(String[] args) {
        
        new SimpleWindow();
    }
    
}
