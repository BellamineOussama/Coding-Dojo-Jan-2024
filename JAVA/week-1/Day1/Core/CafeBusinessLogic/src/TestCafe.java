import java.util.ArrayList;
public class TestCafe {
    public static void main(String[] args) {
        CafeUtil appTest = new CafeUtil();

        // getStreakGoal
        int streakGoal = appTest.getStreakGoal(10);
        System.out.println("------ Streak Goal Test ------");
        System.out.println("Purchases needed by week 10: " + streakGoal);

        // getOrderTotal
        double[] prices = {3.5, 1.5, 4.0, 4.5};
        double orderTotal = appTest.getOrderTotal(prices);
        System.out.println("----- Order Total Test -----");
        System.out.println("Order Total: " + orderTotal);

        // display the menu items
        System.out.println("----- Display Menu Test -----");
        ArrayList<String> menu = new ArrayList<>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        appTest.displayMenu(menu);

        // Add Customer Test
         System.out.println("\n----- Add Customer Test-----");
         ArrayList<String> customers = new ArrayList<>();
         for (int i = 0; i < 4; i++) {
             appTest.addCustomer(customers);
             System.out.println("\n");
         }
        // printPriceChar
        appTest.printPriceChart("Columbian Coffee Grounds", 15.0, 3);

    }
}