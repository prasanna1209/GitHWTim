
public class FileSystemEntry implements Comparable<FileSystemEntry> {
    /** The filename */
    protected String filename;
    /** The contents */
    protected String contents;

    /**
     * Creates a FileEntry
     * @param filename the filename
     */
    public FileSystemEntry(String filename) {
        this.filename = filename;
    }

    /**
     * Returns the filename
     * @return the filename
     */
    public String getFilename() {
        return filename;
    }

    @Override
    public String toString() {
        return contents;
    }

    /**
     * Sets the file contents
     * @param contents the contents
     */
    public void setContents(String contents) {
        this.contents = contents;
    }

    @Override
    public int compareTo(FileSystemEntry that) {
        return this.filename.compareTo(that.filename);
    }
}