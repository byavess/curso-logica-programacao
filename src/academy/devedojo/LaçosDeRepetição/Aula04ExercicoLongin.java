package academy.devedojo.LaçosDeRepetição;

import com.sun.source.tree.WhileLoopTree;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Aula04ExercicoLongin {
    public static void main(String[] args) {
        final String Login = "Luffy";
        final String password = "ReiDosPiratas";
        boolean exibirTelalogin = true;
        Scanner scanner = new Scanner(System.in);
        while (exibirTelalogin) {
            System.out.println("Digite seu Login");
            String LoginDigitado = scanner.nextLine();
            System.out.println("Digite sua senha");
            String passwordDigitado = scanner.nextLine();
            if (Login.equals(LoginDigitado) && password.equals(passwordDigitado)) {
                System.out.println("ACESSO CONCEDIO");
                exibirTelalogin = false;
            } else {
                System.out.println("ACESSO NEGADO ");

            }


        }
    }
}
