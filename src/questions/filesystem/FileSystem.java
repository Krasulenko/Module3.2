package questions.filesystem;

public class FileSystem {
    private byte systemCode;
    private long capacityInBytes;
    private String name;
    private int foldersCount;
    private int filesCount;

    public FileSystem(byte systemCode, long capacityInBytes, String name) {
        this.systemCode = systemCode;
        this.capacityInBytes = capacityInBytes;
        this.name = name;
        this.foldersCount = 0;
        this.filesCount = 0;
    }

    public void setFoldersCount(int foldersCount) {
        this.foldersCount++;
    }

    public void setFilesCount(int filesCount) {
        this.filesCount++;
    }
}
