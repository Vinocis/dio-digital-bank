public class Account {
    private static final int DEFAULT_AGENCY = 1;
    private static int NUMBER_SEQUENCE = 1;

    protected int number;
    protected int agency;
    protected float balance = 0;
    protected Customer customer;

    public Account (Customer customer){
        this.agency = DEFAULT_AGENCY;
        this.number = NUMBER_SEQUENCE++;
        this.customer = customer;
    }

    public void withdrawal(float amount){
        balance -= amount;
    }

    public void deposit(float amount){
        balance += amount;
    }

    public void transfer(float amount, Account receiverAccount){
        withdrawal(amount);
        receiverAccount.deposit(amount);
    }

    protected void printAccountInfo(){
        System.out.println(String.format("Titular: %s", this.customer.getName()));
        System.out.println(String.format("Agencia: %d", this.agency));
        System.out.println(String.format("Numero: %d", this.number));
        System.out.println(String.format("Saldo: %.2f", this.balance));
    }
}
