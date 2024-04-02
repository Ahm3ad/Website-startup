import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities; // Import SwingUtilities

public class RequestHandler extends JFrame {

    public RequestHandler() {
        setTitle("Request Handler"); // 

        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create buttons
        JButton acceptButton = new JButton("Accept Friend Request");
        JButton denyButton = new JButton("Deny Friend Request");

        // Add action listeners to handle button clicks
        acceptButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Request accepted");
        });

        denyButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Request Denied");
        });

        // Create a panel for the buttons
        JPanel panel = new JPanel();
        panel.add(acceptButton);
        panel.add(denyButton);

        // Add the panel to the frame
        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new RequestHandler();
        });
    }
}
