package Clpractice;

import java.io.*;
public class BufferWriter{
    public static void main(String args[])throws Exception{
        FileOutputStream fout=new FileOutputStream("F:\\testout2.txt");
        BufferedOutputStream bout=new BufferedOutputStream(fout);
        String s="Welcome to javaTpoint.";
        byte b[]=s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("success");
    }
}
