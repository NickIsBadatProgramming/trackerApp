public class NewRobot {
    private String teamName; //
    // teamNumber is used to reference all robot data
    private int teamNumber; //
    private String comments;
    private double shootingPoints; //
    private double climbingPoints; //
    private double autonomousPoints; //
    private int wins; //
    private int losses; //


    /*---------------------- getters and setters---------------------- */


    /*----------------------Constructors----------------------*/

    public NewRobot(int teamNumber,String teamName, String comments, double climbingPoints, double shootingPoints, double autonomousPoints, int wins, int losses) {
        this.teamName = teamName;
        this.teamNumber = teamNumber;

        this.comments = comments;
        this.climbingPoints = climbingPoints;
        this.shootingPoints = shootingPoints;
        this.autonomousPoints = autonomousPoints;
        this.wins = wins;
        this.losses = losses;
    }

    public NewRobot() {
        this(0,null,null,0,0,0,0,0);
    }
    public NewRobot(int teamNumber) {
        this(teamNumber, null ,null,0,0,0,0,0);
    }
    public NewRobot(int teamNumber, String teamName) {
        this(teamNumber, teamName,null,0,0,0,0,0);
    }
    public NewRobot(int teamNumber, String teamName, String comments) {
        this(teamNumber, teamName, comments,0,0,0,0,0);
    }

    public void addWinsAndLosses(int wins, int losses) {
        this.wins += wins;
        this.losses += losses;
    }
    public void resetWinsAndLosses() {
        this.wins = 0;
        this.losses = 0;
    }

    public void addPoints(double shootingPoints, double climbingPoints) {
        this.shootingPoints += shootingPoints;
        this.climbingPoints += climbingPoints;
    }

    /*----------------------Compiler----------------------*/
    //run every time you want to update the file information of the class to the hard drive
    //if you change variables it will not automatically update

    public void compileData(String root) {
        if(!dataManagement.checkForSlash(root)) {
            root += "/";
        }
        try {

            dataManagement.createFile(root, this.teamNumber + ".csv");

            dataManagement.writeToFile(root , this.teamNumber + ".csv", this.teamName + "," + this.comments + "," + this.shootingPoints + "," + this.climbingPoints + "," + this.autonomousPoints + "," + this.wins + "," + this.losses);



        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }



}
