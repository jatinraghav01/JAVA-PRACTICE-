import java.io.*;
import java.util.*;

public class Myjavacodes17{
    public int digitSum(int input1) {
    int sign = input1 < 0 ? -1 : 1;
    input1 = Math.abs(input1);

    while (input1 >= 10) {
        int sum = 0;
        while (input1 > 0) {
            sum += input1 % 10;
            input1 /= 10;
        }
        input1 = sum;
    }

    return sign * input1;
}
}