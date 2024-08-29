package baitapngay278;

import java.util.Scanner;

public class bai2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap phan tu trong mang: ");
        int n = scanner.nextInt();
        int[] pt = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            pt[i] = scanner.nextInt();
        }
        int max = pt[0];
        int min = pt[0];
        for (int i = 1; i < n; i++) {
            if (pt[i] > max) {
                max = pt[i];
            }
            if (pt[i] < min) {
                min = pt[i];
            }
        }
        System.out.println("gia tri lon nhat: " + max);
        System.out.println("gia tri nho nhat: " + min);

    }
}
