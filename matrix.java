import java.io.*;
import java.util.*;

public class matrix{
  public static void main(String[]args){
    int r1,c1,r2,c2;
    Scanner sc = new  Scanner(System.in);
    
    System.out.println("enter the no,of rows of first matrix");
    r1 = sc.nextInt();
    
    System.out.println("enter the no,of colms of first matrix");
    c1 = sc.nextInt();
    
    System.out.println("enter the no,of rows of 2nd matrix");
    r2 = sc.nextInt();
    
    System.out.println("enter the no,of colms of 2nd matrix");
    c2 = sc.nextInt();
    
    if(c1!=r2){
      System.out.println("multiply not possible");
    }
    
  
  
  int [][] matrix1= new int[r1][c1];
  int [][] matrix2= new int[r2][c2];
  int [][] matrix3= new int[r1][c2];
  
  System.out.println("Enter the rows and colums of 1st matrix");
  for(int i=0;i<r1;i++){
    for(int j=0;j<c1;j++){
       matrix1[i][j]= sc.nextInt();
    }
  }
  
  System.out.println("Enter the rows and columns of 2nd matrix");
  for(int i=0;i<r2;i++){
    for(int j=0;j<c2;j++){
      matrix2[i][j]= sc.nextInt();
    }
  }
  
  for(int i=0;i<r1;i++){
    for(int j=0;j<c2;j++){
      matrix3[i][j]=0;
      for(int k=0;k<c1;k++){
        matrix3[i][j] = matrix3[i][j] + (matrix1[i][k] * matrix2[k][j]);
      }
    }
  }
  System.out.println("the product matrix is");
  for(int i=0;i<r1;i++){
    for(int j=0;j<c2;j++){
       System.out.println(matrix3[i][j] +"\t");
    }
    System.out.println();
  }
 
  
  
  }
}
