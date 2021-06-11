package vn.csharp.hk1.btlt4;

import java.util.Scanner;

public class Baitap10 {
    public static void main(String[] args) {
        // Viết chương trình cho nhập vào số KM,
        // sau đó tính và in ra tiền cước taxi phải trả. Biết rằng:
        //- KM đầu tiên là 5000, mỗi 200m tiếp theo là 1000
        // 7km = 5000 + 6km
        // 6km = 30lan cua 200m = 30 x 1000=30000
        // sotien =30000+5000=35000.
        //- Nếu lớn hơn 30 KM thì mỗi KM thêm vào 3000
        //- Hãy nhập số KM sau đó in ra số tiền phải trả.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter kilomet: ");
        double km = input.nextDouble();
        double solancua200 = (km-1)*1000/200;
        System.out.println(solancua200);
        double sotien = solancua200*1000+5000;
        System.out.println("So tien phai tra: " + (int)sotien);
    }
}
