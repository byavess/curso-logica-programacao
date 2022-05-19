package MaratonaJava.introducaoMaratonaJava.br.com.fab.javacore.IntroducaoMetodos.teste;

import MaratonaJava.introducaoMaratonaJava.br.com.fab.javacore.IntroducaoMetodos.classe.Calculadora;

public class ParamentrosTeste {
    public static void main(String[] args) {
        Calculadora Calc = new Calculadora();
        int num1 = 5;
        int num2 = 10;
        Calc.alteraDoisNumeros(num1 , num2);
        System.out.println("dentro do teste");
        System.out.println("num1: " +num1);
        System.out.println("num2: " + num2);
    }
}
