public class Main {
    public static void main(String[] args) {
        //this is the root for my computer, might need to be changed when used on other computers
        String root = "H:/robotTracker";


    // uses dataManagement class with startup method to create new folder if one is necessary
    int startup = (dataManagement.createFolder(root));
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
        //NewRobot R1 = new NewRobot(5442,"Mechanical Monarchy",2,4,3,"Is the best"); //example construction of new robot
        //R1.compileData(root); //example compilation of robot data


        try {
            System.out.println(dataManagement.getScaleClimbing(root,5442));
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
