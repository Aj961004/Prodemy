package Latihan;

import java.util.Arrays;

public class Cobain {

    public static void main(String[] args) {
        int n = 5;
        int h =0;
        //int[] arr = new int[n];
        for (int i =0; i<n; i++) {
            for (int j=0; j<n; j++){
                if (i==j || i+j == n-1){
                    h = j +1;
                    System.out.print(h);
                } else{
                    System.out.print("+");
                }
            }
        }
        System.out.println(n);
    }
}
