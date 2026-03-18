
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) throws Exception {
        String nomeDoCliente = "Fred Joaquim Dos Santos";
        String tipoDeConta = "Corrente";
        double saldoDisponível = 9699.99;
        int opcao = 0;

        System.out.println("-------------------------------------------");
        System.out.println("-------------------------------------------");
        System.out.println("\n Nome do Cliente: " + nomeDoCliente);
        System.out.println("\n*******************************************");
        System.out.println("*******************************************");
        System.out.println("\n Tipo de Conta do cliente: " + tipoDeConta);
        System.out.println("\n*******************************************");
        System.out.println("*******************************************");
        System.out.println("\n Saldo do Cliente:" + saldoDisponível);
        System.out.println("\n*******************************************");
        System.out.println("*******************************************");

        String menuDeOpecoes = """
                \n**Digite sua opção**

                1 - Consultar Saldo
                2 - Transferir Valor
                3 - Receber Valor
                4 - Sair
                """;

                Scanner leitura = new  Scanner(System.in);

                while (opcao != 4) {
                    System.out.println(menuDeOpecoes);
                    opcao = leitura.nextInt();

                    if (opcao == 1) {
                        System.out.println("O saldo atualizado é " + saldoDisponível);
                    } else if (opcao == 2) {
                        System.out.println("Qual valor deseja transferir?");
                        double valor = leitura.nextDouble();
                        if (valor > saldoDisponível) {
                            System.out.println("Não há saldo suficiente para realizar a transferência");
                        } else {
                            saldoDisponível -= valor;
                            System.out.println("Novo saldo " + saldoDisponível);
                        }
                    } else if (opcao == 3) {
                        System.out.println("Valor recebido: ");
                        double valor = leitura.nextDouble();
                        saldoDisponível += valor;
                        System.out.println("Novo saldo " + saldoDisponível);
                    } else if (opcao != 4) {
                         System.out.println("Opção inválida");
                    }
        }
    }
}
