import java.util.HashMap;

public class Hashmatique {
    public static void main(String[] args) {
        // Creating a HashMap to store rapper names and their tracks
        HashMap<String, String> map = new HashMap<>();

        // Adding rapper names and their tracks
        map.put("Samara","KATANA");
        map.put("Balti","ya lili ya lila ");
        map.put("ALA","Piano");
        map.put("Nordo","al aqsa");

        // Pull out one of the tracks by the rapper's name
        System.out.println(map.get("Samara"));

        System.out.println("**********************");

        // Print out all the Rapper names and Tracks
        for(String key : map.keySet()){
            System.out.printf("Rapper: %s - Track: %s%n", key, map.get(key));
        }

    }
}
