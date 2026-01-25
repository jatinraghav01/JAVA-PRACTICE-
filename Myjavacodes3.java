import java.io.*;
import java.util.*;

public class Myjavacodes3{
    public int secondLastDigitOf(int input1){
        if (input1 > -10 && input1 < 10){
            return -1;}
        input1 = Math.abs(input1);
        return (input1/10)%10;

        
    }
}
