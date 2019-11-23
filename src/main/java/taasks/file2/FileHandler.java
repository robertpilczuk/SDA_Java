package taasks.file2;

import java.io.*;
import java.util.stream.Stream;

public class FileHandler {

    public Stream<String> readFile(String path){
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            return bufferedReader.lines();
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }

    public void fileWriter(Stream<String> stream,String path){
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            stream.forEach(e -> {
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
