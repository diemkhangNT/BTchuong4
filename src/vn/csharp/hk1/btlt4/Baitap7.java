package vn.csharp.hk1.btlt4;

import java.util.Scanner;

public class Baitap7 {
    public static void main(String[] args) {
        // Viết chương trình nhập vào ngày, tháng, năm.
        // Cho biết năm này có phải là năm nhuận hay không? In kết quả ra màn hình.
        Scanner inp = new Scanner(System.in);
        System.out.print("Date (1-31): ");
        int date = inp.nextInt();
        System.out.print("Month (1-12): ");
        int month = inp.nextInt();
        System.out.print("Year: ");
        int year = inp.nextInt();
            if (year % 4 == 0 && year % 100 != 0) {
                System.out.println(year+" "+ "la nam nhuan!");
            } else {
                System.out.println(year +" "+"la nam khong nhuan!");
            }
    }
}
