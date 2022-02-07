
public class NewRobot {
    private String teamName;
    // teamNumber is used to reference all robot data
    private int teamNumber;
    private int scaleClimbing;
    private int scaleShooting;
    private int scaleAutonomous;
    private String comments;
    private boolean isCompiled;
    private double shootingPoints;
    private double climbingPoints;
    private double totalPoints;
    private int wins;
    private int losses;
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

    public int getScaleClimbing() {
        return scaleClimbing;
    }

    public void setScaleClimbing(int scaleClimbing) {
        this.scaleClimbing = scaleClimbing;
    }

    public int getScaleShooting() {
        return scaleShooting;
    }

    public void setScaleShooting(int scaleShooting) {
        this.scaleShooting = scaleShooting;
    }

    public int getScaleAutonomous() {
        return scaleAutonomous;
    }

    public void setScaleAutonomous(int scaleAutonomous) {
        this.scaleAutonomous = scaleAutonomous;
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
    /*----------------------Constructors----------------------*/

    public NewRobot(int teamNumber,String teamName, int scaleClimbing, int scaleShooting, int scaleAutonomous, String comments, double climbingPoints, double shootingPoints, int wins, int losses) {
        this.teamName = teamName;
        this.teamNumber = teamNumber;
        this.scaleClimbing = scaleClimbing;
        this.scaleShooting = scaleShooting;
        this.scaleAutonomous = scaleAutonomous;
        this.comments = comments;
        this.isCompiled = false;
        this.climbingPoints = climbingPoints;
        this.shootingPoints = shootingPoints;
        this.totalPoints = climbingPoints + shootingPoints;
        this.wins = wins;
        this.losses = losses;
    }

    public NewRobot() {
        this(0,null,0,0,0,null,0,0,0,0);
    }
    public NewRobot(int teamNumber) {
        this(teamNumber, null , 0,0,0,null,0,0,0,0);
    }
    public NewRobot(int teamNumber, String teamName) {
        this(teamNumber, teamName, 0, 0, 0,null,0,0,0,0);
    }
    public NewRobot(int teamNumber, String teamName, String comments) {
        this(teamNumber, teamName, 0, 0, 0, comments,0,0,0,0);
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
            //dataManagement.createFolder(root, Integer.toString(this.teamNumber));
            //dataManagement.createFile(root + this.teamNumber, "teamName.txt");
            //dataManagement.writeToFile(root + this.teamNumber, "teamName.txt",this.teamName);
           // dataManagement.createFile(root + this.teamNumber, "scaleClimbing.txt");
           // dataManagement.writeToFile(root + this.teamNumber, "scaleClimbing.txt",Integer.toString(this.scaleClimbing));
           // dataManagement.createFile(root + this.teamNumber, "scaleShooting.txt");
           // dataManagement.writeToFile(root + this.teamNumber, "scaleShooting.txt",Integer.toString(this.scaleShooting));
           // dataManagement.createFile(root + this.teamNumber, "scaleAutonomous.txt");
           // dataManagement.writeToFile(root + this.teamNumber, "scaleAutonomous.txt",Integer.toString(this.scaleAutonomous));
           /* dataManagement.createFile(root + this.teamNumber, "comments.txt");
            dataManagement.writeToFile(root + this.teamNumber, "comments.txt",this.comments);
            dataManagement.createFile(root + this.teamNumber, "shootingPoints.txt");
            dataManagement.writeToFile(root + this.teamNumber, "shootingPoints.txt",Double.toString(shootingPoints));
            dataManagement.createFile(root + this.teamNumber, "climbingPoints.txt");
            dataManagement.writeToFile(root + this.teamNumber, "climbingPoints.txt",Double.toString(climbingPoints));
            dataManagement.createFile(root + this.teamNumber, "wins.txt");
            dataManagement.writeToFile(root + this.teamNumber, "wins.txt",Integer.toString(this.wins));
            dataManagement.createFile(root + this.teamNumber, "losses.txt");
            dataManagement.writeToFile(root + this.teamNumber, "losses.txt",Integer.toString(this.losses));
            this.isCompiled = true;

            */

            dataManagement.createFile(root, this.teamNumber + ".csv");
            if(extras != null) {
                dataManagement.writeToFile(root , this.teamNumber + ".csv", this.teamName + "," + Integer.toString(this.scaleClimbing) + "," + Integer.toString(this.scaleShooting) + "," + Integer.toString(this.scaleAutonomous) + "," + this.comments + "," + Double.toString(this.shootingPoints) + "," + Double.toString(this.climbingPoints) + "," + Integer.toString(this.wins) + "," + Integer.toString(this.losses) + "," + extras );
            } else {
                dataManagement.writeToFile(root , this.teamNumber + "data.csv", this.teamName + "," + Integer.toString(this.scaleClimbing) + "," + Integer.toString(this.scaleShooting) + "," + Integer.toString(this.scaleAutonomous) + "," + this.comments + "," + Double.toString(this.shootingPoints) + "," + Double.toString(this.climbingPoints) + "," + Integer.toString(this.wins) + "," + Integer.toString(this.losses));
            }

        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }


}
