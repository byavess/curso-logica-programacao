package MaratonaJava.introducaoMaratonaJava.br.com.fab.javacore.IntroducaoMetodos.classe;




public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(5 + 5);
    }

    public void subtraiDoisnumeros() {
        System.out.println(5 - 5);
    }

    public void multiplicaDoisNumeros(int num1, int num2) { //casting quando munda a variavel dentro do parentese (int num1(flat num2)); sempre melhor com a mesma variavel
        //          Metodo                  Parametro/ [argumento depois de finalizado]
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;

        }
        return 0;

    }

    public void imprimeDoisNumerosDivididos(double num1, double num2) {
        if (num2 != 0) {
            System.out.println(num1 / num2);
            return;
        }
            System.out.println("Naão e possivel dividir por 0");
        }
        public void alteraDoisNumeros (int num1 , int num2){
        num1 = 30 ;
        num2 = 40;
            System.out.println("Dentro do altera dois numeros");
            System.out.println("num1: " +num1);
            System.out.println("num2: " + num2);
        }
    }

