package recursion;

import java.io.File;

public class FindFiles {

    private String filePath;

    public FindFiles() {
    }

    public String getFilePath() {
        return filePath;
    }

    public boolean isFilePresent(String path) {
        File file = new File(path);
        File[] files = file.listFiles(e -> e.isFile());

        if (files.length == 0) {
            for (String p : file.list()) {
                isFilePresent(path + "/" + p);
            }
        } else {
            filePath = path;
            return true;
        }
        return false;
    }

}
