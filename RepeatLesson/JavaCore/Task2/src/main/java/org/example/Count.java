package org.example;

public class Count {
    public static int getArr(int[] arr) {
        int count = 0;
        for(int i = 0; i < arr.length; i++)
            if(arr[i] % 2 == 0)
                count++;
        return count;
    }
}
