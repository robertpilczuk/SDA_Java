package examples.files;

import java.io.*;

public class Files {

    public static void main(String[] args) {

        File file = new File("myFile.txt");
        System.out.println("Exists: " + file.exists());
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String readedLine = bufferedReader.readLine();
            System.out.println(readedLine);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
