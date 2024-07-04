public class SavingsAccount extends Account{
    public SavingsAccount(Customer customer) {
        super(customer);
    }

    public void printBankStatement(){
        System.out.println(" ===== Savings Account Statement =====");
        super.printAccountInfo();
    }
}
