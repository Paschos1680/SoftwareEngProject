import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class Main {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("HealthHive");

 
        JLabel welcomeLabel = new JLabel("Welcome to HealthHive!");
        welcomeLabel.setHorizontalAlignment(JLabel.CENTER);
        welcomeLabel.setForeground(Color.BLACK); 
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 24)); 

        
        frame.getContentPane().setBackground(Color.YELLOW);

   
        frame.getContentPane().add(welcomeLabel);

        
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
