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
                                    

package org.modelio.diagram.persistence;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.ecore.xml.type.internal.DataValue.Base64;

@objid ("2ea6aa65-d397-4e90-8e04-16b46fe61c90")
public class UUBase64Compressor {
    @objid ("63e397fa-f4c9-4808-b20b-c011a013ede1")
    private static final String CHARSET = "UTF-8";

    @objid ("87d0f902-3a0d-4df5-9faf-407ad6ded487")
    public static String compress(String source) {
        try {
            long start = System.currentTimeMillis();
            // System.out.printf("compress: initial size: %d\n",
            // source.length());
        
            byte[] sourceBytes = source.getBytes(CHARSET);
        
            // System.out.printf("compress: initial bytes size: %d\n",
            // sourceBytes.length);
        
            Deflater compressor = new Deflater();
            compressor.setInput(sourceBytes);
            compressor.finish();
        
            byte[] output = new byte[sourceBytes.length];
            int compressedDataLength = compressor.deflate(output, 0, output.length, Deflater.FULL_FLUSH);
            output = Arrays.copyOf(output, compressedDataLength);
        
            compressor.end();
        
            String s = Base64.encode(output);
            long end = System.currentTimeMillis();
            //System.out.printf("compress: ratio %.2f%% %d ms\n", (float) s.length() / source.length() * 100, end - start);
            return s;
        
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return null;
    }

    @objid ("3498ad37-cc6d-49b5-978b-4f6cde7e45cf")
    public static String decompress(String source) {
        try {
            long start = System.currentTimeMillis();
            byte[] sourceBytes = Base64.decode(source);
        
            // Decompress the bytes
            Inflater decompressor = new Inflater();
            decompressor.setInput(sourceBytes, 0, sourceBytes.length);
        
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream(sourceBytes.length);
            byte[] buffer = new byte[1024];
            while (!decompressor.finished()) {
                int count = decompressor.inflate(buffer);
                outputStream.write(buffer, 0, count);
            }
            decompressor.end();
        
            outputStream.close();
            byte[] output = outputStream.toByteArray();
        
            long end = System.currentTimeMillis();
            //System.out.printf("decompress: %d ms\n", end - start);
            // Decode the bytes into a String
            return new String(output, 0, output.length, "UTF-8");
        
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (DataFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    @objid ("23a46cd3-5286-46fe-9118-a19903fc88f5")
    public static void main(String[] args) {
        String xml = "<?xml version=\"1.0\" ?><Object id=\"1\" type=\"org.modelio.diagram.editor.statik.elements.staticdiagram.GmStaticDiagram\"";
        
        for (int i = 0; i < 10; i++) {
            xml = xml + xml;
        }
        String compressed = UUBase64Compressor.compress(xml);
        
        String decompressed = null;
        
        decompressed = UUBase64Compressor.decompress(compressed);
        
        System.out.println(compressed);
        System.out.println(decompressed);
        
        System.out.printf("initial=%d, compressed=%d \n", xml.length(), compressed.length());
        
        System.out.println("result = " + decompressed.compareTo(xml));
    }

}
