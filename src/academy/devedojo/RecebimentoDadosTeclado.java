package academy.devedojo;

import java.util.Scanner;

public class RecebimentoDadosTeclado {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        System.out.println("digite o seu nome");
        String nome = Teclado.next();
        System.out.println("digite sua idade");
        int idade = Teclado.nextInt();
        System.out.println("o nome digitado foi:" + nome);
        System.out.println("a idade digitada foi:" + idade);
 }
}
