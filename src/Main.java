public class Main {

    public static void main(String[] args) {
    // uses dataManagement class with startup method to create new folder if one is necessary
    int startup = (dataManagement.createFolder("H:","robotTracker"));
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
   // int txtFileCreation = dataManagement.createTXT("H:/robotTracker","data.txt" );
   // switch(txtFileCreation) {
  //      case -1:
  //          System.out.println("error");
  //          break;
  //      case 1:
  //          System.out.println("file created");
  //          break;
  //      case 2:
  //          System.out.println("file found");
  //          break;
  //  }








    }
}
