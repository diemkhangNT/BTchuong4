package vn.csharp.hk1.btlt4;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class Baitap5 {
    public static void main(String[] args) {
        // Nhập vào số nguyên n gồm 3 chữ số. Xuất ra màn hinh chữ số lớn nhất.
        // Ví dụ: n=291.
        //Chữ số lớn nhất là 9
        Scanner inp = new Scanner(System.in);
        int n;
        System.out.print("Enter n from 100 to 999: ");
        n = inp.nextInt();
        while(true){
            if(n>999 || n<100){
                System.out.print("Enter n from 100 to 999: ");
                n = inp.nextInt();
            }
            else break;
        }
        int num1 = n/100;
        int mid1 = n%100;
        int num2 = mid1 / 10;
        int num3 = mid1 % 10;
        int max = num1;
        if(max < num2){
            if(num2>num3){
                max = num2;
            }else if(num2<num3){
                max = num3;
            }
        }
        System.out.println(max);
    }
}
