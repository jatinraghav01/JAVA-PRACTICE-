import java.io.*;
import java.util.*;

public class Myjavacodes12{
    public int NthPrime(int input1) {
    int count = 0;
    int num = 1;

    while (count < input1) {
        num++;
        boolean isPrime = true;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            count++;
        }
    }
    return num;
}

}


