package vn.csharp.hk1.btlt4;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

import java.util.Scanner;

public class Baitap9 {
    public static void main(String[] args) {
        // Nhập vào ngày, tháng, năm.
        // Kiểm tra ngày, tháng, năm đó có hợp lệ hay không?
        // In kết quả ra màn hình.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter day: ");
        int day = input.nextInt();
        System.out.print("Enter month: ");
        int month = input.nextInt();
        System.out.print("Enter year: ");
        int year = input.nextInt();

        if(day>0 && month>0 && year>0 && day<32 && month<13){
            if((year % 4==0 && year %100!=0) && month==2 && day<30){
                System.out.println("Valid!(Nam nhuan)");
                System.out.println(day+"/"+month+"/"+year);
            }else if(month==2 && day>28){
                System.out.println("Invalid!");
            }else {
                System.out.println("Valid!");
                System.out.println(day+"/"+month+"/"+year);
            }
        }else System.out.println("Invalid!");
    }
}
