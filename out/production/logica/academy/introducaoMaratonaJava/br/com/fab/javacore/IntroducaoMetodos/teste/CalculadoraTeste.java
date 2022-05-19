package MaratonaJava.introducaoMaratonaJava.br.com.fab.javacore.IntroducaoMetodos.teste;

import MaratonaJava.introducaoMaratonaJava.br.com.fab.javacore.IntroducaoMetodos.classe.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subtraiDoisnumeros();
        calc.multiplicaDoisNumeros(5, 5);
        System.out.println("divisão de dois numeros");
// outra maneira // System.out.println(calc.divideDoisNumeros(20,2) );
        double result = calc.divideDoisNumeros(20, 0);
        System.out.println(result);
        System.out.println("imprima dois numeros divididos");
        calc.imprimeDoisNumerosDivididos(20,5);
        System.out.println("Continuando a exec");
    }
}
