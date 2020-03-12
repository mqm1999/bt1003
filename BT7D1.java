/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt7d1;

import java.util.Scanner;

/**
 *
 * @author HP Pavilion
 */
public class BT7D1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, i, x = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = sc.nextInt();
        if (n < 0) {
            System.out.println("Khong tinh duoc");
        } else {
            for (i = 1; i <= n; i++) {
                x = x * i;
            }
            System.out.println("n! = " + x);
        }
    }

}
