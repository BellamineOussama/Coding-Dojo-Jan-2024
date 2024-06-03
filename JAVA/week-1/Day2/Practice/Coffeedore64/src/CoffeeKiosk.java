import java.util.ArrayList;

public class CoffeeKiosk {

    private final ArrayList<Item> menu;

    //!Constructor
    public CoffeeKiosk() {
        this.menu = new ArrayList<>();
    }

    //!Methods
    //Add item to the menu
    public void addMenuItem(String name, double price) {
        Item newItem = new Item(name, price);
        newItem.setIndex(menu.size());
        menu.add(newItem);
    }


    //Display Menu
    public void displayMenu() {
        for (int i = 0; i < menu.size(); i++) {
            Item item = menu.get(i);
            System.out.println(i + " " + item.getName() + " -- $" + item.getPrice());
        }
    }

    //Add order
    public void newOrder() {

        // Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();


        // Create a new order with the given input string
        Order newOrder = new Order(name);


        // Show the user the menu, so they can choose items to add.
        displayMenu();


        // Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();

        // Write a while loop to collect all user's order
        while (!itemNumber.equals("q")) {
            int index = Integer.parseInt(itemNumber);
            if (index >= 0 && index < menu.size()) {
                Item item = menu.get(index);
                newOrder.addItem(item);
            } else {
                System.out.println("Invalid item index. Please try again.");
            }
            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = System.console().readLine();
        }

        // After you have collected their order, print the order details
        newOrder.display();

    }





}