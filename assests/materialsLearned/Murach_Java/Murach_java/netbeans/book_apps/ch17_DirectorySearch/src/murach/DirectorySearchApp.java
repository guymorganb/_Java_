package murach;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;

public class DirectorySearchApp {
    
    public static void main(String[] args) {
        System.out.println("**** Directory Search ****");
        Scanner sc = new Scanner(System.in);        
        
        System.out.print("Enter directory to search: ");
        String directory = sc.nextLine();
        
        System.out.print("Enter the file to search for: ");
        String target = sc.nextLine();

        ArrayList<File> foundFiles = directorySearch(directory, target);
        if (foundFiles.isEmpty()) {
            System.out.println("NO FILES FOUND.");
        }
        else {
            System.out.println("FILES");
            for (File file : foundFiles) {
                System.out.println(file);
            }
        }
    }    

    public static ArrayList<File> directorySearch(String directory, 
            String target) {
        File dir  = new File(directory);
        File[] dirListing = dir.listFiles();

        var foundFiles = new ArrayList<File>();  // create empty list
        if (dirListing != null) {
            for (File child : dirListing) {
                if (child.isDirectory()) {
                    ArrayList<File> subtreeFoundFiles = directorySearch(
                            child.getAbsolutePath(), target);                    
                    for (File file : subtreeFoundFiles) {
                        foundFiles.add(file);
                    }
                }
                else {  // not a directory - check if it's the target
                    if (child.getName().equals(target)) {
                        foundFiles.add(child);
                    }
                }
            }
        }
        return foundFiles;
    }
}