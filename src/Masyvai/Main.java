package Masyvai;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Įveskite penkis skaičius: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int[] masyvas = {a, b, c, d, e};
        int tuscias;
        for (int i = 0; i<masyvas.length; i++) {
            if (masyvas[1] > masyvas[0]) {
                tuscias = masyvas[0];
                masyvas[0] = masyvas[1];
                masyvas[1] = tuscias;
            }
            if (masyvas[2] > masyvas[1]) {
                tuscias = masyvas[1];
                masyvas[1] = masyvas[2];
                masyvas[2] = tuscias;
            }
            if (masyvas[3] > masyvas[2]) {
                tuscias = masyvas[2];
                masyvas[2] = masyvas[3];
                masyvas[3] = tuscias;
            }
            if (masyvas[4] > masyvas[3]) {
                tuscias = masyvas[3];
                masyvas[3] = masyvas[4];
                masyvas[4] = tuscias;
            }
        }
        int[] naujasMasyvas = {masyvas[0], masyvas[1], masyvas[2], masyvas[3], masyvas[4]};
        System.out.println(Arrays.toString(naujasMasyvas));

    }

}
