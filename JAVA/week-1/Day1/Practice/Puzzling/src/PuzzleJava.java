import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {

    // getTenRolls
    public ArrayList<Integer> getTenRolls(){
        //  Create an instance of the Random class to generate random numbers
        Random randMachine = new Random();
        //Create a new ArrayList
        ArrayList<Integer> random10 = new ArrayList<>();
        // Loop to generate ten random numbers
        for (int i = 1; i <= 10; i++) {
            // Generate a random number between 1 and 20
            int randomNum = randMachine.nextInt(20) + 1;
            // Add the random number to the ArrayList
            random10.add(randomNum);
        }
        return random10;
    }

    // getRandomLetter
    public char getRandomLetter(){
        char[] alphabet = new char[26];
        for (int i = 0; i < alphabet.length; i++) {
            // 'a' has an ASCII value of 97
            // Adding i (which ranges from 0 to 25) to 'a' produces the following letters
            alphabet[i] = (char) ('a' + i);
        }
        Random rand = new Random();
        int randomIndex = rand.nextInt(26);
        return alphabet[randomIndex];
    }

    // generatePassword
    public String generatePassword(){
        // Initialize an empty string for the password
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            // Append a random letter to the password
            password.append(getRandomLetter());
        }
        // Convert the StringBuilder to a String and return the password
        return password.toString();
    }

    // getNewPasswordSet
    public String getNewPasswordSet(int length){
        ArrayList<String> newPasswordSet = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            newPasswordSet.add(generatePassword());
        }
        return newPasswordSet.toString();
    }
    // shuffleArray
    public static void shuffleArray(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            int randomIndex = rand.nextInt(array.length);
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }
    }
}

