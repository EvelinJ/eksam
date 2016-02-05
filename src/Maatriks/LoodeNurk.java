package Maatriks;

import java.util.Arrays;

/**
 * Loo 9*9 suurune maatriks, millele tekib loode suunaline nurkade muster, nagu näites.
 * Tundub raske? Sul tuleb lihtsalt veeru ja rea indeksi seos leida.
 *
 * Näide
 * 1 1 1 1 1 1 1 1 1
 * 1 2 2 2 2 2 2 2 2
 * 1 2 3 3 3 3 3 3 3
 * 1 2 3 4 4 4 4 4 4
 * 1 2 3 4 5 5 5 5 5
 * 1 2 3 4 5 6 6 6 6
 * 1 2 3 4 5 6 7 7 7
 * 1 2 3 4 5 6 7 8 8
 * 1 2 3 4 5 6 7 8 9
 *
 * Tundub raske? Leia seoseid rea ja veeru indeksi numbritega.
 */
public class LoodeNurk {

    public static void main(String[] args) {
        int [][] maatriks = new int[9][9];

        int n = 0;
        int vastus =1;

        for (int i = 0; i <maatriks.length; i++) {
            for (int j = 0; j <maatriks[i].length; j++) {

                if (i+j==i || i+j==j) {
                    maatriks[i][j] = 1;
                } else if (i+j==i+1 || i+j==j+1) {
                    maatriks[i][j] = 2;
                } else if (i+j==i+2 || i+j==j+2) {
                    maatriks[i][j] = 3;
                } else if (i+j==i+3 || i+j==j+3) {
                    maatriks[i][j] = 4;
                } else if (i+j==i+4 || i+j==j+4) {
                    maatriks[i][j] = 5;
                } else if (i+j==i+5 || i+j==j+5) {
                    maatriks[i][j] = 6;
                } else if (i+j==i+6 || i+j==j+6) {
                    maatriks[i][j] = 7;
                }else if (i+j==i+7 || i+j==j+7) {
                    maatriks[i][j] = 8;
                }else if (i+j==i+8 || i+j==j+8) {
                    maatriks[i][j] = 9;
                }

            }

            System.out.println(Arrays.toString(maatriks[i]));
        }

    }

    // Lihtsalt abiline meetod, et maatriksit välja printida
    private static void printMaatriks(int[][] laud) {
        for (int i = 0; i < laud.length; i++) {


            System.out.println(Arrays.toString(laud[i]));
        }
        System.out.println("");
    }

}
