/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt5d1;

import java.util.Scanner;

/**
 *
 * @author HP Pavilion
 */
public class BT5D1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A, B;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao A: ");
        A = sc.nextInt();
        System.out.println("Nhap vao B: ");
        B = sc.nextInt();
        if (A <= 0 || B <= 0) {
            System.out.println("Nhap lai A va B");
        } else {
            System.out.println("Tong A va B la: " + (A + B));
        }
    }

}
