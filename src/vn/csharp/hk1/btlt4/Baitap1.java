package vn.csharp.hk1.btlt4;

import java.util.Scanner;

public class Baitap1 {
    public static void main(String[] args) {
        //Chương trình Nhập vào số nguyên n. Nếu n là số chẵn thì gấp đôi giá trị của n . Xuất n ra màn hình
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        if(n%2==0){
            n = n*2;
        }
        System.out.println(n);
    }
}
