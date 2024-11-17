import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class BankTrans implements ActionListener {
    static JFrame f;
    static JLabel l1, l2, l3, l4, messageLabel;
    static JTextField t1, t2, t3;
    static JButton a;

    public static void main(String[] args) {
        BankTrans b = new BankTrans();
        f = new JFrame("Bank Transaction");
        f.setSize(500, 500);
        f.setLayout(new FlowLayout());
        
        l1 = new JLabel("Enter the details");
        l2 = new JLabel("Account Number:");
        t1 = new JTextField(15);
        l3 = new JLabel("Holder Name:");
        t2 = new JTextField(15);
        l4 = new JLabel("Amount:");
        t3 = new JTextField(15);
        
        a = new JButton("Withdraw");
        a.addActionListener(b);
        
        messageLabel = new JLabel(""); // Label to show success or limit exceed message
        
        // Adding components to the frame
        f.add(l1);
        f.add(l2);
        f.add(t1);
        f.add(l3);
        f.add(t2);
        f.add(l4);
        f.add(t3);
        f.add(a);
        f.add(messageLabel);
        
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        String s = ae.getText();            

        try {
        
            // Get the amount from the text field and parse it to a number
            // Check if the amount is greater than 25000
            if (s > 25000) {
                messageLabel.setText("LIMIT EXCEEDED");
            } else {
                messageLabel.setText("TRANSACTION SUCCESSFUL");
            }
        } catch (NumberFormatException ex) {
            messageLabel.setText("Please enter a valid amount");
        }
    }
}
