import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crie um programa para que receba do usuário o nome,
        //celular e cidade e exiba no console;

        Scanner scn = new Scanner(System.in);
        String nome;
        String celular;
        String cidade;

        System.out.print("informe seu nome\n");
        nome = scn.next();

        System.out.print("informe seu celular\n");
        celular = scn.next();

        System.out.print("informe sua cidade\n");
        scn.nextLine();
        cidade = scn.nextLine();

        System.out.println(nome);
        System.out.println(celular);
        System.out.println(cidade);



    }

}
