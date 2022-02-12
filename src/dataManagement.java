import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;




public class dataManagement {

    //makes a new folder
    public static int createFolder(String folderLocation, String folderName) {
        //creates new file

        if(folderLocation != null && folderName != null) {
            if(checkForSlash(folderLocation)) {
                File f1 = new File(folderLocation + folderName);
                boolean testForFolder = f1.mkdirs();
                if (testForFolder) {
                    return 1;
                    //tests if folder exists already
                } else if (f1.exists()) {
                    return 2;
                } else {
                    return -1;
                }
            } else {
                File f1 = new File(folderLocation + "/" + folderName);
                boolean testForFolder = f1.mkdirs();
                if (testForFolder) {
                    return 1;
                    //tests if folder exists already
                } else if (f1.exists()) {
                    return 2;
                } else {
                    return -1;
                }
            }
        }



        return -1;
    }

    //override for only location
    public static int createFolder(String folderLocation) {
        //creates new file

        if(folderLocation != null) {
            if(checkForSlash(folderLocation)) {
                File f1 = new File(folderLocation);
                boolean testForFolder = f1.mkdirs();
                if (testForFolder) {
                    return 1;
                    //tests if folder exists already
                } else if (f1.exists()) {
                    return 2;
                } else {
                    return -1;
                }
            } else {
                folderLocation += "/";
                File f1 = new File(folderLocation);
                boolean testForFolder = f1.mkdirs();
                if (testForFolder) {
                    return 1;
                    //tests if folder exists already
                } else if (f1.exists()) {
                    return 2;
                } else {
                    return -1;
                }
            }
        }



        return -1;
    }



    //makes a new file
    public static int createFile(String fileLocation, String fileName) {
        if (!checkForSlash(fileLocation)) {
            fileLocation += "/";
        }
        try {
            File txtFile = new File(fileLocation + fileName);
            if (txtFile.createNewFile()) {
               return 1;
            } else if (txtFile.exists()) {
                return 2;
            }
       }
        catch (IOException e) {
            e.printStackTrace();
            return -1;
        }


        return -1;
    }



    //checks for the "/" at the end of a string, used for file locations
    public static boolean checkForSlash(String input) {
        String lastChar = input.substring(input.length() - 1);
        return lastChar.equals("/") || lastChar.equals("\\");
    }


    //overwrites the input file
    public static boolean writeToFile(String filePath, String fileName, String data) {
        if (!checkForSlash(filePath)) {
            filePath += "/";
        }
        try {
            FileWriter f1 = new FileWriter(filePath + fileName);
            f1.write(data);
            f1.close();
            return true;
        }
        catch(IOException e) {
            e.printStackTrace();
            return false;
        }

    }

    /*----------------------old getters for file information using robot number----------------------*/
    // use these to grab info about a robot

   /* public static String getComments(String root, int teamNumber) throws Exception {
        if(!checkForSlash(root)) {
            root += "/";
        }
        File folderExists = new File(root + teamNumber);
        if(folderExists.exists()) {
            File txtFileExists = new File(root + teamNumber + "/comments.txt");
            if(txtFileExists.exists()) {
                Scanner myScanner = new Scanner(txtFileExists);
                while(myScanner.hasNextLine()) {
                    return myScanner.nextLine();
                }
                myScanner.close();
            } else {
                throw new Exception("File can't be located");
            }

        } else {
            throw new Exception("Root folder does not exist");
        }
        return "error";
    }

    public static String getTeamName(String root, int teamNumber) throws Exception {
        if(!checkForSlash(root)) {
            root += "/";
        }
        File folderExists = new File(root + teamNumber);
        if(folderExists.exists()) {
            File txtFileExists = new File(root + teamNumber + "/teamName.txt");
            if(txtFileExists.exists()) {
                Scanner myScanner = new Scanner(txtFileExists);
                while(myScanner.hasNextLine()) {
                    return myScanner.nextLine();
                }
                myScanner.close();
            }

        }
        return "error";
    }
    public static int getScaleClimbing(String root, int teamNumber) throws Exception {
        if(!checkForSlash(root)) {
            root += "/";
        }
        File folderExists = new File(root + teamNumber);
        if(folderExists.exists()) {
            File txtFileExists = new File(root + teamNumber + "/scaleClimbing.txt");
            if(txtFileExists.exists()) {
                Scanner myScanner = new Scanner(txtFileExists);
                while(myScanner.hasNextInt()) {
                    return myScanner.nextInt();
                }
                myScanner.close();
            }

        }
        return -1;
    }

    public static int getScaleShooting(String root, int teamNumber) throws Exception {
        if(!checkForSlash(root)) {
            root += "/";
        }
        File folderExists = new File(root + teamNumber);
        if(folderExists.exists()) {
            File txtFileExists = new File(root + teamNumber + "/scaleShooting.txt");
            if(txtFileExists.exists()) {
                Scanner myScanner = new Scanner(txtFileExists);
                while(myScanner.hasNextInt()) {
                    return myScanner.nextInt();
                }
                myScanner.close();
            }

        }
        return -1;
    }


    public static int getScaleAutonomous(String root, int teamNumber) throws Exception {
        if(!checkForSlash(root)) {
            root += "/";
        }
        File folderExists = new File(root + teamNumber);
        if(folderExists.exists()) {
            File txtFileExists = new File(root + teamNumber + "/scaleAutonomous.txt");
            if(txtFileExists.exists()) {
                Scanner myScanner = new Scanner(txtFileExists);
                while(myScanner.hasNextInt()) {
                    return myScanner.nextInt();
                }
                myScanner.close();
            }

        }
        return -1;
    }

    public static double getShootingPoints(String root, int teamNumber) throws Exception {
        if(!checkForSlash(root)) {
            root += "/";
        }
        File folderExists = new File(root + teamNumber);
        if(folderExists.exists()) {
            File txtFileExists = new File(root + teamNumber + "/shootingPoints.txt");
            if(txtFileExists.exists()) {
                Scanner myScanner = new Scanner(txtFileExists);
                while(myScanner.hasNextDouble()) {
                    return myScanner.nextDouble();
                }
                myScanner.close();
            }

        }
        return -1;
    }

    public static double getClimbingPoints(String root, int teamNumber) throws Exception {
        if(!checkForSlash(root)) {
            root += "/";
        }
        File folderExists = new File(root + teamNumber);
        if(folderExists.exists()) {
            File txtFileExists = new File(root + teamNumber + "/climbingPoints.txt");
            if(txtFileExists.exists()) {
                Scanner myScanner = new Scanner(txtFileExists);
                while(myScanner.hasNextDouble()) {
                    return myScanner.nextDouble();
                }
                myScanner.close();
            }

        }
        return -1;
    }

    public static int getWins(String root, int teamNumber) throws Exception {
        if(!checkForSlash(root)) {
            root += "/";
        }
        File folderExists = new File(root + teamNumber);
        if(folderExists.exists()) {
            File txtFileExists = new File(root + teamNumber + "/wins.txt");
            if(txtFileExists.exists()) {
                Scanner myScanner = new Scanner(txtFileExists);
                while(myScanner.hasNextInt()) {
                    return myScanner.nextInt();
                }
                myScanner.close();
            }

        }
        return -1;
    }

    public static int getLosses(String root, int teamNumber) throws Exception {
        if(!checkForSlash(root)) {
            root += "/";
        }
        File folderExists = new File(root + teamNumber);
        if(folderExists.exists()) {
            File txtFileExists = new File(root + teamNumber + "/losses.txt");
            if(txtFileExists.exists()) {
                Scanner myScanner = new Scanner(txtFileExists);
                while(myScanner.hasNextInt()) {
                    return myScanner.nextInt();
                }
                myScanner.close();
            }

        }
        return -1;
    }
*/

    /* ------------------- new getters --------------------- */
    public static String getData(int locationNum, String root, String fileName) throws Exception {
        if (!checkForSlash(root)) {
            root += "/";
        }
        Scanner reader = new Scanner(new File(root + fileName));
        reader.useDelimiter(",");
        int x = 0;
        String out = null;
        while (x <= locationNum) {
            out = reader.next();
            x += 1;
        }
        reader.close();
        return out;
    }

    /* -------------------- misc ------------------- */

    public static String readFile(String fileLocation) throws Exception {
        
        Scanner reader = new Scanner(new File(fileLocation));
        if(reader.hasNext()) {
            String out = reader.next();
            reader.close();
            return out;
        }
        reader.close();
       return null;

    }

    public static int CSVLength(String fileLocation) throws Exception {
        Scanner reader = new Scanner(new File(fileLocation));
        reader.useDelimiter(",");
        int length = 0;
        for(int x = 1; reader.hasNext(); x++) {
            reader.next();
            length = x;
        }
        reader.close();
        return length;
    }



   /* public static void addToAllCSV(int teamNumberAdd) throws Exception {
        String userName = System.getProperty("user.name");
        String root = null;
        try {
            root = dataManagement.readFile("C:/Users/" + userName + "/AppData/Local/Programs/trackerApp/dataLocation.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }

        File allNumsCSV = new File(root + "allNums.csv");

        if(allNumsCSV.exists()) {
            dataManagement.writeToFile(root,"allNums.csv",dataManagement.readFile(root + "allNums.csv") + "," + teamNumberAdd);
        }
        else {
            dataManagement.createFile(root,"allNums.csv");
            dataManagement.writeToFile(root,"allNums.csv",Integer.toString(teamNumberAdd));
        }

    }
    public static void removeFromAllCSV(String teamNumberRemove) throws Exception {
        String userName = System.getProperty("user.name");
        String root = dataManagement.readFile("C:/Users/" + userName + "/AppData/Local/Programs/trackerApp/dataLocation.txt");
        String[] allTeams = new String[dataManagement.CSVLength(root + "/allNums.csv")];
        String newCSVText = "";

        allTeams = dataManagement.getAllTeams();
        for(int i = 0; i <= (dataManagement.CSVLength(root + "/allNums.csv"))-1; i++) {
            if(allTeams[i] != teamNumberRemove) {
                newCSVText = (newCSVText + allTeams[i] + ",");

            }
        }
        dataManagement.writeToFile(root,"allNums.csv",newCSVText);

    } */
    public static String stripExtension (String str) {
        // Handle null case specially.

        if (str == null) return null;

        // Get position of last '.'.

        int pos = str.lastIndexOf(".");

        // If there wasn't any '.' just return the string as is.

        if (pos == -1) return str;

        // Otherwise return the string, up to the dot.

        return str.substring(0, pos);
    }
    public static String[] updateFileList() {
        String userName = System.getProperty("user.name");
        String root = null;
        try {
            root = dataManagement.readFile("C:/Users/" + userName + "/AppData/Local/Programs/trackerApp/dataLocation.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
        File F1 = new File(root);
        return F1.list();
    }
}

