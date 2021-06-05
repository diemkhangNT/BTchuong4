package vn.csharp.hk1.btlt4;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Baitap3 {
    public static void main(String[] args) {
        // Nhập vào 2 số x, y. In ra tổng, hiệu, tích, thương của 2 số trên
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = inp.nextDouble();
        System.out.print("Enter y: ");
        double y = inp.nextDouble();
        System.out.println("Tong:   "+ (x+y));
        System.out.println("Hieu:   "+ (x-y));
        System.out.println("Tich:   "+ (double) Math.round(x*y*1000)/1000);
        System.out.println("Thuong: "+ (double) Math.round(x/y *1000)/1000);
    }
}
