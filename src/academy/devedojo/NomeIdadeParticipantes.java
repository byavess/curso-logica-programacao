package academy.devedojo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NomeIdadeParticipantes {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Digite Seu Nome : ");
        String nome = input.next();
        System.out.println("Digite Sua Idade : ");
        int idade = input.nextInt();
        if (idade <= 10) {
            System.out.println("Nome:"+nome +":##idade:"+ idade +"anos "+"Categoria Infantil" );

        } else if (idade >= 11 && idade <= 15) {
            System.out.println("Nome:"+nome +":##idade:"+ idade +"anos "+"Categoria Juvenil" );
        } else if (idade >= 16 && idade <= 19) {
            System.out.println("Nome:"+nome + ":##idade:"+idade + "anos "+"Categoria Pré Adulto" );
        } else if (idade >= 20) {
            System.out.println("Nome:"+nome + ":##idade:"+idade +"anos "+"Categoria Adulto" );
        } else {
            System.out.println("Nome:"+nome + idade +": anos "+"Categoria indefinida" + idade);

        }
    }
}