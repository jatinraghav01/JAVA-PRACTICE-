import java.io.*;
import java.util.*;

public class Myjavacodes2 {

    public int lastDigitOf(int input1) {
    return Math.abs(input1%10);}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        number = sc.nextInt(); 
        Myjavacodes2 obj=new Myjavacodes2();  
        System.out.println(obj.lastDigitOf(number));
    }
}