package vn.csharp.hk1.btlt4;

import java.util.Scanner;

public class Baitap4 {
    public static void main(String[] args) {
        // Nhập vào 2 số nguyên x, y. In ra màn hình giá trị lớn nhất
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = inp.nextInt();
        System.out.print("Enter y: ");
        int y = inp.nextInt();
        int max = x;
        if(y > max){
            max =y;
        }
        System.out.println(max);
        //System.out.println(Math.max(x,y));
    }
}
