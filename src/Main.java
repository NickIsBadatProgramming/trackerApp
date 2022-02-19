public class Main {
    static Gui g1 = new Gui();
    static String root;

    public static void main(String[] args) {

        try {
            String userName = System.getProperty("user.name");
            root = dataManagement.readFile("C:/Users/" + userName + "/AppData/Local/Programs/trackerApp/dataLocation.txt");
        } catch (Exception e) {
            String userName = System.getProperty("user.name");
            dataManagement.createFolder("C:/Users/" + userName + "/AppData/Local/Programs/trackerApp");
            dataManagement.createFile("C:/Users/" + userName + "/AppData/Local/Programs/trackerApp", "dataLocation.txt");
            dataManagement.writeToFile("C:/Users/" + userName + "/AppData/Local/Programs/trackerApp", "dataLocation.txt", "C:/Users/" + userName + "/Documents/robotTracker");
            root = "C:/Users/" + userName + "/Documents/trackerApp";
        }



        // uses dataManagement class with startup method to create new folder if one is necessary
        int startup = (dataManagement.createFolder(root));
        switch (startup) {
            case -1 -> System.out.println("Error");
            case 1 -> System.out.println("Data folder created");
            case 2 -> System.out.println("Data folder located");
        }

        g1.mainMenu();


    }



    public static void close() {
        System.exit(0);
    }
    public static void submitted() {
        NewRobot R1 = new NewRobot(g1.getTeamNumberOutput(),g1.getTeamNameOutput(),g1.getCommentsOutput(),g1.getClimbingPointsOutput(),g1.getShootingPointsOutput(),g1.getAutonomousPointsOutput(),g1.getWinsOutput(),g1.getLossesOutput());
        R1.compileData(root);
    }
    public static void edited() {
        NewRobot R1 = new NewRobot(g1.getTeamNumberOutput(),g1.getTeamNameOutput(),g1.getCommentsOutput(),g1.getClimbingPointsOutput(),g1.getShootingPointsOutput(),g1.getAutonomousPointsOutput(),g1.getWinsOutput(),g1.getLossesOutput());
        R1.compileData(root);
    }
    public static void refreshGui(){
        g1.mainMenu();
    }
}
