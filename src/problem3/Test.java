package problem3;

import java.util.Scanner;

public class Test {
    public static void displayMenu(){
        System.out.println("\n1 : display all the documents");        
        System.out.println("2 : display the authors of books");        
        System.out.println("3 : delete a document\n");        
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("how many document will there be : ");
        int n = scr.nextInt();
        scr.nextLine();

        Library myLibrary = new Library(n);
        myLibrary.addDoc(new Novel("la belle et la bête", "Arthur", 342, 12));
        myLibrary.addDoc(new Dicitionary("Larousse", "Français"));

        String continuer = "y";
        do{
            displayMenu();
            System.out.print("What is your choice : ");
            int choice = scr.nextInt();
            scr.nextLine();

            
            switch (choice){
                case 1 : 
                    myLibrary.displayDocuments();
                    break;
                case 2 :
                    myLibrary.displayAuthors();
                    break;
                case 3 : 
                    System.out.print("Enter the id of the doc to delete : ");
                    int id = scr.nextInt();
                    myLibrary.deleteDoc(myLibrary.document(id));
                    break;
                default : System.out.println("wrong input.");
            }
            
            System.out.print("do you want to continue (y/n): ");
            continuer = scr.next();
            scr.nextLine();

        }while (continuer.equals("y"));
        scr.close();
    }
}
