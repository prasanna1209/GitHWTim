
public class FileSystemEntry implements Comparable<FileSystemEntry> {
    /** The filename. */
    private String filename;
    /** The contents. */
    private String contents;

    /**
     * Creates a FileEntry.
     * @param filename the filename
     * @param contents the contents
     */
    public FileSystemEntry(String filename, String contents) {
        this.filename = filename;
        this.contents = contents;
    }

    /**
     * Returns the filename.
     * @return the filename
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Returns the contents.
     * @return the contents
     */
    public String getContents() {
        return contents;
    }

    /**
     * Sets the file contents.
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
