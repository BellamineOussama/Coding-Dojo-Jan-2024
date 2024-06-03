

public class TestOrder {

    public static void main(String[] args) {

        //add menu items
        CoffeeKiosk coffeeKiosk = new CoffeeKiosk();
        coffeeKiosk.addMenuItem("Banana", 2.00);
        coffeeKiosk.addMenuItem("coffee", 1.50);
        coffeeKiosk.addMenuItem("latte", 4.50);
        coffeeKiosk.addMenuItem("capuccino", 3.00);
        coffeeKiosk.addMenuItem("muffin", 4.00);

        //display menu
        coffeeKiosk.displayMenu();

        //create new order
        coffeeKiosk.newOrder();


    }
}