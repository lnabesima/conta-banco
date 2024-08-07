import java.util.Scanner;

public class TerminalAccount {
    private int branch;
    private String account;
    private String clientName;
    private double balance;

    public void createAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, insira o número da agência: ");
        this.branch = sc.nextInt();
        sc.nextLine();

        System.out.print("Por favor, insira o número da conta: ");
        this.account = sc.nextLine();

        System.out.print("Por favor, insira o nome do cliente: ");
        this.clientName = sc.nextLine();

        System.out.print("Por favor, insira o saldo inicial: ");
        this.balance = sc.nextDouble();


        System.out.println("Olá " + this.clientName + ", obrigado por criar uma conta em nosso banco. sua agência é " + this.branch + ", conta " + this.account + " e seu saldo " + this.balance + " já está disponível para saque.");
    }
}
