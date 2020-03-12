/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt9d1;

import java.util.Scanner;

/**
 *
 * @author HP Pavilion
 */
public class BT9D1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        a = sc.nextInt();
        System.out.println("Nhap b: ");
        b = sc.nextInt();
        if (a == 0) {
            System.out.println("UCLN la " + b);
        }
        if (b == 0) {
            System.out.println("UCLN la " + a);
        }
        if (a == b) {
            System.out.println("UCLN la " + a);
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            }
            if (b > a) {
                b = b - a;
            }
        }
        System.out.println("UCLN la " + a);
    }
}
