public class CheckingAccount extends Account{
    public String teste = "teste";

    public CheckingAccount(Customer customer) {
        super(customer);
    }

    public void printBankStatement(){
        System.out.println(" ===== Checking Account Statement =====");
        super.printAccountInfo();
    }
}
