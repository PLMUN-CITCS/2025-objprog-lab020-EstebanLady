
import java.util.Scanner;
public class MenuDrivenProgram {
  public static void main(String[] args) {
     
    int i = 0;
    while (i < 3) {
     int choice = displayMenu();
     handleMenuChoice(choice);
     i++;}
  }
  public static int displayMenu() {
    Scanner input = new Scanner(System.in);
    System.out.println("Menu: ");
    System.out.println("1. Greet User ");
    System.out.println("2. Check Even/Odd ");
    System.out.println("3. Exit ");
    System.out.print("Enter your choice (1-3): ");
    int choice = input.nextInt();
    return choice;
  }
  
  public static void handleMenuChoice(int choice) {
    Scanner input = new Scanner(System.in);
    
    if (choice == 1){
        System.out.println("Hello! Welcome!");
    } else if (choice == 2){
        System.out.print("Enter an Integer: ");
        int enterinteger = input.nextInt();
        
        if ((enterinteger % 2) == 0) {
        System.out.println (enterinteger + " is an Even Number");
        } else {
            System.out.println (enterinteger + " is an Odd Number");
        }
    } else if (choice == 3) {
        System.out.print("Exiting the program. Goodbye!");
        
    } else {
        System.out.println("Error. ");
    }
    
  }
  
}