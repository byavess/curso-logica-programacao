package MaratonaJava.introducaoMaratonaJava.ControleDeFluxo;

public class ControleDeFluxo2 {
    public static void main(String[] args) {
        int idade = 19;
        String status;
        status = idade < 18 ? "não adulto" : " Adulto";// variavel string = if ? "verdadeiro" : "falso";

        System.out.println(status);
    }
}
