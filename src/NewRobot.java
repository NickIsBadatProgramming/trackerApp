
public class NewRobot {
    private String teamName;
    // number is used to reference all robot data
    private int teamNumber;
    private int scaleClimbing;
    private int scaleShooting;
    private int scaleAutonomous;
    private String comments;
    private boolean isCompiled;

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
    /*----------------------Constructors----------------------*/

    public NewRobot(int teamNumber,String teamName, int scaleClimbing, int scaleShooting, int scaleAutonomous, String comments) {
        this.teamName = teamName;
        this.teamNumber = teamNumber;
        this.scaleClimbing = scaleClimbing;
        this.scaleShooting = scaleShooting;
        this.scaleAutonomous = scaleAutonomous;
        this.comments = comments;
        this.isCompiled = false;
    }

    public NewRobot() {
        this(-1,"untitled",0,0,0,"none");
    }
    public NewRobot(int teamNumber) {
        this(teamNumber, "untitled" , 0,0,0,"none");
    }
    public NewRobot(int teamNumber, String teamName) {
        this(teamNumber, teamName, 0, 0, 0,"none");
    }
    public NewRobot(int teamNumber, String teamName, String comments) {
        this(teamNumber, teamName, 0, 0, 0, comments);
    }
    /*----------------------Compiler----------------------*/
    //run every time you want to update the file information of the class to the hard drive
    //if you change variables it will not automatically update

    public void compileData(String root) {
        if(!dataManagement.checkForSlash(root)) {
            root += "/";
        }
        try {
            dataManagement.createFolder(root, Integer.toString(this.teamNumber));
            dataManagement.createFile(root + this.teamNumber, "teamName.txt");
            dataManagement.writeToFile(root + this.teamNumber, "teamName.txt",this.teamName);
            dataManagement.createFile(root + this.teamNumber, "scaleClimbing.txt");
            dataManagement.writeToFile(root + this.teamNumber, "scaleClimbing.txt",Integer.toString(this.scaleClimbing));
            dataManagement.createFile(root + this.teamNumber, "scaleShooting.txt");
            dataManagement.writeToFile(root + this.teamNumber, "scaleShooting.txt",Integer.toString(this.scaleShooting));
            dataManagement.createFile(root + this.teamNumber, "scaleAutonomous.txt");
            dataManagement.writeToFile(root + this.teamNumber, "scaleAutonomous.txt",Integer.toString(this.scaleAutonomous));
            dataManagement.createFile(root + this.teamNumber, "comments.txt");
            dataManagement.writeToFile(root + this.teamNumber, "comments.txt",this.comments);
            this.isCompiled = true;
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }


}
