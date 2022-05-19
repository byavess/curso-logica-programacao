package academy.devedojo;

import java.util.Scanner;

public class Aula04ExecicioArrays {
    public static void main(String[] args) {
        int[] array1 = new int[3];
        int[] array2 = new int[3];
        int[] array3 = new int[3];
        Scanner sacanner = new Scanner(System.in);
        String Resultado = "";
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Vetor 1 ,  Posição " + i + " : ");
            array1[i] = sacanner.nextInt();
            System.out.println("Vetor 2 ,  Posição " + i + " : ");
            array2[i] = sacanner.nextInt();
            array3[i] = array1[i] * array2[i];
            Resultado = Resultado + array3[i];
        }
        System.out.println( Resultado );
    }
}