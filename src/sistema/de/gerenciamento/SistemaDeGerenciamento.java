/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema.de.gerenciamento;

/**
 *
 * @author jayne
 */
import java.util.Scanner;
public class SistemaDeGerenciamento {
    public static void main(String[] args) {
      Scanner entrada = new Scanner (System.in);
      
      String produto = "Teclado Mecânico";
      int quantidade = 50;
      int opcao = 0;
      
      String menu  = """
                     Menu:
                     1.Consultar quantidade de produtos em estoque
                     2.Adicionar produtos em estoque
                     3.Retirar produtos do estoque
                     4.Sair""";
      
       while (opcao != 5) {
            System.out.println("\nInformações do Produto:");
            System.out.println("Nome: " + produto);
            System.out.println("Quantidade em estoque: " + quantidade);

            if (quantidade < 10) {
                System.out.println("ALERTA: Quantidade em estoque abaixo de 10 unidades!");
            }

            System.out.println(menu);
            System.out.print("Escolha uma opção: ");

            opcao = entrada.nextInt();
            entrada.nextLine();

          switch (opcao) {
              case 1:
                  System.out.println("Quantidade em estoque: " + quantidade);
                  break;
              case 2:
                  System.out.print("Quantidade a ser adicionada: ");
                  int quantidadeAdicionar = entrada.nextInt();
                  quantidade += quantidadeAdicionar;
                  System.out.println("Produtos adicionados ao estoque.");
                  break;
              case 3:
                  System.out.print("Quantidade a ser retirada: ");
                  int quantidadeRetirar = entrada.nextInt();
                  if (quantidadeRetirar <= quantidade) {
                      quantidade -= quantidadeRetirar;
                      System.out.println("Produtos retirados do estoque.");
                  } else {
                      System.out.println("Quantidade insuficiente em estoque.");
                  } break;
              case 4:
                  System.out.print("Digite o novo nome do produto: ");
                  entrada.nextLine();
                  produto = entrada.nextLine();
                  System.out.println("Nome do produto atualizado.");
                  break;
              case 5:
                  System.out.println("Saindo do sistema.");
                  break;
              default:
                  System.out.println("Opção inválida. Tente novamente.");
                  break;
          }
        }

        entrada.close();
    }
}
