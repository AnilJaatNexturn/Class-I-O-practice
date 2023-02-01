package Clpractice;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FileRead {
    public static void main(String[]args) {
        try {
            FileReader fr = new FileReader("src/Clpractice/sample.txt");
            System.out.println("rading");
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
            fr.close();
        }catch (FileNotFoundException fe){
            System.out.println(fe.getMessage());
        }catch (Exception ee){
            System.out.println(ee.getMessage());
        }
    }
}
