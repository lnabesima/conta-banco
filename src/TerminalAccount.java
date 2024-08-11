import java.util.InputMismatchException;
import java.util.Scanner;

 /**
 * This class represents a terminal account in a banking system.
 * The TerminalAccount class encapsulates the data fields branch, account, clientName, and balance
 * that describe an account in a terminal.
 *
 * <p>It provides a method to create an account which involves user's input for branch,
 * account, client name, and the initial balance.
 * Input validation is carried out to ensure correct data type for branch and balance.
 * It follows a structured process to confirm user inputs are valid before finalizing account creation.
 *
 * <p> Each TerminalAccount object represents an individual client's account.
 *
 * @author Lucas Nabesima
 * @version 1.0
 */
public class TerminalAccount {
    private int branch;
    private String account;
    private String clientName;
    private double balance;


    /**
     * Creates a new account in the banking system.
     * This method prompts the user to input the branch number, account number, client name, and initial balance,
     * and sets the corresponding instance variables in the TerminalAccount object.
     * Input validation is performed to ensure the branch number and balance are of the correct data type.
     * The user is prompted repeatedly until the input is valid.
     * Once the inputs are valid, the method prints a welcome message with the account details.
     *
     *
     * @Usage TerminalAccount account = new TerminalAccount();<br>
     * account.createAccount();
     *
     * @Input
     * <ul>
     *     <li>Por favor, insira o número da agência: 123</li>
     *     <li>Por favor, insira o número da conta: 456789</li>
     *     <li>Por favor, insira o nome do cliente: John Doe</li>
     *     <li>Por favor, insira o saldo inicial: 1000</li>
     * @Output Olá John Doe, obrigado por criar uma conta em nosso banco. Sua agência é 123, conta 456789 e seu saldo 1000.0 já está disponível para saque.</li>
     * </ul>
     */
    public void createAccount() {
        Scanner sc = new Scanner(System.in);

        /*
         * This block of code is used to prompt the user for branch number input.
         * It contains a loop that continues to request input until a valid integer is provided.
         *
         * The application asks the user, "Por favor, insira o número da agência: ".
         * If the user enters a valid integer, it is stored in the 'branch' field, and the 'isBranchNumberInputCorrect' boolean flag is set to true,
         * indicating that a correct input has been received, breaking the loop.
         *
         * If the input is not an integer, an InputMismatchException is caught, and an error message, "Por favor, insira apenas números inteiros para o número da agência.", is displayed to the user.
         * The incorrect input is disregarded, and the loop continues to ask for a valid input.
         */
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

        /*
         * This block of code is used to prompt the user for initial balance input.
         * It contains a loop that continues to request input until a valid decimal or double value is provided.
         *
         * The application asks the user, "Por favor, insira o saldo inicial: ".
         * If the user enters a valid decimal number, it is stored in the 'balance' field.
         * Comma is replaced with a dot to accommodate different regional decimal formats.
         * The 'isBalanceInputCorrect' boolean flag is set to true, indicating that a correct input has been received, breaking the loop.
         *
         * If the input is not a valid decimal number, a NumberFormatException is caught, and an error message,
         * "Por favor, insira apenas valores decimais.", is displayed to the user. The incorrect input is ignored,
         * and the loop continues to ask for a valid input.
         */
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
