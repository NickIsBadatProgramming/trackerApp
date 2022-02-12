public class NewRobot {
    private String teamName; //
    // teamNumber is used to reference all robot data
    private int teamNumber; //
    private String comments;
    private double shootingPoints; //
    private double climbingPoints; //
    private double autonomousPoints; //
    private double totalPoints;
    private int wins; //
    private int losses; //
    private String extras;


    /*---------------------- getters and setters---------------------- */

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getTeamNumber() {
        return teamNumber;
    }

    public void setTeamNumber(int teamNumber) {
        this.teamNumber = teamNumber;
    }

    public double getShootingPoints() {
        return shootingPoints;
    }

    public void setShootingPoints(double shootingPoints) {
        this.shootingPoints = shootingPoints;
    }

    public double getClimbingPoints() {
        return climbingPoints;
    }

    public void setClimbingPoints(double climbingPoints) {
        this.climbingPoints = climbingPoints;
    }

    public double getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(double totalPoints) {
        this.totalPoints = totalPoints;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }
    public String getExtras() {
        return extras;
    }

    public void setExtras(String extras) {
        this.extras = extras;
    }
    public void addExtras(String extras) {
        this.extras += "," + extras;
    }
    public double getAutonomousPoints() {
        return autonomousPoints;
    }

    public void setAutonomousPoints(double autonomousPoints) {
        this.autonomousPoints = autonomousPoints;
    }
    /*----------------------Constructors----------------------*/

    public NewRobot(int teamNumber,String teamName, String comments, double climbingPoints, double shootingPoints, double autonomousPoints, int wins, int losses) {
        this.teamName = teamName;
        this.teamNumber = teamNumber;

        this.comments = comments;
        this.climbingPoints = climbingPoints;
        this.shootingPoints = shootingPoints;
        this.autonomousPoints = autonomousPoints;
        this.totalPoints = climbingPoints + shootingPoints;
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
            if(extras != null) {
                dataManagement.writeToFile(root , this.teamNumber + ".csv", this.teamName + "," + this.comments + "," + this.shootingPoints + "," + this.climbingPoints + "," + this.autonomousPoints + "," + this.wins + "," + this.losses + "," + extras );
            } else {
                dataManagement.writeToFile(root , this.teamNumber + ".csv", this.teamName + "," + this.comments + "," + this.shootingPoints + "," + this.climbingPoints + "," + this.autonomousPoints + "," + this.wins + "," + this.losses);
            }


        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }



}
