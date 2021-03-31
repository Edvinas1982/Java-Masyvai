package Masyvai;

import java.util.Arrays;

public class Test {
    public static void main(String args[]) {
        int t[] = {3, 5, 2, -4};
        masyvas(t);
        System.out.println("Naujas masyvas" + Arrays.toString(t));
    }
    public static void masyvas(int[] t) {
        System.out.println("Pradinis masyvas" + Arrays.toString(t));
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < i; j++) {
                if (t[i] > t[j]) {
                    int temp = t[i];
                    t[i] = t[j];
                    t[j] = temp;
                }
            }
        }
    }
}
