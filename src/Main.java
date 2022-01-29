import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // uses dataManagement class with startup method to create new folder if one is necessary
    int startup = (dataManagement.startup("H:\\robotTracker"));
    switch(startup) {
        case -1:
            System.out.println("Error");
            break;
        case 1:
            System.out.println("Data folder created");
            break;
        case 2:
            System.out.println("Data folder located");
            break;
    }







    scanner.close();
    }
}
