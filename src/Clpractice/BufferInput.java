package Clpractice;
import java.io.*;
public class BufferInput {

    public static void main(String args[]){
        try{
            FileInputStream fib=new FileInputStream("F:\\testout1.txt");
            BufferedInputStream bi=new BufferedInputStream(fib);
            int i;
            while((i=bi.read())!=-1){
                System.out.print((char)i);
            }
            bi.close();
            fib.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
