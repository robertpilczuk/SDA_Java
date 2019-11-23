package taasks.file2;

import java.util.stream.Stream;

public class FileRunner {

    public static void main(String[] args) {
        String fileIn = "convert.txt";
        String fileOut = "filtered.txt";
        String conversionType = "Temperature";

        FileHandler fileHandler = new FileHandler();
        ConvertPredicate predicate = new ConvertPredicate(conversionType);

        Stream<String> stream = fileHandler.readFile(fileIn)
                .filter(predicate);

        fileHandler.fileWriter(stream, fileOut);
    }

}
