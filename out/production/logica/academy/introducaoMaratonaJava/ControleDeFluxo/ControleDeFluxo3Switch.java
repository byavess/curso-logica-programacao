package MaratonaJava.introducaoMaratonaJava.ControleDeFluxo;

public class ControleDeFluxo3Switch {
    public static void main(String[] args) {
        byte dia = 1;
        switch (dia) {
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sabado");
            default:
                    System.out.println("dia invalido");


                }
                String sexo = "M";
                switch (sexo) {
                    case "F":
                        System.out.println("Sexo :Femenino");
                        break;
                    case "M":
                        System.out.println("Sexo Masculino");
                    default:
                        System.out.println("sexo invalido");


                }
        }
    }


