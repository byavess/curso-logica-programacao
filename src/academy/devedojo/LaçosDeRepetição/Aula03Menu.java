package academy.devedojo.LaçosDeRepetição;

import java.util.Scanner;

public class Aula03Menu {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero ");
        int numero = teclado.nextInt();
        {
            switch (numero) {
                case 1:
                    System.out.println("Calcular Salário");
                    break;
                case 2:
                    System.out.println("Depositar Salário");
                    break;
            }
            while (numero == 1 && numero == 2) {

                if (numero == 3) {
                    System.out.println("sair");
                }
            }

        }
    }
    }










