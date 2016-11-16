import java.util.Scanner;

/**
 * Created by boun on 11/16/16.
 */
public class ATM {
    public static Scanner scanner = new Scanner(System.in);
    public static Customer customer = new Customer();

    public static void main(String [] args) throws Exception {

        customer.chooseName();
        customer.chooseChoice();
    }
}
