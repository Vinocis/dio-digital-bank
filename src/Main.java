public class Main {
    public static void main(String[] args) {
        Customer vinicius = new Customer(
                "Vinicius",
                "vinicius@email.com",
                "(34) 99999-9999"
        );

        CheckingAccount checkingAccount = new CheckingAccount(vinicius);
        SavingsAccount savingsAccount = new SavingsAccount(vinicius);

        checkingAccount.deposit(100.00f);
        checkingAccount.transfer(100.00f, savingsAccount);

        checkingAccount.printBankStatement();
        savingsAccount.printBankStatement();
    }
}