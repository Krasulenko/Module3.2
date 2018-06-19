package questions.filesystem;

public class Main {
    public static void main(String[] args) {
        //byte systemCode = 64;
        System.out.println("0");
        FileSystem fileSystem = new FileSystem((byte) 64, Long.MAX_VALUE, "FileSystemSimple");

        Folder folder = new Folder(fileSystem, "C:/Users/Test/folderName");

        File file = new File(256, folder);

        folder.setFiles(file);

        System.out.println("1");
        //example
        byte c = 100;
        int a = c;
        long b = a;

        TextFile textFile = new TextFile(100, folder);
        TextFile textFile1 = new TextFile(100, folder,"Ann");

        System.out.println("2");

        File file1 = new TextFile(150, folder);
        File file2 = new TextFile(250, folder);

        System.out.println("3");
    }
}
