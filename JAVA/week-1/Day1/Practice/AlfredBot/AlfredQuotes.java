import java.util.Date;
import java.time.LocalDateTime;

public class AlfredQuotes {

    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name){
        return String.format("Hello, %s. Lovely to see you.", name);
    }

    public String dateAnnouncement(){
        Date date = new Date();
        return "It is currently " + date + ".";
    }

    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") != -1) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if (conversation.indexOf("Alfred") != -1) {
            return "At your service. As you wish, naturally.";
        } else {
            return "Right. And with that I shall retire.";
        }
    }

    // NINJA Bonuses :
    // I) :
        // overloaded the method guestGreeting (name and dayPeriod)
        // returns a greeting including the person's name as well as the day period.
    public String guestGreeting(String name, String dayPeriod){
        return String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
    }

        // Overloaded method with no parameters
        // gives the current time
    public String guestGreeting() {
        LocalDateTime currentTime = LocalDateTime.now();
        int hour = currentTime.getHour();
        String dayPeriod;
        if (hour < 12) {
            dayPeriod = "morning";
        } else if (hour < 18) {
            dayPeriod = "afternoon";
        } else {
            dayPeriod = "evening";
        }
        return String.format("Good %s. Lovely to see you.", dayPeriod);
    }

    // II) :
        // Custom method
    public String alfredMethod(String phrase) {
        return phrase.toUpperCase() + " !!";
    }

}







