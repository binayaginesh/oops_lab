import java.io.*;
import java.lang.*;
import java.util.*;

public class token{
 
  public static void main(String[]args){
  int n ,sum=0;
  Scanner sc = new Scanner(System.in);
     System.out.println("enter the line of integers ");
     
     String s= sc.nextLine();
     
     StringTokenizer st = new StringTokenizer(s," ");
     
  
  while(st.hasMoreTokens()){
  String temp = st.nextToken();
     n = Integer.parseInt(temp);
     System.out.println(n);
     sum = sum+n;}
     System.out.println("sum is "+sum);
     
  
  
  
}
  }
