public class TestOrder {

    public static void main(String[] args) {

        //!create 4 items objects
        Item item1 = new Item("latte", 4.00);
        Item item2 = new Item("cappuccino", 4.50);
        Item item3 = new Item("drip coffee", 2.50);
        Item item4 = new Item("mocha", 5.00);

        //!Create 2 orders with no-arg constructor
        Order order1 = new Order();
        Order order2 = new Order();


        //!create 3 order with overloaded constructor
        Order order3 = new Order("Oussama");
        Order order4 = new Order("Scotty");
        Order order5 = new Order("Pizza");


        //!Adding 2 items to every order
        //order1
        order1.addItem(item1);
        order1.addItem(item2);

        //order2
        order2.addItem(item3);
        order2.addItem(item4);

        //order3
        order3.addItem(item3);
        order3.addItem(item3);

        //order4
        order4.addItem(item1);
        order4.addItem(item4);

        //order5
        order5.addItem(item3);
        order5.addItem(item2);


        //!changing the status of 2 orders
        order3.setReady(true);
        order5.setReady(true);

        //!printing the status of every order
        System.out.println(order1.getStatusMessage());
        System.out.println(order2.getStatusMessage());
        System.out.println(order3.getStatusMessage());
        System.out.println(order4.getStatusMessage());
        System.out.println(order5.getStatusMessage());

        System.out.println("*****************");

        //!printing the total of every order
        System.out.println(order1.getOrderTotal());
        System.out.println("----------------------------------");
        System.out.println(order2.getOrderTotal());
        System.out.println("----------------------------------");
        System.out.println(order3.getOrderTotal());
        System.out.println("----------------------------------");
        System.out.println(order4.getOrderTotal());
        System.out.println("----------------------------------");
        System.out.println(order5.getOrderTotal());

        System.out.println("*****************");

        //! display method for every order
        order1.display();
        System.out.println("----------------------------------");
        order2.display();
        System.out.println("----------------------------------");
        order3.display();
        System.out.println("----------------------------------");
        order4.display();
        System.out.println("----------------------------------");
        order5.display();

    }
}