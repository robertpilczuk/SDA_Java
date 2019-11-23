package taasks.file;

public class FileFilterRunner {

    public static void main(String[] args) {
        String fileIn = "convert.txt";
        String fileOut = "filtered.txt";
        String conversionType = "Temperature";

        FilterPredicate predicate = new FilterPredicate(conversionType);
        FileHandler fileHandler = new FileHandler();

        fileHandler.writeFile(fileHandler.readFile(fileIn).filter(predicate),fileOut);



    }

}
