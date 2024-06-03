import java.util.ArrayList;

public class Order {
    public String name;
    public double total;
    public boolean ready;
    public ArrayList<Item> items;

    public Order(String name,double total, boolean ready, ArrayList<Item> items){
        this.name = name;
        this.total = total;
        this.ready = ready;
        this.items = items;
    }
}
