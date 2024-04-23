import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int num;
        String agencia, nome;
        double saldo; 


        System.out.println("Seja Bem vindo a nossa ContaTerminal:\n\n");
        System.out.println("Digite o Número de sua Conta:");
        num = scan.nextInt();
        System.out.println("\nDigite a Agencia de sua Conta:");
        agencia = scan.next();
        System.out.println("\nDigite o Nome do Titular da Conta:");
        nome = scan.next();
        System.out.println("\nDigite o Saldo de sua Conta:");
        saldo = scan.nextDouble();

        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque", 
        nome, agencia, num, saldo);
    }
}
