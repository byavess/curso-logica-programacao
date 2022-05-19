package academy.devedojo;

import java.util.Scanner;

public class ProcessoDeCadastramento {
    public static void main(String[] args) {
                   char sexo = 'F';
        int idade = 16;
        if ((sexo == 'M' || sexo == 'F')  && idade < 18) {
            System.out.println("Alistamento Não permitido");
        }else if(sexo == ('M') && idade >= 18) {
                System.out.println("Alistamento obrigatorio");

        }else if(sexo == ('F') && idade >= 18) {
            System.out.println("Deseja se alistar");

        }

    }
}