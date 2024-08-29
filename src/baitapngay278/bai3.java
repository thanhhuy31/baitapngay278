package baitapngay278;

public class bai3 {

    public static void main(String[] args) {
        int[] phantu = {1, 9, 7, 12, 5};
        int sum = 0;
        for (int i = 0; i < phantu.length; i++) {
            sum += phantu[i];
        }
        double average = (double) sum / phantu.length;
        System.out.println("Tong cac phan tu trong mang: " + sum);
        System.out.println("Trung binh cong cac phan tu trong mang: " + average);
    }

}
