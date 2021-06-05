package vn.csharp.hk1.btlt4;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class Baitap6 {
    public static void main(String[] args) {
        // Nhập điểm 3 môn toán, lý, hoá. Tính điểm trung bình 3 môn. Dựa vào điểm trung bình
        // (ĐTB) vừa tính được in ra xếp loại, biết rằng:
        // ĐTB>=9: Xuất sắc  8<=ĐTB<9: Giỏi   6<=ĐTB<8: Khá
        // 5<=ĐTB<6: Trung bình   ĐTB<5: Yếu
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the Math point: ");
        double math = inp.nextDouble();
        System.out.print("Enter the Physic point: ");
        double physic = inp.nextDouble();
        System.out.print("Enter the Chemistry point: ");
        double chemistry = inp.nextDouble();
        double avg = (math+physic+chemistry)/3;
        System.out.println("Avg =  "+(double)Math.round(avg*10)/10);
        if(avg>=9){
            System.out.println("Xuat sac");
        }
        else if(8<=avg && avg<9){
            System.out.println("Gioi");
        }
        else if(6<=avg && avg<8){
            System.out.println("Kha");
        }
        else if(5<=avg && avg<6){
            System.out.println("Trung binh");
        }
        else System.out.println("Yeu");
    }
}
