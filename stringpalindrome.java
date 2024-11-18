import java.io.*;
import java.util.*;

class stringpalindrome{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter word: ");
        String ch,rev="";
        ch=sc.nextLine();
        int i=ch.length();
        
        for(int k=i-1;k>=0;k--){
            
            rev= rev+ ch.charAt(k);
        }
            
            if(ch.equals(rev)){
                System.out.println("its a palindrome");
            }else{
                System.out.println("not palindrome");
            }
        }
    }
