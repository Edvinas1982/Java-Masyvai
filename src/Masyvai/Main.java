package Masyvai;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] masyvas = {5, 9, 2, -4, 18};
        int tuscias = 0;
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

