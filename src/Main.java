import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        //Declarations
        int[] choiceOfItemStatistic = {10};

        String[] choiceOfItem = {
                "Phone", "Family album", "A bottle of water", "A knife", "Sunblock",
                "Twine", "A fishing net", "A box of matches", "A bottle of jack", "A gun"};

        //Text to prompt user
        System.out.println("\nIf you were to be stranded on a desert island," +
                "\nwhat item would you bring out of the following ten?\n");

        for (int i = 1; i < 11; i++) {
            System.out.println(i + ":\t" + choiceOfItem[i-1]);
        }

        System.out.println("\nInput choice: ");

        for (int i = 0; i < 11; i++) {

        }
        choiceOfItemStatistic[0] = scan.nextInt();




    }
}
