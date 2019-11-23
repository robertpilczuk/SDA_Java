package rp;

import java.io.*;

public class rp {

        public static void main(String[] args)  {
            try {
                reWrite();
            }catch (IOException e){
                e.printStackTrace();
            }
            }

    private static void reWrite() throws IOException{
        File file = new File("convert.txt");
        System.out.println("istnieje plik : " + file.exists());
        BufferedReader reader = new BufferedReader(new FileReader("convert.txt"));
        StringBuilder content = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line);
            content.append(System.lineSeparator());
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter("copyOfConvert.txt"));
        writer.write(String.valueOf(content));
        writer.close();

        File fileCopy = new File("CopyOfConvert.txt");
        BufferedReader readerCopy = new BufferedReader(new FileReader("CopyOfConvert.txt"));
        StringBuilder contentCopy = new StringBuilder();
        int counter = 1;
        String lineCopy;
        String whatDoYouWantFromFile = "Volume";
        while ((lineCopy = readerCopy.readLine()) != null) {
            if ((lineCopy.contains(whatDoYouWantFromFile))) {
                counter++;
                contentCopy.append(counter + " " + lineCopy);
                contentCopy.append(System.lineSeparator());
            }
            System.out.println(contentCopy);
            System.out.println("liczba wystąpień " + "\"" + whatDoYouWantFromFile + "\"" + " wynosi: " + counter);
        }
        System.out.println("istnieje kopia pliku : " + fileCopy.exists());


    }


    }


