package MaratonaJava.introducaoMaratonaJava.ControleDeFluxo;

public class ControleDeFluxo4 {
    public static void main(String[] args) {
        int contador=11;
        while ( contador <10){
            System.out.println( ++contador);
        }
        do {
            System.out.println( "dentro do DO while");
        }while (contador<10);
        for (int i=0;i<10;i++){
            System.out.println("valor de i e: " +i);
        }
    }
}
