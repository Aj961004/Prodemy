package DayTen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class KpkFpb {

    public Scanner sc = new Scanner(System.in);

    public int getN() {
        System.out.println("Masukkan Nilai Banyaknya Angka Dalam Deret :");
        int n = sc.nextInt();
        return n;
    }

    public int[] arrDeret() {
        int n = getN();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Masukkan Angka Untuk Deret Ke : " + (i + 1));
            arr[i] = sc.nextInt();
        }
        System.out.println("Deretnya Adalah : " + Arrays.toString(arr));
        System.out.println();
        return arr;
    }

    public int pilihan() {
        System.out.println("Pilih Pilihan Untuk Di Proses : ");
        System.out.println("1. KPK ");
        System.out.println("2. FPB ");
        int m = sc.nextInt();
        return m;
    }

    public void hitunganFpb() {
        int[] arr = arrDeret();
        int n = arr[0];
        int m = arr[1];

        while (n != m) {
            if (n > m) {
                n -= m;
            } else {
                m -= n;
            }
        }
        System.out.println("FPB nya = " + n);
    }

    public void hitunganKpk() {
        int[] arr = arrDeret();
        int n = arr[0];
        int m = arr[1];

        while (n != m) {
            if (n > m) {
                n -= m;
            } else {
                m -= n;
            }
        }
        System.out.println("KPKnya = " + m);

    }

    public int faktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * faktorial(n - 1);
        }
    }

    public void arrayFak() {
        int n = getN();
        int d = 0;
        //int[] arr = arrDeret();
        //int n = Integer.getInteger(Arrays.toString(arr));
        System.out.println("Deret Array Faktorial :");

        for (int i = 0; i < n; i++) {
            faktorial(i);
            System.out.printf("%5d", faktorial(i));
        }
        //System.out.println(d);

    }

    public String bilPrima(int n) {
        //int bil;
        String bilanganPrima = " ";
        for (int i = 1; i <= n; i++) {
            int prima = 0;
            for (int num = i; num >= 1; num--)
            {
                if (i % num == 0)
                {
                    prima = prima + 1;
                }
            }
            if (prima == 2)
            {
                bilanganPrima = bilanganPrima + i + " ";
            }
        }
        System.out.println("Deret Bilangan Prima :" + bilanganPrima);
        return bilanganPrima;
    }

    public void gabungan() {
        int mauPilih = pilihan();
        switch (mauPilih) {
            case 1:
                KpkFpb j = new KpkFpb();
                j.hitunganKpk();
                break;

            case 2:
                KpkFpb k = new KpkFpb();
                k.hitunganFpb();
                break;

            default:
                System.out.println("coba di cek lagi");
        }
    }

    public static void main(String[] args) {
        KpkFpb coba = new KpkFpb();
        coba.bilPrima(7);
    }
}
