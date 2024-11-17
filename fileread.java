import java.io.*;
import java.io.IOException;
import java.io.FileReader;

public class fileread{
   public static void main(String[]args){

   
   try{  
     
        FileReader fr = new FileReader("binaya.txt");
     
      int charecter;
     while((charecter = fr.read())!=-1){
     System.out.print((char)charecter);}
     fr.close();
     
   }catch(FileNotFoundException fe){
      System.out.println("file not found");
   }catch(IOException e){
    System.out.println("exception"+e); 
     }
    
   }
}
     
     
    
     
     
