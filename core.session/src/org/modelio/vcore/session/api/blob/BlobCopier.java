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
                                    

package org.modelio.vcore.session.api.blob;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.FileSystemException;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vbasic.files.FileUtils;
import org.modelio.vcore.session.api.repository.IRepository;

/**
 * Helper class to copy blobs.
 */
@objid ("c0edf6e3-6bc5-422a-9efc-dce081833588")
public class BlobCopier {
    /**
     * Copy a blob from a repository to another (or the same).
     * <p>
     * Reports failures to the destination storage error support.
     * @param blobKey the source blob key.
     * @param from the source repository
     * @param to the destination blob identification
     * @param toRepo the destination repository
     * @return <code>true</code> if the copy was successfull, <code>false</code> in case of I/O failure.
     */
    @objid ("2ba32157-a04a-4493-ad8c-e11b338462c8")
    public static boolean copy(String blobKey, IRepository from, IBlobInfo to, IRepository toRepo) {
        try (InputStream in = from.readBlob(blobKey);
                OutputStream out = toRepo.writeBlob(to)) {
            
            byte[] buffer = new byte[1024 * 4];
            int len = in.read(buffer);
            while (len != -1) {
                out.write(buffer, 0, len);
                len = in.read(buffer);
            }
            return true;
        } catch (IOException e) {
            // Report failure to the destination storage error support
            String err;
            if (e instanceof FileSystemException)
                err = FileUtils.getLocalizedMessage((FileSystemException)e);
            else
                err = e.getLocalizedMessage();
            String msg = "Cannot copy '"+blobKey+"' from "+from+" to "+to+" in "+toRepo+": "+err;
            
            toRepo.getErrorSupport().fireWarning(new IOException(msg, e));
            return false;
        }
    }

}
