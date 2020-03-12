/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt8d1;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author HP Pavilion
 */
public class BT8D1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, i, s = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = sc.nextInt();
        if (a < 100000000 && a >= 0) {
            for (; a != 0;) {
                i = a % 10;
                s = s + i;
                a = a / 10;
            }
            System.out.println("Tong cac chu so cua a la: " + s);
        }
        if (a > -100000000 && a < 0) {
            for (; a != 0;) {
                i = -a % 10;
                s = s + i;
                a = a / 10;
            }
            System.out.println("Tong cac chu so cua a la: " + s);
        }
    }
}
