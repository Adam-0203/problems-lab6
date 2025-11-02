package problem2;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();

    public Bank(String name){
        this.name = name;
    }
    
    public String getName(){return name;}

    public void addCustomer(Customer customer){
        if (!customers.contains(customer)){
            customers.add(customer);
            if (customer.getBank() != this){
                customer.setBank(this);
            }
        }
    }

    public void removeCustomer(Customer customer){
        if (customers.contains(customer)){
            customers.remove(customer);
            customer.setBank(null);
        }
    }

    public void afficherInfo(){
        System.out.println("The bank infos : \n");
        for (int i=0; i<customers.size(); i++){
            System.out.println(customers.get(i));
        }
    }

    @Override
    public String toString(){
        var res = new StringBuilder();    
        res.append("The Bank : "+name+", the customers : \n");
        for (var customer : customers){
            res.append(customer.getName()+" / ");
        }
        res.append("\n");
        return res.toString();
    }
}
