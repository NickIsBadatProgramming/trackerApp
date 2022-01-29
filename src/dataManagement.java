import java.io.File;

public class dataManagement {
    public static int createFolder(String folderLocation, String folderName) {
        //creates new file
        File f1 = new File(folderLocation + "/" + folderName);
        boolean testForFolder = f1.mkdirs();
        //tests if folder has been created
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

