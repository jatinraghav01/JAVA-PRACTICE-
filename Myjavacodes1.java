import java.io.*;
import java.util.*;

public class Myjavacodes1 {

    public int isOdd(int input1) {
        if (input1 % 2 != 0)
            return 2;
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        number = sc.nextInt(); 
        Myjavacodes1 obj=new Myjavacodes1();  
        System.out.println(obj.isOdd(number));
    }
}