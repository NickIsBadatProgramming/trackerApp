public class Main {
    public static void main(String[] args) {
        //this is the root for my computer, might need to be changed when used on other computers
        String root = "H:/robotTracker";


    // uses dataManagement class with startup method to create new folder if one is necessary
    int startup = (dataManagement.createFolder(root));
        switch (startup) {
            case -1 -> System.out.println("Error");
            case 1 -> System.out.println("Data folder created");
            case 2 -> System.out.println("Data folder located");
        }

        Gui steve = new Gui();
        steve.GUI();
        while(true) {
            if(steve.getIsRunning()) {
                break;
            }
        }
        System.out.println(steve.getTeamNameOutput());





















    }
    public static void close() {
        System.exit(0);
    }
}
