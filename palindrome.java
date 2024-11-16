import java.io.*;
import java.util.*;

public class palindrome{
  public static void main(String[]args){
    int n,rev=0,i;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a 3 digit number");
    n = sc.nextInt();
    int newn=n;
    for(i=0;i<3;i++){
       int rem = n%10;
       rev=(rev*10)+rem;
       n=n/10;  
    }
    if(newn==rev){
       System.out.println("it is a palindrome number");
    }
    else{
       System.out.println("it is not palindrome");
    }
  }
}
