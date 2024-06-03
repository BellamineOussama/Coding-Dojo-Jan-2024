import java.util.ArrayList;


public class TestOrders {
    public static void main(String[] args) {

        //!instantiate item variables
        Item item1 = new Item(null, 0);
        Item item2 = new Item(null, 0);
        Item item3 = new Item(null, 0);
        Item item4 = new Item(null, 0);

        //!set the name and price of each item
        //item1
        item1.name = "mocha";
        item1.price = 4.0;
        //item2
        item2.name = "latte";
        item2.price = 3.5;
        //item3
        item3.name = "drip coffee";
        item3.price = 2.0;
        //item4
        item4.name = "cappuccino";
        item4.price = 5.0;

        //!instantiate order variables
        Order order1 = new Order(null, 0, false, null);
        Order order2 = new Order(null, 0, false, null);
        Order order3 = new Order(null, 0, false, null);
        Order order4 = new Order(null, 0, false, null);

        //!set order name
        order1.name = "Cindhuri";
        order2.name = "Jimmy";
        order3.name = "Noah";
        order4.name = "Sam";

        //! print Order1 variable
        System.out.println(order1);

        //! Predict what happen if print order1.total
        // order1.total = 0.0;

        //!Add item1 to order2's item list
        order2.items = new ArrayList<>();
        order2.items.add(item1);
        order2.total += item1.price;

        //!Noah ordered a cappuccino.
        order3.items = new ArrayList<>();
        order3.items.add(item4);
        order3.total += item4.price;

        //!Sam added a latte.
        order4.items = new ArrayList<>();
        order4.items.add(item2);
        order4.total += item2.price;

        //!Cindhuri’s order is ready
        order1.ready = true;

        //!Sam ordered more drinks
        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += item2.price * 2;

        //! jimmy's order ready
        order2.ready = true;


        //print order1, order2, order3, order4

        //order1
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
        System.out.println(order1.items);

        System.out.println("***************************************");

        //order2
        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);
        for (Item item : order2.items) {
            System.out.println(item.name);
        }

        System.out.println("**************************************");

        //order3
        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);
        for (Item item : order3.items) {
            System.out.println(item.name);
        }

        System.out.println("**************************************");

        //order4
        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
        for (Item item : order4.items) {
            System.out.println(item.name);
        }



    }
}