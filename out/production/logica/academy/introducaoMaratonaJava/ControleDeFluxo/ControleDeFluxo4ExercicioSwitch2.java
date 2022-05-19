package MaratonaJava.introducaoMaratonaJava.ControleDeFluxo;
/*cire um switich que dado um valor de 1 a 7
considerando 1 domingo, imprima se e dia ultil ou final de semana

 */
public class ControleDeFluxo4ExercicioSwitch2 {
    public static void main(String[] args) {

        byte dia = 7;
        switch (dia) {
            case 1:
                System.out.println("domingo ");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");// poderia colocar case 1 e case 7 sout final de semana ** sempre depois do sout break
                break;                       // case2 case3 case4 case5 case6 dia ultil finalizando default ** sempre depois do sout break
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
                System.out.println("sabado: ");
                break;
            default:
                System.out.println("dia invalido");
        }if (dia== 7 && dia== 1) {
                    System.out.println("feriado");
                }else{

                    System.out.println("dia ultil!");
                }

        }


        }




