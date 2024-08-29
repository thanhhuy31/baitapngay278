package baitapngay278;

import java.util.Random;
import java.util.Scanner;

public class bai1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String check;
        do {
            System.out.println("Tiep tuc chuong trinh ( yes or No ) : ");
            check = scanner.next();
        } while (!check.equals("yes"));

        Random rand = new Random();
        int r = rand.nextInt(100) + 1;

        if (r % 2 == 0) {
            System.out.println(r);
            System.out.println(r + " la so chan");
        } else {
            System.out.println(r);
            System.out.println(r + " la so le");
        }
    }
}
