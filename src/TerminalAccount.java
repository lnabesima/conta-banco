import java.util.InputMismatchException;
import java.util.Scanner;

public class TerminalAccount {
    private int branch;
    private String account;
    private String clientName;
    private double balance;

    public void createAccount() {
        Scanner sc = new Scanner(System.in);

        boolean isBranchNumberInputCorrect = false;
        do {
            try {
                System.out.print("Por favor, insira o número da agência: ");
                this.branch = sc.nextInt();
                sc.nextLine();
                isBranchNumberInputCorrect = true;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, insira apenas números inteiros para o número da agência.");
                sc.nextLine();
            }
        } while (!isBranchNumberInputCorrect);

        System.out.print("Por favor, insira o número da conta: ");
        this.account = sc.nextLine();

        System.out.print("Por favor, insira o nome do cliente: ");
        this.clientName = sc.nextLine();

        boolean isBalanceInputCorrect = false;
        do {
            try {
                System.out.print("Por favor, insira o saldo inicial: ");
                String balanceString = sc.nextLine().replace(",", ".");
                this.balance = Double.parseDouble(balanceString);
                isBalanceInputCorrect = true;
            } catch (NumberFormatException e) {
                System.out.println("Por favor, insira apenas valores decimais.");
            }
        } while (!isBalanceInputCorrect);

        System.out.println("Olá " + this.clientName + ", obrigado por criar uma conta em nosso banco. sua agência é " + this.branch + ", conta " + this.account + " e seu saldo " + this.balance + " já está disponível para saque.");
    }
}
