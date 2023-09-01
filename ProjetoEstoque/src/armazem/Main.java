package armazem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int id, estoque;
        String produto;
        double preco;

        /*
        Estoque e1 = new Estoque(1, "Arroz", 10, 25);
        Estoque e2 = new Estoque(2, "Feijão", 12, 5.65);
        Estoque e3 = new Estoque(3, "Picanha", 7, 40);

        e1.Acrescimo(100);
        System.out.println("Quantidade atual: \n" + e1.ConsultaEstoque());

        e2.Baixa(7);
        System.out.println("Quantidade atual: \n" + e2.ConsultaEstoque());

        System.out.println("Quantidade total estoque: " + e3.TotalEstoque());

        */

            System.out.println("Digite o id do produto: ");
            id = sc.nextInt();
            System.out.println("Digite o nome do produto: ");
            produto = sc.nextLine();
            produto = sc.nextLine();
            System.out.println("Digite a quantidade em estoque do produto: ");
            estoque = sc.nextInt();
            System.out.println("Digite o valor do produto");
            preco = sc.nextDouble();
            Estoque e1 = new Estoque(id, produto, estoque, preco);

            System.out.println("Digite a quantidade para acrescentar");
            int qtde = sc.nextInt();
            e1.Acrescimo(qtde);

            System.out.println("Digite a quantidade para baixar");
            qtde = sc.nextInt();
            e1.Baixa(qtde);

            System.out.println(e1.ConsultaEstoque());

            System.out.println("Digite o id do produto: ");
            id = sc.nextInt();
            System.out.println("Digite o nome do produto: ");
            produto = sc.nextLine();
            produto = sc.nextLine();
            System.out.println("Digite a quantidade em estoque do produto: ");
            estoque = sc.nextInt();
            System.out.println("Digite o valor do produto");
            preco = sc.nextDouble();
            Estoque e2 = new Estoque(id, produto, estoque, preco);

            System.out.println("Digite o id do produto: ");
            id = sc.nextInt();
            System.out.println("Digite o nome do produto: ");
            produto = sc.nextLine();
            produto = sc.nextLine();
            System.out.println("Digite a quantidade em estoque do produto: ");
            estoque = sc.nextInt();
            System.out.println("Digite o valor do produto");
            preco = sc.nextDouble();
            Estoque e3 = new Estoque(id, produto, estoque, preco);

            System.out.println(e1.ConsultaEstoque());
            System.out.println();
            System.out.println(e2.ConsultaEstoque());
            System.out.println();
            System.out.println(e3.ConsultaEstoque());

            sc.close();
        }
    }
