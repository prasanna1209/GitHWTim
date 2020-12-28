# Git Project Part 1

## Assignment
Two of our goals this semester are to learn how to use Git, and to get some experience working on larger coding projects. We'll be accomplishing both of these goals by building a simplified version of Git using what you've learned in earlier courses, and many of the new things we'll learn this semester.

Git is a version control system.  It stores snapshots of your code at different times, and allows you to look at what changed between versions, and to revert to an earlier version of the code if you make a mistake.  Get started by reading section 1.1-1.3 [here](https://git-scm.com/book/en/v2/Getting-Started-About-Version-Control)

Git is a fairly complicated system, and we’ll be building a greatly simplified version of its functionality.  This week, we'll be building a very basic in-memory filesystem and the basic objects that Git uses to store its data.

## The File System

The in-memory file system will store our files.  We could write our code to use real files, but this will make it much easier to test our code.  The file system will store a collection of file entries, where each entry contains the name of the file, and a String containing the file’s contents.  We can simulate a directory structure by using / in filenames, but the file system itself doesn’t know anything about directories - it just associates a filename (whether it contains a / or not) with the file's contents.  The classes [`GitFileSystem`](../../src/GitFileSystem.java) and [`GitFileSystemEntry`](../../src/GitFileSystemEntry.java) have been provided for you and most of its code is complete.  You will need to fill in the empty methods. The file entries in the file system must be kept sorted by filename, and the `TreeSet` object will do this for us.

There are two areas in the file system that we'll be interested in later – the working directory (the root), and the object store, which will be stored in the .git directory.  Again, the file system doesn’t know about directories, so this just means we’ll have some filenames that start with .git/ and others that don’t.  `getWorkingDirFiles()` is a convenience method that will come in handy later.


```java

public class FileSystem {

    /* Supplied code omitted */

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
```

## The Object Store
There are three types of objects that we will be storing: blobs, trees, and commits.  This week, we'll build the classes that hold the data for these objects.  Next week, we'll work on the details of their file formats. You can read about what they are and how they fit together [here](https://git-scm.com/book/en/v2/Git-Internals-Git-Objects).  This is the kind of thing you'll probably need to read more than once, so read it now and make notes of things that aren't clear.  I will answer questons about them, and next week you'll be ready to implement the file formats.

