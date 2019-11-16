package examples.files;

import java.io.File;
import java.io.IOException;

public class Directories {

    public static void main(String[] args) {
//        File dir = new File("src/main/java/examples/files/");
//        System.out.println("is directory ? "+ dir.isDirectory());
//        File[] files = dir.listFiles();
//        for(File f:files){
//            System.out.println(f.getName());
//        }
        File nonExistingDir = new File("non/existing/dir");
        System.out.println("directory exists ? "
                + nonExistingDir.exists());

        nonExistingDir.mkdirs();

        System.out.println("directory exists ? "
                + nonExistingDir.exists());
        String path = "non/existing/dir/";
        String file = "one.txt";

        new File(path).mkdirs();
        File myFile = new File(path + file);
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }


        File nonExistingDir2 = new File("");
//        nonExistingDir2.mkdir();
        try {
            nonExistingDir2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}