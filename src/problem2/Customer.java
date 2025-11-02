package problem2;
import java.util.ArrayList;

public class Customer {
    private String name;
    private Bank bank = null;
    private ArrayList<Double> transactions = new ArrayList<>();

    public Customer(String name){
        this.name = name;
    }
    public Bank getBank(){return this.bank;}
    public String getName(){return this.name;}



    public void setBank(Bank bank){
        if (this.bank != null){
            this.bank.removeCustomer(this);
        }
        this.bank = bank;
        if (bank != null){
            bank.addCustomer(this);
        }
    }

    public void addTransaction(double amount){
        if (this.bank == null){
            System.out.println("the customer isn't affected to any bank.");
        }
        else{
            Double myAmount = amount;
            transactions.add(myAmount);
        }
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        String bankName = (bank==null)? "No Bank" : bank.getName();
        res.append("The customer "+name+" at the bank "+bankName+" : \n");
        res.append("the transactions : \n");
        for (int i =0; i<transactions.size(); i++){
            res.append(transactions.get(i));
            res.append(" / ");
        }
        res.append("\n");
        return res.toString();
    }
}
