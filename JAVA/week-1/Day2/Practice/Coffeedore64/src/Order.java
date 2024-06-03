
import java.util.ArrayList;

public class Order {

    //Member variables
    private String name;
    private boolean ready;
    private ArrayList<Item> items;

    //!Constructors
    //no-arg constructor
    public Order() {
        this.name = "Guest";
        this.ready = false;
        this.items = new ArrayList<>();
    }
    //overloaded constructor
    public Order(String name) {
        this.name = name;
        this.ready = false;
        this.items = new ArrayList<>();
    }


    //!Methods
    //setters and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = true;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    // addItems method
    public void addItem(Item item){
        items.add(item);
    }

    //getStatusMessage method
    public String getStatusMessage(){
        if(ready){
            return "Your order is ready";
        }else{
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    //getOrderTotal method
    public double getOrderTotal(){
        double total = 0;
        for(Item item : items){
            total += item.getPrice();
        }
        return total;
    }

    //Display method
    public void display(){
        System.out.println("Customer name:" + name);
        for(Item item : items){
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("Total: $" + getOrderTotal());
    }

}