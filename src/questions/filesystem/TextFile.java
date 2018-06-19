package questions.filesystem;

import java.util.Date;

public class TextFile extends File {
    private String ownerName;
    private Date dateCreated;

    public TextFile(long size, Folder folder) {
        super(size, folder);
    }

    public TextFile(long size, Folder folder, String ownerName) {
        super(size, folder);
        this.ownerName = ownerName;
    }

    public TextFile(long size, Folder folder, Date dateCreated) {
        super(size, folder);
        this.dateCreated = dateCreated;
    }

    public TextFile(long size, Folder folder, String ownerName, Date dateCreated) {
        super(size, folder);
        this.ownerName = ownerName;
        this.dateCreated = dateCreated;
    }
}
