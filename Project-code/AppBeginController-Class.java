import javax.swing.*;
import java.awt.*;

public class AppBeginScreen extends JFrame {
    private JLabel beeHiveLabel;
    private JButton nutritionButton;
    private JButton workoutButton;
    private JButton communityButton;

    public AppBeginScreen() {
        // Set up the frame
        setTitle("My App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(800, 600));

        // Create and add the bee hive label
        beeHiveLabel = new JLabel();
        beeHiveLabel.setIcon(new ImageIcon("beehive.png")); 
        beeHiveLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(beeHiveLabel, BorderLayout.NORTH);

        // Create and add the options panel on the left
        JPanel optionsPanel = new JPanel();
        optionsPanel.setLayout(new GridLayout(3, 1, 10, 10));
        optionsPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        nutritionButton = new JButton("Nutrition");
        optionsPanel.add(nutritionButton);

        workoutButton = new JButton("Workout");
        optionsPanel.add(workoutButton);

        communityButton = new JButton("Community");
        optionsPanel.add(communityButton);

        add(optionsPanel, BorderLayout.WEST);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AppBeginScreen());
    }
}
