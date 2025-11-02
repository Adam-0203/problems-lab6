package Challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        boolean running = true;

        while (running) {
            // Display menu
            System.out.println("\nAvailable actions:");
            System.out.println("0 - to shutdown");
            System.out.println("1 - to add item(s) to list (comma delimited list)");
            System.out.println("2 - to remove any items (comma delimited list)");
            System.out.print("Enter a number for which action you want to do: ");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "0":
                    running = false;
                    System.out.println("Shutting down...");
                    break;

                case "1":
                    System.out.print("Enter items to add (comma separated): ");
                    String toAdd = scanner.nextLine();
                    String[] addItems = toAdd.split("\\s*,\\s*");
                    for (String item : addItems) {
                        list.add(item);
                    }
                    System.out.println("Current list: " + list);
                    break;

                case "2":
                    System.out.print("Enter items to remove (comma separated): ");
                    String toRemove = scanner.nextLine();
                    String[] removeItems = toRemove.split("\\s*,\\s*");
                    for (String item : removeItems) {
                        list.remove(item); // removes first occurrence
                    }
                    System.out.println("Current list: " + list);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 0, 1, or 2.");
            }
        }

        scanner.close();
    }
}
