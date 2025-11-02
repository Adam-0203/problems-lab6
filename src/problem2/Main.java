package problem2;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("National Bank");
        
        Customer customer1 = new Customer("Alice Smith");
        Customer customer2 = new Customer("Bob Johnson");
        
        bank.addCustomer(customer1);
        bank.addCustomer(customer2);
        
        customer1.addTransaction(1000.50);
        customer1.addTransaction(-200.75);
        customer2.addTransaction(500.25);
        customer2.addTransaction(-50.00);
        
        System.out.println("=== Bank Information ===");
        bank.afficherInfo();
        
        System.out.println("=== Bank toString ===");
        System.out.println(bank);
        
        System.out.println("=== After removing customer1 ===");
        bank.removeCustomer(customer1);
        System.out.println(bank);
        
        System.out.println("=== Testing transaction without bank ===");
        customer1.addTransaction(300.00);
    }
}