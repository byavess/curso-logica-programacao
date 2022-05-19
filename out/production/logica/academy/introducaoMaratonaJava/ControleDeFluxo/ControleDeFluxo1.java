package MaratonaJava.introducaoMaratonaJava.ControleDeFluxo;

public class ControleDeFluxo1 {
    public static void main(String[] args) {
        // ida< 15 categoria infantil
        //idade >=15  && idade<18 categoria juvenil
        //idade >= 18 categoria adulto
        int idade = 15;
        String categoria;

        if (idade < 15) {

            categoria = "infantil";


        } else if (idade >= 15 && idade < 18) {

            categoria  = "juvenil";

        } else {
            categoria = "adulto";


        }
        System.out.println(categoria);
    }

}
