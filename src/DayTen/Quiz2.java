package DayTen;

import java.util.Scanner;

public class Quiz2 {
    public int getN() {
        System.out.println("Masukan Nilai N = ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        return n;
    }

    public String[] polaBilangan(int n) {
        int[] arrPola = new int[n];
        arrPola[0] = 1;
        arrPola[1] = 1;
        for (int i = 2; i < n; i++) {
            arrPola[i] = arrPola[i - 1] + arrPola[i - 2];
        }

        char[] huruf = new char[n];
        char a = 'A';
        for (int j=0; j<n; j++){
            huruf[j]=a++;
        }


        String [] gabung = new String[n];
        for (int k=0; k<n; k++){
            if (k%2==0){
                gabung [k]=String.valueOf(arrPola[k/2]);
            } else {
                //gabung [k]=String.valueOf(" ");
                gabung [k]=String.valueOf(huruf[k/2]);
            }
        }
        return gabung;
    }

//    public String[] getPolaBilangan(int n) {
//        int[] arrPola = polaBilangan(n);
//        String[] arr = new String[n];
//
//        for (int i = 0; i < n; i++) {
//            arr[i] = String.valueOf(arrPola[i]);
//        }
//        return arr;
//    }

    public String[][] buatKerangka() {
        int n = getN();
        String[][] arr = new String[n][n];
        isiKerangka(arr);
        return arr;
    }

    public void isiKerangka(String[][] arr) {
        String[] arrPola = polaBilangan(arr.length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i <= j && i <= arr.length / 2 && i + j <= arr.length - 1) {
                    arr[i][j] = arrPola[i];
                } else if (i < j && j > arr.length / 2 && i + j > arr.length - 1) {
                    arr[i][j] = arrPola[arr.length - 1 - j];
                } else if (i >= j && i > arr.length / 2 && i + j >= arr.length - 1) {
                    arr[i][j] = arrPola[arr.length - 1 - i];
                } else if (i > j && j < arr.length / 2 && i + j < arr.length - 1) {
                    arr[i][j] = arrPola[j];
                } else {
                    arr[i][j] = "0";
                }
            }
        }
    }

    public void cetakKerangka() {
        String[][] arr = buatKerangka();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%3s", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Quiz2 coba = new Quiz2();
        coba.cetakKerangka();
    }

}
