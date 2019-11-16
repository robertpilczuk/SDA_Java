package examples.files;

import java.io.*;

public class FileRunner {

    public static void main(String[] args) {
        File file = new File("convert.txt");

        System.out.println("File exists? : " + file.exists());

        BufferedReader bufferedReader;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String line = bufferedReader.readLine();
            System.out.println(line);
            String[] lineSplit = line.split(",");
            System.out.println(lineSplit[0]);
            System.out.println(lineSplit[1]);
            System.out.println(lineSplit[2]);
            System.out.println(lineSplit[3]);
            System.out.println(lineSplit[4]);
            System.out.println(lineSplit[5]);
            System.out.println(lineSplit[6]);
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        File writeFile = new File("writeFile.txt");

        try {
            FileWriter fileWriter = new FileWriter(writeFile);
            fileWriter.write("This string will be written to file");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
