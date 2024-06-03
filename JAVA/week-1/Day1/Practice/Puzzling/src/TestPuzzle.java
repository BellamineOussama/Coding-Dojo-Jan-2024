import java.util.ArrayList;

public class TestPuzzle {
    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();

        // getTenRolls
        ArrayList<Integer> random10 = generator.getTenRolls();
        System.out.println("Ten random numbers between 1 and 20: "+random10);

        System.out.println("********************");

        // getRandomLetter
        char alphabet = generator.getRandomLetter();
        System.out.println("Random letter: " +alphabet);

        System.out.println("********************");

        // generatePassword
        String password = generator.generatePassword();
        System.out.println("Random password: "+password);

        System.out.println("********************");

        // getNewPasswordSet
        String newPassword = generator.getNewPasswordSet(8);
        System.out.println("New passwordSet: "+newPassword);

        System.out.println("********************");

        // shuffleArray
        int[] myArray = {1, 2, 3};
        PuzzleJava.shuffleArray(myArray);
        // Printing the shuffled array
        for (int num : myArray) {
            System.out.print(num + " ");
        }
    }
}
