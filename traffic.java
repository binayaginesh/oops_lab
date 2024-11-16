import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class light extends JPanel implements ActionListener{
  JRadioButton r,y,g;
  Color red,green,yellow;
  
  light(){
    r = new JRadioButton("red");
    y = new JRadioButton("yellow");
    g = new JRadioButton("green");
    
    red=getBackground();
    yellow=getBackground();
    green =getBackground();
    
    ButtonGroup grp = new ButtonGroup();
    grp.add(r);
    grp.add(y);
    grp.add(g);
    
    r.addActionListener(this);
    y.addActionListener(this);
    g.addActionListener(this);
    
    add(r);
    add(y);
    add(g);
    
  }
  
  public void actionPerformed(ActionEvent ae){
    if(r.isSelected()){
      red = Color.red;
      yellow = getBackground();
      green = getBackground();
      repaint(); 
    }
    else if(y.isSelected()){
      red=getBackground();
      yellow=Color.yellow;
      green=getBackground();
      repaint();
    }
    else if(g.isSelected()){
      red=getBackground();
      yellow=getBackground();
      green=Color.green;
      repaint();
    }
    
  }
  
  public void paint(Graphics graphics){
      super.paint(graphics);
      graphics.drawRect(70,70,200,400);
      graphics.setColor(Color.black);
      graphics.fillRect(70,70,200,400);
      graphics.setColor(red);
      graphics.fillOval(140,100,70,70);
      graphics.setColor(yellow);
      graphics.fillOval(140,200,70,70);
      graphics.setColor(green);
      graphics.fillOval(140,300,70,70);
      }
  
  
}

public class traffic{
  public static void main(String[]args){
  JFrame f = new JFrame("Traffic");
  light l = new light();
  f.setSize(500,500);
  f.add(l);
  
  f.setVisible(true);
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  }
}
