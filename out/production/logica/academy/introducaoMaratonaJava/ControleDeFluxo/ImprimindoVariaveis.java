package MaratonaJava.introducaoMaratonaJava.ControleDeFluxo;

public class ImprimindoVariaveis {
    public static void main(String[] args) {
        int idade = 36;
        double salarioDouble= 6000;
        float salrioFloat = 3000;
        byte IdadeByte= 12;
        short   idadeShort = 32767;
        boolean verdadeiro= true;
        long NumeorGrande = 1000l;
        char caractere = 'A'; // 2 byte
        String Nome = "Fabrício";
        System.out.println( Nome + ""+ "de idade " + idade + " com salario de "+ (salarioDouble+salrioFloat ) + verdadeiro);
    }
}
