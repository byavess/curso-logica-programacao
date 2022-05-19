package academy.devedojo.Arrays;

import java.util.Scanner;

public class Auloa03ExecicioArrays {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int[] array3 = new int[3];
        Scanner sacanner = new Scanner(System.in);
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Vetor 1 ,  Posição " + i + " : ");
            array1[i] = sacanner.nextInt();
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Vetor 1 ,  Posição " + i + " : ");
            array2[i] = sacanner.nextInt();
        }
        for (int i = 0; i < array3.length; i++) {
            array3[i] = array1[i] * array2[i];
            System.out.print(array3[i] + " ");
        }


    }
}