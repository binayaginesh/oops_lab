import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class calc implements ActionListener{
  String a,b,op;
  int x,y,z;
  JFrame f;
  JTextField t;
  JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
  
  calc(){
  
  f = new JFrame("Calculator");
  f.setSize(500,500);
  f.setLayout(new GridLayout(6,3,20,20));
  t = new JTextField();
  b1= new JButton("1");
  b2= new JButton("2");
  b3= new JButton("3");
  b4= new JButton("4");
  b5= new JButton("5");
  b6= new JButton("6");
  b7= new JButton("7");
  b8= new JButton("8");
  b9= new JButton("9");
  b10= new JButton("0");
  b11= new JButton("+");
  b12= new JButton("-");
  b13= new JButton("*");
  b14= new JButton("/");
  b15= new JButton("%");
  b16= new JButton("AC");
  b17= new JButton("=");
  
  
  b1.addActionListener(this);
  b2.addActionListener(this);
  b3.addActionListener(this);
  b4.addActionListener(this); 
  b5.addActionListener(this);
  b6.addActionListener(this);
  b7.addActionListener(this);
  b8.addActionListener(this);
  b9.addActionListener(this);
  b10.addActionListener(this);
  b11.addActionListener(this);
  b12.addActionListener(this);
  b13.addActionListener(this);
  b14.addActionListener(this);
  b15.addActionListener(this);
  b16.addActionListener(this);
  b17.addActionListener(this);
  
  f.add(t);
  f.add(b1);
  f.add(b2);
  f.add(b3);
  f.add(b4);
  f.add(b5);
  f.add(b6);
  f.add(b7);
  f.add(b8);
  f.add(b9);
  f.add(b10);
  f.add(b11);
  f.add(b12);
  f.add(b13);
  f.add(b14);
  f.add(b15);
  f.add(b16);
  f.add(b17);
  
  f.setVisible(true);
  f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  
  public void actionPerformed(ActionEvent ae){
    JButton button = (JButton)ae.getSource();
    
    try{
    
      if(button==b1)
       t.setText(t.getText() + "1");
       else if(button==b2)
       t.setText(t.getText() + "2");
       else if(button==b3)
        t.setText(t.getText() + "3");
       else if(button==b4)
       t.setText(t.getText() + "4");
       else if(button==b5)
       t.setText(t.getText() + "5");
       else if(button==b6)
       t.setText(t.getText() + "6");
       else if(button==b7)
       t.setText(t.getText() + "7");
       else if(button==b8)
       t.setText(t.getText() + "8");
       else if(button==b9)
       t.setText(t.getText() + "9");
       else if(button==b10)
       t.setText(t.getText() + "0");
       
       else if(button==b11){
       a=t.getText();
       t.setText("");
       op="+";
        }
       else if(button == b12){
         a=t.getText();
         t.setText("");
         op="-";
       }
       else if(button == b13){
         a=t.getText();
         t.setText("");
         op="*";
       }
       else if(button == b14){
         a=t.getText();
         t.setText("");
         op="/";
       }
       else if(button == b15){
         a=t.getText();
         t.setText("");
         op="%";
       }
       
       
       else if(button == b16){
         t.setText("");
       }
       else{
         b=t.getText();
         x = Integer.parseInt(a);
         y=Integer.parseInt(b);
         
         if(op.equals("+")){
           z=x+y;}
         else if(op.equals("-")){
           z=x-y;}
         else if(op=="*"){
           z=x*y;  }
         else if(op=="/"){
           z=x/y;}
         else if(op=="%"){
           z=x%y;}
           
          String result; 
         result = String.valueOf(z);
         t.setText(result);   
       }
    }
    
    catch(ArithmeticException e){
      t.setText("Exception occured");
    }
  }  
}
class calculator{
  public static void main(String[]args){
    new calc(); 
  }
}
