package academy.devedojo.Arrays;

public class Aula01IntroduçãoArrays {
    public static void main(String[] args) {
        double nota1 = 7;
        double nota2 = 4;
        double nota3 = 6;
        double nota4 = 2 ;
        double media = (nota1 +nota2+nota3) /3;
        System.out.println(media);
        double [] notas = new double[4];
        System.out.println( "---------------------------");
        notas [0]=7;
        notas [1]=4;
        notas [2]= 6;
        notas [2]=2;
        for (int i = 0; i <4 ; i++) {
            System.out.println(notas[i]);

        }


    }
}
