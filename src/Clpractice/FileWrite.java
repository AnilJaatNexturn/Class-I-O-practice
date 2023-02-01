package Clpractice;
import java.io.FileWriter;
public class FileWrite {
  public static void main(String[]args){


          try{
              FileWriter fw=new FileWriter("F:\\testout3.txt");
              fw.write("Welcome to javaTpoint.");
              fw.close();
          }catch(Exception e){
              System.out.println(e);
          }
          System.out.println("Success...");



  }

}
