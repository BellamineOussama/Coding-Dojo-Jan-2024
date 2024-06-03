import java.util.ArrayList;
import java.text.DecimalFormat;

public class CafeUtil {
    public int  getStreakGoal( int numWeeks ){
        int sum = 0;
        for( int i = 1; i<=numWeeks; i++){
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices) {
        double total = 0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menu) {
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(i + " " + menu.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String username = System.console().readLine();
        System.out.println("Hello, " + username + "!  There are " + customers.size() + " people ahead of you.");
        customers.add(username);

        System.out.println(customers);
    }

    public void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println(product);
        DecimalFormat x= new DecimalFormat("#0.00");

        for (int i = 1; i <= maxQuantity; i++) {
            double totalPrice = price * i;
            System.out.println(i + " - $" + x.format(totalPrice));
        }
    }

}

