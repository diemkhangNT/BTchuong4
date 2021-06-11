package vn.csharp.hk1.btlt4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Baitap8 {
    public static void main(String[] args) {
        // Nhập vào giờ, phút, giây
        // Kiểm tra xem giờ, phút, giây đó có hợp lệ hay không?
        // In kết quả ra màn hình
        Scanner input = new Scanner(System.in);
        System.out.print("Enter hour: ");
        int hour = input.nextInt();
        System.out.print("Enter minute: ");
        int minute = input.nextInt();
        System.out.print("Enter second: ");
        int second = input.nextInt();

        if(hour>=0 && hour<25 && minute>=0 && minute<61 && second >=0 && second<61){
            System.out.println("Valid!");
            System.out.println(hour + "h:" + minute +"m:"+second +"s");
        }else System.out.println("Invalid!");
    }
}
