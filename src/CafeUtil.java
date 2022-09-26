import java.util.ArrayList;
import java.util.Scanner;

/**
 * You will be writing all your methods inside the CafeUtil class.
 */
public class CafeUtil {

    /**
     * sums together every consecutive integer from 1 to 10 and returns the sum.
     * @return
     */

    public int getStreakGoal(){
        int total = 0;
        for(int i = 1; i <= 10; i++){
            total += i;
        }
        return total;
    }
    /**
     * sums together every consecutive integer from 1 to 10 and returns the sum. This is the ninja bonus. It uses method overloading to preserve the other method
     * @param numWeeks
     * @return the sum of every consecutive integer from 1 to 10
     */
    public int getStreakGoal(int numWeeks){
        int total = 0;
        for(int i = 1; i <= numWeeks; i++){
            total += i;
        }
        return total;
    }
    /**
     * Given an array of item prices from an order, sum the prices in the array and return the total.
     * Don't forget to test your code! Find the lines of test code for this method in TestCafe.java and uncomment it before you compile and run.
     * @param prices
     * @return total of prices array
     */
    public double getOrderTotal(double[] prices){
        float total = 0;
        for(int i = 0; i < prices.length; i++){
            total += prices[i];
        }
        return total;
    }

    /**
     * Given an ArrayList of menu items (strings), print out each index and menu item.
     *
     * @param menuItems
     */
    void displayMenu(ArrayList<String> menuItems){
        for(int i = 0; i < menuItems.size(); i++){
            System.out.format("%d %s\n", i, menuItems.get(i));
        }
    }

    /**
     * Print this string to the console: "Please enter your name:"
     */
    void addCustomer(ArrayList<String> customers){
        Scanner S = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String userName = S.nextLine();
        System.out.format("Hello, %s\n", userName);
        System.out.format("There are %d people in front of you.", customers.size());
        customers.add(userName);
        for(String customer : customers){
            System.out.println(customer);
        }
    }
}
