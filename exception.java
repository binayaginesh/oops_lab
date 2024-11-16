import java.io.*;

public class exception{
  public static void main(String[]args){
    
   
       try{
       int result = arithmetic(10,0);
         System.out.println("the result is "+result);
       }
       catch(ArithmeticException e){
         System.out.println("error occured"+e);
       }
       finally{
         System.out.println("Programm executed without arithmetic error");
       }
       
       try{
        int []arr = {1,2,3};
        System.out.println("print the array of index 5"+arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException a){
           System.out.println("error occured"+a);
        }
        finally{
          System.out.println("Programm executed without array error");
        }
    
    
  }
  
  public static int arithmetic(int a,int b) throws  ArithmeticException{
     if(b==0){
        throw new ArithmeticException("cannot divide by zero");
     }
     return a/b;
  }
  
  
  public static int array(int [] arr, int index) throws ArrayIndexOutOfBoundsException{
    if(index>arr.length){
       throw new ArrayIndexOutOfBoundsException("Index is out of bound"); 
    }
    return arr[index];
  }
  
  
  
}
