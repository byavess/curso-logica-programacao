package academy.devedojo.SwitchCase;

public class TipoDeConta {
    public static void main(String[] args) {
        String conta = "conta investimento";
        switch (conta) {
            case "conta poupança":
                System.out.println("0.05%");
                break;
            case "conta corrente":
                System.out.println("0.02%");
                break;
            case "conta investimento":
                System.out.println("0.1%");
                break;
            default:
                System.out.println("invalido");

        }
    }
}
// double conta_poupança = 0.05;
//        double conta_corrente = 0.02;
//        double conta_investimento = 0.1;