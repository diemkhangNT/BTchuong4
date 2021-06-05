package vn.csharp.hk1.btlt4;

import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args) {
        // Nhập vào số nguyên n. Nếu n>5 thì tăng n lên 2 đơn vị và in ra giá trị n,
        // ngược lại in ra giá trị 0.
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = inp.nextInt();
        if(n%2==0){
            n=n*2;
            System.out.println(n);
        }else System.out.println(0);
    }
}
