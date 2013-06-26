/*
 * Copyright 2013 Modeliosoft
 *
 * This file is part of Modelio.
 *
 * Modelio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Modelio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Modelio.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */  
                                    

package org.modelio.vbasic.files;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.text.MessageFormat;
import java.util.Scanner;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vbasic.plugin.CoreUtils;

/**
 * This class consists exclusively of static methods that operate on files,
 * directories, or other types of files.
 * <p>
 * This class uses {@link java.nio.file.Files} that give better diagnostics on
 * failure than {@link java.io.File}.
 * <p>
 * <b>Note:</b> Most of the methods may throw a {@link FileSystemException}.
 * Its {@linkplain FileSystemException#getMessage() getMessage()} method usually does not return a user friendly message.
 * Use {@linkplain #getLocalizedMessage(FileSystemException)} to get a user friendly error message.
 */
@objid ("e9ac6715-8541-11e1-afeb-001ec947ccaf")
public final class FileUtils {
    @objid ("0028e5a6-b977-1ffa-8e11-001ec947cd2a")
    public static long computeSize(Path path) throws IOException, FileSystemException {
        DirectorySizeVisitor dsv = new DirectorySizeVisitor();
        dsv.compute(path);
        return dsv.totalSize;
    }

    /**
     * Copy recursively the given directory to (not into) the destination directory.
     * <p>
     * The destination directory does not have to exist.
     * @param from the directory to copy
     * @param toDir the directory copy path
     * @throws java.io.IOException in case of failure
     * @throws java.nio.file.FileSystemException if a file system exception occurs.
     * <b>Note:</b> {@linkplain FileSystemException#getMessage() getMessage()} usually does not return a user friendly message.
     * Call {@linkplain FileUtils#getLocalizedMessage(FileSystemException)} to get a user friendly error message.
     */
    @objid ("fabda4a4-d023-11e1-bf59-001ec947ccaf")
    public static void copyDirectoryTo(Path from, Path toDir) throws IOException, FileSystemException {
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(from)) {
            for (Path  p: stream){
                Files.copy(p, toDir.resolve(p.getFileName().toString()), LinkOption.NOFOLLOW_LINKS);
                
                if (Files.isDirectory(p,LinkOption.NOFOLLOW_LINKS)) {
                    copyDirectoryTo(p, toDir.resolve(p.getFileName().toString()));
                }
                
            }
        }
        
        //Files.walkFileTree(from, new CopyVisitor(toDir));
    }

    /**
     * Creates a directory by creating all nonexistent parent directories first.
     * Unlike the {@link #createDirectory createDirectory} method, an exception
     * is not thrown if the directory could not be created because it already
     * exists.
     * 
     * <p>
     * The {@code attrs} parameter is optional {@link FileAttribute
     * file-attributes} to set atomically when creating the nonexistent
     * directories. Each file attribute is identified by its
     * {@link FileAttribute#name name}. If more than one attribute of the same
     * name is included in the array then all but the last occurrence is
     * ignored.
     * 
     * <p>
     * If this method fails, then it may do so after creating some, but not all,
     * of the parent directories.
     * @param dir
     * the directory to create
     * @param attrs
     * an optional list of file attributes to set atomically when
     * creating the directory
     * @return the directory
     * @throws UnsupportedOperationException
     * if the array contains an attribute that cannot be set
     * atomically when creating the directory
     * @throws FileAlreadyExistsException
     * if {@code dir} exists but is not a directory <i>(optional
     * specific exception)</i>
     * @throws SecurityException
     * in the case of the default provider, and a security manager
     * is installed, the {@link SecurityManager#checkWrite(String)
     * checkWrite} method is invoked prior to attempting to create a
     * directory and its {@link SecurityManager#checkRead(String)
     * checkRead} is invoked for each parent directory that is
     * checked. If {@code dir} is not an absolute path then its
     * {@link Path#toAbsolutePath toAbsolutePath} may need to be
     * invoked to get its absolute path. This may invoke the
     * security manager's
     * {@link SecurityManager#checkPropertyAccess(String)
     * checkPropertyAccess} method to check access to the system
     * property {@code user.dir}
     * @throws java.io.IOException if an I/O error occurs. call {@linkplain IOException#getMessage()} to
     * get the error cause.
     * @throws java.nio.file.FileSystemException if a file system exception occurs.
     * <b>Note:</b> {@linkplain FileSystemException#getMessage()} usually does not return a user friendly message.
     * Call {@linkplain #getLocalizedMessage(FileSystemException)} to get a user friendly error message.
     */
    @objid ("e9ac671b-8541-11e1-afeb-001ec947ccaf")
    public static void createDir(final File f) throws IOException, FileSystemException {
        Files.createDirectories(Paths.get(f.getPath()));
    }

    /**
     * Deletes the given file or directory recursively.
     * <p>
     * If the path denotes a directory, tries to delete it with all its content.
     * @throws NoSuchFileException
     * if the file does not exist <i>(optional specific
     * exception)</i>
     * @throws DirectoryNotEmptyException
     * if the file is a directory and could not otherwise be deleted
     * because the directory is not empty <i>(optional specific
     * exception)</i>
     * @throws SecurityException
     * In the case of the default provider, and a security manager
     * is installed, the {@link SecurityManager#checkDelete(String)}
     * method is invoked to check delete access to the file
     * @param path the path to the file or directory to delete
     * @throws java.io.IOException if an I/O error occurs. call {@linkplain IOException#getMessage()} to
     * get the error cause.
     * @throws java.nio.file.FileSystemException if a file system exception occurs.
     * <b>Note:</b> {@linkplain FileSystemException#getMessage()} usually does not return a user friendly message.
     * Call {@linkplain #getLocalizedMessage(FileSystemException)} to get a user friendly error message.
     */
    @objid ("00974b68-bdb5-1ffa-8e11-001ec947cd2a")
    public static void delete(final Path path) throws IOException, FileSystemException {
        if (Files.isDirectory(path)) {
            Files.walkFileTree(path, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        
                    Files.delete(file);
        
                    return FileVisitResult.CONTINUE;
                }
        
                @Override
                public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                    if (exc != null)
                        throw exc;
        
                    Files.delete(dir);
        
                    return FileVisitResult.CONTINUE;
                }
            });
        } else {
            Files.deleteIfExists(path);
        }
    }

    /**
     * Deletes the given file or directory recursively.
     * <p>
     * If the path denotes a directory, tries to delete it with all its content.
     * @throws NoSuchFileException
     * if the file does not exist <i>(optional specific
     * exception)</i>
     * @throws DirectoryNotEmptyException
     * if the file is a directory and could not otherwise be deleted
     * because the directory is not empty <i>(optional specific
     * exception)</i>
     * @throws SecurityException
     * In the case of the default provider, and a security manager
     * is installed, the {@link SecurityManager#checkDelete(String)}
     * method is invoked to check delete access to the file
     * @param path the path to the file or directory to delete
     * @throws java.io.IOException if an I/O error occurs. call {@linkplain IOException#getMessage()} to
     * get the error cause.
     * @throws java.nio.file.FileSystemException if a file system exception occurs.
     * <b>Note:</b> {@linkplain FileSystemException#getMessage()} usually does not return a user friendly message.
     * Call {@linkplain #getLocalizedMessage(FileSystemException)} to get a user friendly error message.
     */
    @objid ("e9ac6713-8541-11e1-afeb-001ec947ccaf")
    public static void delete(final String path) throws IOException, FileSystemException {
        delete(Paths.get(path));
    }

    /**
     * Deletes the given file or directory recursively.
     * <p>
     * If the path denotes a directory, tries to delete it with all its content.
     * @param path
     * @throws java.io.IOException if an I/O error occurs. call {@linkplain IOException#getMessage()} to
     * get the error cause.
     * @throws java.nio.file.FileSystemException if a file system exception occurs.
     * <b>Note:</b> {@linkplain FileSystemException#getMessage()} usually does not return a user friendly message.
     * Call {@linkplain #getLocalizedMessage(FileSystemException)} to get a user friendly error message.
     */
    @objid ("e9ac671a-8541-11e1-afeb-001ec947ccaf")
    public static void delete(final File file) throws IOException, FileSystemException {
        delete(file.toPath());
    }

    /**
     * Compute and return a user friendly message from the given FileSystemException.
     * @param e the exception.
     * @return a message, won't be null.
     */
    @objid ("d454fef0-cc12-11e1-a564-001ec947ccaf")
    public static String getLocalizedMessage(FileSystemException e) {
        String pattern = CoreUtils.I18N.getString(e.getClass().getName());
        return MessageFormat.format(pattern, e.getFile(), e.getOtherFile(), e.getReason());
    }

    /**
     * Read the whole content of an input stream and returns it as a string.
     * <p>
     * To be used for small files.
     * @param is an input stream
     * @param charset The encoding type used to convert bytes from the stream into characters.
     * @return the read string
     * @throws java.io.IOException if an I/O error occurs. call {@linkplain IOException#getMessage()} to
     * get the error cause.
     * @throws java.nio.file.FileSystemException if a file system exception occurs.
     * <b>Note:</b> {@linkplain FileSystemException#getMessage()} usually does not return a user friendly message.
     * Call {@linkplain #getLocalizedMessage(FileSystemException)} to get a user friendly error message.
     */
    @objid ("40ad1e4c-87b4-4514-9d05-50754dc3eb15")
    public static String readWhole(InputStream is, String charset) throws IOException, FileSystemException {
        // see http://stackoverflow.com/questions/309424/read-convert-an-inputstream-to-a-string
        try (Scanner s = new java.util.Scanner(is, charset)){
            s.useDelimiter("\\A");
            String ret =  s.hasNext() ? s.next() : "";
            if (s.ioException() != null)
                throw s.ioException();
            return ret;
        }
    }

    /**
     * Read the whole content of a file and returns it as a string.
     * <p>
     * To be used for small files.
     * @param is a file path.
     * @param charset The encoding type used to convert bytes from the stream into characters.
     * @return the read string
     * @throws java.io.IOException if an I/O error occurs. call {@linkplain IOException#getMessage()} to
     * get the error cause.
     * @throws java.nio.file.FileSystemException if a file system exception occurs.
     * <b>Note:</b> {@linkplain FileSystemException#getMessage()} usually does not return a user friendly message.
     * Call {@linkplain #getLocalizedMessage(FileSystemException)} to get a user friendly error message.
     */
    @objid ("f6e65269-ea70-406d-aa88-687082d8f3fd")
    public static String readWhole(Path file, String charset) throws IOException, FileSystemException {
        try (InputStream is = new BufferedInputStream(Files.newInputStream(file))) {
            return readWhole(is, charset);
        }
    }

    /**
     * No instance.
     */
    @objid ("d4576141-cc12-11e1-a564-001ec947ccaf")
    private FileUtils() {
    }

    /**
     * Directory walker visitor that computes the size of a directory.
     * <p>
     * Instantiate one, call {@link #compute(Path)} and then get the value of the
     * counter attributes.
     */
    @objid ("0029072a-b977-1ffa-8e11-001ec947cd2a")
    private static class DirectorySizeVisitor extends SimpleFileVisitor<Path> {
        /**
         * Total size of the directory.
         */
        @objid ("002920b6-b977-1ffa-8e11-001ec947cd2a")
         long totalSize = 0;

        /**
         * Total number of files.
         */
        @objid ("00293ca4-b977-1ffa-8e11-001ec947cd2a")
         long nFiles = 0;

        /**
         * Total number of directories.
         */
        @objid ("00294514-b977-1ffa-8e11-001ec947cd2a")
         long nDirectory = 0;

        @objid ("00294bfe-b977-1ffa-8e11-001ec947cd2a")
        public void compute(Path path) throws IOException {
            this.totalSize = 0;
            this.nFiles = 0;
            this.nDirectory = 0;
            
            Files.walkFileTree(path, this);
        }

        @objid ("00295fae-b977-1ffa-8e11-001ec947cd2a")
        @Override
        public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) throws IOException {
            if (Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS))
                this.nDirectory++;
            if (Files.isRegularFile(path, LinkOption.NOFOLLOW_LINKS)) {
                this.nFiles++;
                this.totalSize += attrs.size();
            }
            return FileVisitResult.CONTINUE;
        }

        @objid ("d37455dc-c9bf-11e1-8052-001ec947ccaf")
        public DirectorySizeVisitor() {
        }

    }

    /**
     * Visitor that copies a directory to another path.
     */
    @objid ("fabda4a9-d023-11e1-bf59-001ec947ccaf")
    private static class CopyVisitor extends SimpleFileVisitor<Path> {
        @objid ("fac006fb-d023-11e1-bf59-001ec947ccaf")
        private Path curDest;

        /**
         * Initialize the visitor.
         * @param from the directory to copy
         * @param to the directory copy path
         */
        @objid ("fac006fc-d023-11e1-bf59-001ec947ccaf")
        public CopyVisitor(Path to) {
            this.curDest = to;
        }

        @objid ("fac00700-d023-11e1-bf59-001ec947ccaf")
        @Override
        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
            Files.copy(dir, getDest(dir), LinkOption.NOFOLLOW_LINKS);
            
            this.curDest = this.curDest.resolve(dir.getFileName().toString());
            return super.preVisitDirectory(dir, attrs);
        }

        @objid ("fac00707-d023-11e1-bf59-001ec947ccaf")
        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            Files.copy(file, getDest(file), LinkOption.NOFOLLOW_LINKS);
            return FileVisitResult.CONTINUE;
        }

        @objid ("fac0070e-d023-11e1-bf59-001ec947ccaf")
        @Override
        public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
            this.curDest = this.curDest.getParent();
            return super.postVisitDirectory(dir, exc);
        }

        @objid ("fac00715-d023-11e1-bf59-001ec947ccaf")
        private Path getDest(Path srcPath) {
            return this.curDest.resolve(srcPath.getFileName().toString());
        }

    }

}
