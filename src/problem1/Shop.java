package problem1;

import java.util.ArrayList;
import java.util.Scanner;
public class Shop
{
    public static void main (String[] args)
    {
        ArrayList<Item> cart = new ArrayList<>();
        String itemName;
        double itemPrice;
        int quantity;
        Scanner scan = new Scanner(System.in);
        String keepShopping = "y";
        do
        {
            System.out.print ("Enter the name of the item: ");
            itemName = scan.nextLine();
            System.out.print ("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            System.out.print ("Enter the quantity: ");
            quantity = scan.nextInt();
            scan.nextLine();
            Item myItem = new Item(itemName, itemPrice, quantity);
            cart.add(myItem);

            double totalPrice = 0;
            for (int i=0; i<cart.size(); i++){
                System.out.println(cart.get(i));
                totalPrice += (cart.get(i).getPrice())*(cart.get(i).getQuantity());
            }
            System.out.println("the total price : "+totalPrice+".");

            System.out.print("Continue shopping (y/n)? ");
            keepShopping = scan.nextLine();
        }
        while (keepShopping.equals("y"));
        scan.close();
    }
}
