import java.io.*;
import java.util.*;

public class Myjavacodes16{
    public int nonRepeatDigitsCount(int input1) {
    int[] arr = new int[10];
        
        while(input1>0){
            int i;
            i = input1%10;
            arr[i] = arr[i] + 1;
            input1/=10;

        };
        int count = 0;
        for (int i = 0; i<=9 ; i++){
            if (arr[i] == 1){
                count ++;
            }
       }
        return count;

	}

        
	
}



    