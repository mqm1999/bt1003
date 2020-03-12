/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt6d1;

import java.util.Scanner;

/**
 *
 * @author HP Pavilion
 */
public class BT6D1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, x = 0, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Khong phai so hoan hao");
        } else {
            for (i = 1; i < n; i++) {
                if (n % i == 0) {
                    x = x + i;
                }
            }
            if (x == n) {
                System.out.println("So hoan hao");
            } else {
                System.out.println("Khong phai so hoan hao");
            }
        }
    }
}
