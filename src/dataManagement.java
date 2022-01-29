import java.io.File;

public class dataManagement {
    public static int startup(String folderName) {
        //creates new file
        File f1 = new File(folderName);
        boolean testForFolder = f1.mkdirs();
        //tests if folder has been created
        if (testForFolder) {
            return 1;
        } else if (f1.exists()) {
            return 2;
        } else {
            return -1;
        }


    }
}

