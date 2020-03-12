/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt10d1;

import java.util.Scanner;

/**
 *
 * @author HP Pavilion
 */
public class BT10D1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = sc.nextInt();
        if (a < 10 || a > 99) {
            System.out.println("Khong hop le");
        } else {
            int donvi = a % 10;
            int chuc = a / 10;
            if (chuc == 2) {
                System.out.print("hai ");
            }
            if (chuc == 3) {
                System.out.print("ba ");
            }
            if (chuc == 4) {
                System.out.print("bon ");
            }
            if (chuc == 5) {
                System.out.print("nam ");
            }
            if (chuc == 6) {
                System.out.print("sau ");
            }
            if (chuc == 7) {
                System.out.print("bay ");
            }
            if (chuc == 8) {
                System.out.print("tam ");
            }
            if (chuc == 9) {
                System.out.print("chin ");
            }
            System.out.print("muoi ");
            if (donvi == 1) {
                System.out.println("mot");
            }
            if (donvi == 2) {
                System.out.println("hai");
            }
            if (donvi == 3) {
                System.out.println("ba");
            }
            if (donvi == 4) {
                System.out.println("bon");
            }
            if (donvi == 5) {
                System.out.println("lam");
            }
            if (donvi == 6) {
                System.out.println("sau");
            }
            if (donvi == 7) {
                System.out.println("bay");
            }
            if (donvi == 8) {
                System.out.println("tam");
            }
            if (donvi == 9) {
                System.out.println("chin");
            }
        }
    }

}
 