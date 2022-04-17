public class NomeIdadeParticipantes {
    public static void main(String[] args) {

        String nome = " Arthur";
        int idade = 12;
        if (idade <= 10) {
            System.out.println(nome + "Categoria Infantil" + idade);

        } else if (idade >= 10 && idade <= 15) {
            System.out.println(nome + "Categoria Juvenil" + idade);
        } else if (idade >= 16 && idade <= 19) {
            System.out.println(nome + "Categoria Pré Adulto" + idade);
        } else if (idade >= 20) {
            System.out.println(nome + "Categoria Adulto" + idade);
        } else {
            System.out.println(nome + "Categoria indefinida" + idade);

        }
    }
}