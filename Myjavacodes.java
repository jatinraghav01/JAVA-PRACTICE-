import java.io.*;
import java.util.*;

public class Myjavacodes {

    public int isEven(int input1) {
        if (input1 % 2 == 0)
            return 2;
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        number = sc.nextInt(); 
        Myjavacodes obj=new Myjavacodes();  // yahin value change kar sakte ho
        System.out.println(obj.isEven(number));
    }
}
