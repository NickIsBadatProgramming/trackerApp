import org.jetbrains.annotations.NotNull;

import java.io.File;

public class dataManagement {
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
    //public static int createTXT(String fileLocation, String fileName) {
       // if (!checkForSlash(fileLocation)) {
           // fileLocation += "/";
       // }
        //try {
       //     File txtFile = new File(fileLocation + fileName);
       //     if (txtFile.createNewFile()) {
      //          return 1;
      //      } else if (txtFile.exists()) {
             //   return 2;
      //      }
     //   }
     //   catch (IOException e) {
     //       e.printStackTrace();
     //       return -1;
     //   }


    //    return -1;
   // }


    public static boolean checkForSlash(@NotNull String input) {
        String lastChar = input.substring(input.length() - 1);
        if(lastChar == "/" || lastChar == "\\") {
            return true;
        }
        return false;
    }
}

