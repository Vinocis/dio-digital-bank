public class Customer {
    private Account account;
    private String name;
    private String email;
    private String phoneNumber;

    public Customer(String name, String email, String phoneNumber){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }
}
