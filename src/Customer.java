/**
 * Created by boun on 11/16/16.
 */
public class Customer {
    String name;
    String choice;


    public void chooseName() throws Exception {
        System.out.println("What is your name?");
        name = ATM.scanner.nextLine();
        if(name.isEmpty()) {
            throw new Exception("Name Not Entered!");
        }
        System.out.println("Welcome, " + name);

    }

    public void chooseChoice() throws Exception {
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println();
        System.out.println("1. Check Balance ");
        System.out.println("2. Withdrawal ");
        System.out.println("3. Cancel ");
        System.out.println();
        System.out.println("Enter Your Numeric Choice: ");

        choice = ATM.scanner.nextLine();

        if(choice.equalsIgnoreCase("1")) {
            System.out.println("Your balance is $100");
        } else if(choice.equalsIgnoreCase("2")) {
            System.out.println("How much do you want to withdrawal?");
            choice = ATM.scanner.nextLine();
            if(Integer.parseInt(choice) > 100) {
                throw new Exception("Insufficient Funds");
            }
            int funds = 100;
            funds = funds - Integer.parseInt(choice);
            System.out.println("Your remaining funds is" + " $"+funds);
        } else {
            System.out.println("Thank you and please come again!");
        }

    }

}
