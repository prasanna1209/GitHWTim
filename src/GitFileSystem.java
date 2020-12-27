import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * An in-memory filesystem.
 * @author tim
 * @version 1.0
 *
 */
public class GitFileSystem {
    /** The files in the filesystem, stored in order by filename. */
    private SortedSet<GitFileSystemEntry> files = new TreeSet<GitFileSystemEntry>();

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
    public SortedSet<GitFileSystemEntry> getFiles() {
        return Collections.unmodifiableSortedSet(files);
    }

    /**
     * Returns the file entry for the given file.
     * @param filename the file
     * @return the entry, or null
     */
    public GitFileSystemEntry getFile(String filename) {
        for (GitFileSystemEntry entry : files) {
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
        for (Iterator<GitFileSystemEntry> iter = files.iterator(); iter.hasNext();) {
            GitFileSystemEntry entry = iter.next();
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
     * @return the contents of the file, or null if the file isn't present
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

    /**
     * Returns the files in the working directory.  That is, all files
     * whose filenames don't start with .git.  The files must be in sorted
     * order by filename.
     * @return the files in the working directory
     */
    public List<GitFileSystemEntry> getWorkingDirFiles() {
        return null;
    }
}
