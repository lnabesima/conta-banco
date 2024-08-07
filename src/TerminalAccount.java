import java.util.InputMismatchException;
import java.util.Locale;
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

        boolean isBalanceInputCorrect = false;
        do {
            try {
                System.out.print("Por favor, insira o saldo inicial: ");
                this.balance = sc.nextDouble();
                isBalanceInputCorrect = true;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira apenas valores decimais.");
            }
        } while (!isBalanceInputCorrect);



        System.out.println("Olá " + this.clientName + ", obrigado por criar uma conta em nosso banco. sua agência é " + this.branch + ", conta " + this.account + " e seu saldo " + this.balance + " já está disponível para saque.");
    }
}
