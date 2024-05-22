package org.example;

public class Zero {
    public static boolean zero(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == 0 & arr[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }
}
