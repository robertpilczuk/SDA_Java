package taasks.file;

import java.io.*;
import java.util.stream.Stream;

public class FileHandler {

    public Stream<String> readFile(String path) {
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            return bufferedReader.lines();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void writeFile(Stream<String> data,String path){
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
           data.forEach(e -> {
               try {
                   bufferedWriter.write(e);
                   bufferedWriter.newLine();
               } catch (IOException ex) {
                   ex.printStackTrace();
               }
           });
           bufferedWriter.flush();
           bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
