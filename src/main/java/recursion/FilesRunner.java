package recursion;

public class FilesRunner {

    public static void main(String[] args) {
        FindFiles findFiles = new FindFiles();
        findFiles.isFilePresent("C:\\");

        System.out.println(findFiles.getFilePath());
    }

}
