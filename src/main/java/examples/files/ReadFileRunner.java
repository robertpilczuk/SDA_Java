package examples.files;

import java.io.*;

public class ReadFileRunner {

    public static void main(String[] args) {
        File convertTxt = new File("convert.txt");
        try {
            FileReader fileReader = new FileReader(convertTxt);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            do {
                line = bufferedReader.readLine();
                if (line != null) {
                    System.out.println(line);
                }
            } while (line != null);

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
