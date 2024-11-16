import java.io.*;
import java.util.*;

public class frequency{
  public static void main(String[]args){
     int flag=0,f=0;
     String sentence;
     char ch;
     Scanner sc = new Scanner(System.in);
     
     System.out.println("enter a sentence");
     sentence = sc.nextLine();
     
     System.out.println("enter the charecter to find frequnecy");
     ch = sc.next().charAt(0);
     
     int len = sentence.length();
     
     for(int i=0;i<len;i++){
       if(sentence.charAt(i)==ch){
         flag=1;
         f++;
       }
     }
     if(flag==1){
      System.out.print("the frequency is " +f); 
   }
   else{
      System.out.println("letter not found");
   }
} 
  }
