package examples.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileSaverRunner {

    public static void main(String[] args) {
        File fileToSave = new File("fileSaver.txt");
//        File directories = new File("/files/dir");

        try {
            FileWriter fileWriter = new FileWriter(fileToSave, true);

            fileWriter.append("aaa");

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("my string");
            bufferedWriter.newLine();
            bufferedWriter.append("my string");

            bufferedWriter.flush();

            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
