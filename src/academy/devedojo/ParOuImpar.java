package academy.devedojo;

public class ParOuImpar {
    public static void main(String[] args) {
      // divisão / ; multiplicação * ; subtração -, soma + ; resto %
        int numero = 12121211;
        if ( (numero % 2)  == 0){
            System.out.println("PAR" +(numero % 2) );
        }else  {
            System.out.println("IMPAR" +(numero % 2));

        }
    }
}