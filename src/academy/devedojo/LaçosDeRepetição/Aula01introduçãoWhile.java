package academy.devedojo.LaçosDeRepetição;

import java.util.Scanner;

public class Aula01introduçãoWhile {
    public static void main(String[] args) {
        int contador = 0 ;
        while (contador <=10){
            System.out.println("contador!!"+contador);
            contador = contador + 1;
        }
    }

    public static class Aula05DoWhile {
        public static void main(String[] args) {
            int DesejaContinuar = 1;
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("PLAYER 1: Digite um numero de 1 a 10");
                int num1 = scanner.nextInt();
                System.out.println("PLAYER 2: Digite um numero de 1 a 10");
                int num2 = scanner.nextInt();
                System.out.println("Acertou" + (num1 == num2));
                System.out.println("_____________________________");
                System.out.println("Deseja Continuar Jogando?");
                System.out.println("1 Sim");
                System.out.println("2 Não");
                DesejaContinuar = scanner.nextInt();
            }while (DesejaContinuar == 1);
            }
        }
}
