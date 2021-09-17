import java.util.Scanner;


public class Main {

    static Scanner scan = new Scanner(System.in);


    static int getIndexOfMostPopularItem(int[] listOfItemsChosen) {
        int mostPopularIndex = 0;
        for (int i = 1; i < listOfItemsChosen.length; i++) {
            if (listOfItemsChosen[i] > listOfItemsChosen[mostPopularIndex]) mostPopularIndex = i;
        }
        return mostPopularIndex;
    }


    public static void main(String[] args) {

        //Declarations
        int[] choiceOfItemStatistics = new int[10];

        String[] choiceOfItem = {
                "Phone", "Family album", "A bottle of water", "A knife", "Sunblock",
                "Twine", "A fishing net", "A box of matches", "A bottle of jack", "A gun"};

        System.out.println("How many people will be participating in this survey?");

        int inputNumberOfParticipants = scan.nextInt();


        for (int i = 0; i < inputNumberOfParticipants; i++) {

            //Text to prompt user
            System.out.println("\n\nIf you were to be stranded on a desert island," +
                    "\nwhat item would you bring out of the following ten?\n");

            for (int j = 1; j < 11; j++) {
                System.out.println(j + ":\t" + choiceOfItem[j - 1]);
            }

            System.out.print("\nInput choice: ");

            int inputChoice = scan.nextInt();

            for (int j = 0; j < 1; j++) {
                choiceOfItemStatistics[inputChoice - 1] += 1; //+=1 = choiceOfItemStatistics[inputChoice-1]+1
            }
        }


        String mostPopularItem = choiceOfItem[getIndexOfMostPopularItem(choiceOfItemStatistics)];
        int timesChosen = choiceOfItemStatistics[getIndexOfMostPopularItem(choiceOfItemStatistics)];

        System.out.print("\n\n[");
        for (int i = 0; i < 9; i++) {
            System.out.print(choiceOfItemStatistics[i] + ", ");
        }
        System.out.print(choiceOfItemStatistics[choiceOfItemStatistics.length - 1] + "]");

        System.out.println("\nMost popular item:\t\t\t" + mostPopularItem);
        System.out.println("Number of times chosen:\t\t" + timesChosen);
    }
}
