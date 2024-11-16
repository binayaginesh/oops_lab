import java.io.*;
import java.util.*;

public class armstrong{
  public static void main(String[]args){
    int n,sum=0,cube,i;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a 3 digit number");
    n = sc.nextInt();
    int newn=n;
    for(i=0;i<n;i++){
       int rem = n%10;
       cube = rem*rem*rem;
       sum=sum+cube;
       n=n/10;  
    }
    if(newn==sum){
       System.out.println("it is a armstrong number");
    }
    else{
       System.out.println("it is not armstrong");
    }
  }
}
