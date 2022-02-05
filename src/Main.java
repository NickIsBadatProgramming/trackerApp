public class Main {

    public static void main(String[] args) {
    // uses dataManagement class with startup method to create new folder if one is necessary
    int startup = (dataManagement.createFolder("H:","robotTracker"));
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







    }
}
