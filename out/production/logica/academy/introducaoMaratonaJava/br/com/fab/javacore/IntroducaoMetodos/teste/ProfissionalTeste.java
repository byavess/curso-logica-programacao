package MaratonaJava.introducaoMaratonaJava.br.com.fab.javacore.IntroducaoMetodos.teste;

import MaratonaJava.introducaoMaratonaJava.br.com.fab.javacore.IntroducaoMetodos.classe.Profissional;

import java.util.Scanner;

public class ProfissionalTeste {
    public static void main(String[] args) {
        Profissional  prof = new Profissional();
        prof.Professor();
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite seu nome");
        String nome = teclado.next();
        prof.Idade();
        System.out.println("digite sua idade");
        String Idade = teclado.next();
        Profissional prof2 = new Profissional();
        prof.Professor2();
        System.out.println(" nome do profissional :");
        String nome2 = teclado.next();
        prof.Idade2();
        System.out.println(" idade do profissional");
        String Idade2 = teclado.next();


    }
}
