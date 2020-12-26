/**
 * Represents a file within Git
 * @author tim
 * @version 1.0
 *
 */
public class GitTreeEntry {
    private String filename;
    private int mode;
    private String hash;

    /**
     * Creates an entry
     * @param filename the filename
     * @param mode the mode
     * @param hash the hash
     */
    public GitTreeEntry(String filename, int mode, String hash) {
        this.filename = filename;
        this.mode = mode;
        this.hash = hash;
    }

    /**
     * Returns the filename
     * @return the filename
     */
    public String getFilename() {
        return filename;
    }

    /**
     * Returns the mode
     * @return the mode
     */
    public int getMode() {
        return mode;
    }

    /**
     * Returns the hash
     * @return the hash
     */
    public String getHash() {
        return hash;
    }

    /**
     * Sets the hash
     * @param hash the hash
     */
    public void setHash(String hash) {
        this.hash = hash;
    }
}