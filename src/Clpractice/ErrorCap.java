package Clpractice;

public class ErrorCap {
    public int div(int x,int y)  {
            return x/y;
        };

    public static void main(String[]args){
        ErrorCap ob=new ErrorCap();
        System.out.println("value is "+ob.div(5,1));
    }



}
