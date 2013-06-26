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
                                    

package org.modelio.vstore.exml.resource;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * Service class that computes a blob path.
 * <p>
 * The blobs directory has 255 sub directories
 */
@objid ("8e2a2249-b40a-43a7-906f-1ebe767c713b")
public class BlobGeometry {
    @objid ("560c5488-efcd-42c5-b3c9-af9f877fe9e2")
    private static final char escape = '%';

    /**
     * Compute the path of a blob file.
     * @param blobKey the blob key
     * @return the blob file path relative to the repository path.
     */
    @objid ("dce35626-eed2-4881-8156-14ffb5bb9b20")
    public static String getBlobPath(String blobKey) {
        StringBuilder sb = new StringBuilder(200);
        sb.append(IExmlRepositoryGeometry.BLOBS_DIRNAME);
        sb.append('/');
        sb.append(String.format("%02x", blobKey.hashCode() % 255));
        sb.append('/');
        encodeKey(blobKey, sb);
        sb.append(IExmlRepositoryGeometry.EXT_BLOB);
        return sb.toString();
    }

    /**
     * Encode a blob key to a legal file name.
     * @param s a blob key
     * @return the encoded blob key
     * @author http://stackoverflow.com/questions/1184176/how-can-i-safely-encode-a-string-in-java-to-use-as-a-filename
     */
    @objid ("a693b049-af98-4092-aa26-5bb20ad91102")
    private static String encodeKey(String s, StringBuilder sb) {
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (ch < ' ' || ch >= 0x7F 
                || ch == '/' || ch=='\\' // add other illegal chars
                || (ch == '.' && i == 0) // we don't want to collide with "." or ".."!
                || ch == escape) {
                sb.append(escape);
                if (ch < 0x10) {
                    sb.append('0');
                }
                sb.append(Integer.toHexString(ch));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    /**
     * Decode the blob key from the file name.
     * @param fileName a file name without the .blob extension
     * @return the blob key
     */
    @objid ("36066993-f543-4873-9a07-9c8c382ed607")
    public static String decodeKey(String fileName) {
        int len  = fileName.length();
        StringBuilder out = new StringBuilder(len);
        char[] hex = new char[2];
        
        for (int i=0; i<len; ++i) {
            char ch = fileName.charAt(i);
            if ( ch == escape) {
                hex[1] = fileName.charAt(++i);
                hex[2] = fileName.charAt(++i);
                ch = (char) Integer.parseInt(new String(hex), 16);
            } 
            out.append(ch);
        }
        return out.toString();
    }

}
