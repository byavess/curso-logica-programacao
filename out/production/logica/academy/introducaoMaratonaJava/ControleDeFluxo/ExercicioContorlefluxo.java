package MaratonaJava.introducaoMaratonaJava.ControleDeFluxo;

/* crie uma variavel salario e imprima seu imposto
imposto:
salario < 1000 5%
salario >=1000 && salario <2000 10 %
salario >= 200 && salario <4000 15%
salario > 5000 20 %
 */
public class ExercicioContorlefluxo {
    public static void main(String[] args) {
        double salario = 900;
        double imposto = 0;
        if (salario < 1000) {
            System.out.println("imposto de 5% "+ salario * 0.05);
        } else if (salario >= 1000 && salario < 2000) {
            System.out.println(" imposto 10%  "+ salario * 0.1);

        } else if (salario >= 2000 && salario < 4000) {
            System.out.println(" imposto 15%  "+ salario * 0.15);
        } else {
            System.out.println("salario maior que 4mil imposto 20%  "+ salario * 0.20);
        }
    }
}