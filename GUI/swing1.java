import java.awt.FlowLayout;
import javax.swing.*;

class swing1{
  
public static void main(String[] args) {
    JFrame f;
    JLabel l;
    f = new JFrame("First Java Application");
    f.setSize(500,500);
    f.setLayout(new FlowLayout());
    f.setVisible(true);
    l = new JLabel("Studying frame and label");
    f.add(l);
    f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);

}

}
