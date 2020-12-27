import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * An in-memory filesystem.
 * @author tim
 * @version 1.0
 *
 */
public class FileSystem {
    /** The files in the filesystem. */
    private SortedSet<FileSystemEntry> files = new TreeSet<FileSystemEntry>();

    /**
     * Returns the # of files.
     * @return the # of files
     */
    public int size() {
        return files.size();
    }

    /**
     * Returns the files.
     * @return the files
     */
    public SortedSet<FileSystemEntry> getFiles() {
        return Collections.unmodifiableSortedSet(files);
    }

    /**
     * Returns the file entry for the given file.
     * @param filename the file
     * @return the entry, or null
     */
    public FileSystemEntry getFile(String filename) {
        for (FileSystemEntry entry : files) {
            if (entry.getFilename().equals(filename)) {
                return entry;
            }
        }

        return null;
    }

    /**
     * Returns true if the file exists.
     * @param filename the filename
     * @return true if the file exists
     */
    public boolean exists(String filename) {
        return getFile(filename) != null;
    }

    /**
     * Deletes a file.
     * @param filename the filename
     * @return true if found and deleted
     */
    public boolean remove(String filename) {
        for (Iterator<FileSystemEntry> iter = files.iterator(); iter.hasNext();) {
            FileSystemEntry entry = iter.next();
            if (filename.equals(entry.getFilename())) {
                iter.remove();
                return true;
            }
        }

        return false;
    }

    /**
     * Reads the contents of the file with the given name.
     * @param filename the filename
     * @return the contents of the file
     */
    public String readFileContents(String filename) {
        return null;

    }

    /**
     * Writes the given contents to a file.
     * @param filename the filename
     * @param contents the contents
     */
    public void writeFileContents(String filename, String contents) {
    }

}
