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
        /*NewRobot R1 = new NewRobot(5442,"Mechanical Monarchy",2,4,3,"Is the best",12,6,1,2); //example construction of new robot
        R1.setExtras("has swerve drive,has rotating turret");
        R1.compileData(root); //example compilation of robot data
        NewRobot R2 = new NewRobot(4444,"Castle Raiders",5,2,3,"Has swerve; rotating turret",12,6,1,2); //example construction of new robot
        R2.setExtras("cool logo");
        R2.compileData(root); //example compilation of robot data
        try {
            System.out.println(dataManagement.getData(5,root,4444));
        }
        catch(Exception e) {
            e.printStackTrace();
        }
*/

    }
}
