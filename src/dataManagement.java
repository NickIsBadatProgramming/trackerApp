import java.io.File;

public class dataManagement {
    public static int createFolder(String folderLocation, String folderName) {
        //creates new file

        if(folderLocation != null && folderName != null) {
            String lastChar = folderName.substring(folderName.length() - 1);
            if(lastChar == "/" || lastChar == "\\") {
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
}

