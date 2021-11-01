package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] barcode = new int[12];
        //Step 1
        for (int i = 0; i < 12; i++) {
            System.out.println("Enter a digit:");
            barcode[i] = input.nextInt();
        }
        //Step 2
        int count = 0;
        for (int i = 0; i < 12; i++) {
            if ((i%2) == 1){
                count = barcode[i] + count;
            }
        }
        //Step 3
        count = count*3;
        //Step 4
        int count2 = 0;
        for (int i = 0; i < 12; i++) {
            if ((i%2) == 0){
                count2 = barcode[i] + count2;
            }
        }
        //Step 5
        count = count + count2;
        //Step 6
        int checkDigit = 10 - (count%10);
        //System.out.println(Arrays.toString(barcode));
        System.out.println(checkDigit);
    }
}
