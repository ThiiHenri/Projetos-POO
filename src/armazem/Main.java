package armazem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int id, estoque;
        String produto;
        double preco;

        System.out.println("ID: ");
        id = ler.nextInt();
        System.out.println("Nome do Produto: ");
        produto = ler.nextLine();
        produto = ler.nextLine();
        System.out.println("Estoque Inicial: ");
        estoque = ler.nextInt();
        System.out.println("Preço: ");
        preco = ler.nextDouble();

        Estoque e1 = new Estoque(id,produto,estoque,preco);  // esta criando um objeto do tipo estoque

        System.out.println("Digite a qtde para acrescentar: ");
        int qtde;
        qtde = ler.nextInt();
        e1.Acrescimo(qtde);

        System.out.println("Digite a qtde para baixar: ");
        qtde = ler.nextInt();
        e1.Baixa(qtde);

        System.out.println(e1.ConsultaEstoque());


        /*Estoque e1 = new Estoque(1,"Arroz",10,25);
        Estoque e2 = new Estoque(2,"Feijão",10,5.65);
        Estoque e3 = new Estoque(3,"Açucar",10,16);

        e1.Acrescimo(100);
        System.out.println(e1.ConsultaEstoque());
        e2.Baixa(7);
        System.out.println(e2.ConsultaEstoque());
        System.out.println(e3.ConsultaEstoque());
        System.out.println(e3.ConsultaEstoque());*/
    }

}