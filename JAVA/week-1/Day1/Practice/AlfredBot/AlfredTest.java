
public class AlfredTest{
    public static void main(String[] args) {
        AlfredQuotes alfredBot = new AlfredQuotes();

        String testGreeting = alfredBot.basicGreeting();
        System.out.println(testGreeting);
        System.out.println("----------------------------------------");

        // Guest Greeting
        String testGuestGreeting = alfredBot.guestGreeting("Beth Kane");
        System.out.println(testGuestGreeting);
        System.out.println("----------------------------------------");

        // Date Announcement
        String testDateAnnouncement = alfredBot.dateAnnouncement();
        System.out.println(testDateAnnouncement);
        System.out.println("----------------------------------------");

        // Respond Before Alexis
        String alexisTest = alfredBot.respondBeforeAlexis(
                "Alexis! Play some low-fi beats."
        );
        System.out.println(alexisTest);
        // Respond Before Alfred
        String alfredTest = alfredBot.respondBeforeAlexis(
                "I can't find my yo-yo. Maybe Alfred will know where it is.");
        System.out.println(alfredTest);
        // notRelevantTest
        String notRelevantTest = alfredBot.respondBeforeAlexis(
                "Maybe that's what Batman is about. Not winning. But failing.."
        );
        System.out.println(notRelevantTest);
        System.out.println("----------------------------------------");


        // // NINJA Bonuses :
        // I) :
        String testGuestGreetingMorning = alfredBot.guestGreeting("Beth Kane", "morning");
        System.out.println(testGuestGreetingMorning);
        System.out.println("----------------------------------------");
        String testGuestGreet= alfredBot.guestGreeting();
        System.out.println(testGuestGreet);
        System.out.println("----------------------------------------");
        // II) :
        String alfredUpperCase = alfredBot.alfredMethod("alfred");
        System.out.println(alfredUpperCase);
    }
}


