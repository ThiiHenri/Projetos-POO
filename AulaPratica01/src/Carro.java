import java.util.Scanner;

public class Carro {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        String placa;
        int ano;

        System.out.println("Digite a placa");
        placa = ler.next();
        System.out.println("Digite o ano");
        ano = ler.nextInt();

        if (ano<=2010)
            System.out.println("Carro velho");

        else if (ano<=2022)
            System.out.println("Carro SemiNovo");

        else if (ano==2023)
            System.out.println("Carro Novo");

        else
            System.out.println("Invalido");

    }

}
