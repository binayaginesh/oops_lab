import java.io.*;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class filecopy{
   public static void main(String[]args){
      try{
         FileInputStream fr = new FileInputStream("input.txt");
         FileOutputStream fw = new FileOutputStream("output.txt");
         int c;
         while((c=fr.read())!=-1){
            fw.write(c);
         }
      fr.close();
      fw.close();
      }
      catch(IOException e){
         System.out.println("file not found");
      }
   }
}
