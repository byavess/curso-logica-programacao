package academy.devedojo.LaçosDeRepetição;

import java.util.Scanner;

public class aula02exerciciosImpares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);// comando pra da acesso ao teclado
        System.out.println("Digite o valor desejado");// mensagem pro usuario
        int valorFinal = teclado.nextInt();//finalizar o telcado.next.....vairavel()
        int i = 0;
        while (i <= valorFinal){
            if(i % 2 != 0 ){
                System.out.println("i = "+ i);
            }
        i = i+1;
        }
    }
}
