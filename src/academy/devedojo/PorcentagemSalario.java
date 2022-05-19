package academy.devedojo;

public class PorcentagemSalario {
    public static void main(String[] args) {
        float salario = 4200.50f;
        float resultado = 0F;
        String porcentagem = "";
        if (salario < 4500) {

            resultado = salario * 0.3F;
            porcentagem = "30%";

        } else {
            resultado = salario * 0.1F;
            porcentagem = "10%";
        }
            System.out.println(" O valor final em porcentagem de " + porcentagem + "e de" + resultado);
        }

    }
// if (variavel e comando a ser impressso){ if sempre paranteses e chaves

//