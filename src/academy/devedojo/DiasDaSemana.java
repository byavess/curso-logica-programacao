package academy.devedojo;

import java.util.Scanner;

public class DiasDaSemana {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Digite Seu Nome:");
        String nome = input.next();
        if (nome.equals ("") || nome.equalsIgnoreCase("admin") || nome.equalsIgnoreCase( "administardor")){
            System.out.println(nome + "usuario invalido");
        } else {
            System.out.println( "cadastrado com sucesso");
        }
    }

    public static class DiaSdaSemana {
        public static void main(String[] args) {
            int dia = 12;
            if (dia == 1) {
                System.out.println("Segunda-Feira");

            } else if (dia == 2) {
                System.out.println("Terça-Feira");
            } else if (dia == 3) {

                System.out.println("Quarta-Feira");
            } else if (dia == 4) {
                System.out.println("Quinta-Feira");
            } else if (dia == 5) {
                System.out.println("Sexta-Feira");
            } else if (dia == 6) {
                System.out.println("SÁBADO");
            } else if (dia == 7) {
                System.out.println("SÁBADO");
            } else {
                System.out.println("Dia invalido");
            }
        }
    }
}
