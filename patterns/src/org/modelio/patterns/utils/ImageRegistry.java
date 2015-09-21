/* 
 * Copyright 2013-2015 Modeliosoft - www.modeliosoft.com 
 * 
 * All information contained herein is, and remains the property of Modeliosoft.
 * The intellectual and technical concepts contained herein are proprietary 
 * to Modeliosoft and may be covered by French and Foreign Patents, patents
 * in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Modeliosoft.
 * 
 */


package org.modelio.patterns.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.HashMap;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.widgets.Display;
import org.modelio.patterns.plugin.Patterns;

/**
 * Image registry
 */
@objid ("8f084e1e-4512-4b36-8d04-a7b1a8ac3a9e")
public class ImageRegistry {
    @objid ("32d9af4f-f086-4a3a-bab5-621cf651ba98")
    private static final int MISSING_IMAGE_SIZE = 10;

    /**
     * Internal value.
     */
    @objid ("9b17a198-b46e-4970-91a1-a0764377ffcb")
    protected static final int LAST_CORNER_KEY = 5;

    /**
     * Maps image paths to images.
     */
    @objid ("600c9b4f-7134-4429-9a2c-5aa5870dc568")
    private static Map<String, Image> mImageMap = new HashMap<>();

    /**
     * Returns an {@link Image} encoded by the specified {@link InputStream}.
     * @param stream the {@link InputStream} encoding the image data
     * @return the {@link Image} encoded by the specified input stream
     */
    @objid ("b4dc7238-0bd8-4b78-8be6-28db528a47f8")
    protected static Image getImage(InputStream stream) throws IOException {
        Display display = Display.getDefault();
        ImageData data = new ImageData(stream);
        if (data.transparentPixel > 0) {
            return new Image(display, data, data.getTransparencyMask());
        }
        return new Image(display, data);
    }

    /**
     * Returns an {@link Image} stored in the file at the specified path.
     * @param path the path to the image file
     * @return the {@link Image} stored in the file at the specified path
     */
    @objid ("5f87e31c-0294-4040-b5a4-8cc6aa4a765d")
    public static Image getImage(Path path) {
        Image image = mImageMap.get(path);
        if (image == null) {
            try {
                if (Files.exists(path)) {
                    Path tmpFile = Files.createTempFile("img", "");
                    Files.copy(path, tmpFile, StandardCopyOption.REPLACE_EXISTING);
                    try (FileInputStream is = new FileInputStream(tmpFile.toFile())) {
                        image = getImage(is);
                        is.close();
                    }
                } else {
                    final ImageDescriptor descriptor = Patterns.getImageDescriptor(path.toString());
                    image = descriptor.createImage();
                }
                mImageMap.put(path.toString(), image);
            } catch (Exception e) {
                image = getMissingImage();
                mImageMap.put(path.toString(), image);
            }
        }
        return image;
    }

    /**
     * @return the small {@link Image} that can be used as placeholder for
     * missing image.
     */
    @objid ("0ed7082f-e4dc-4348-a50b-b8c2b53d0868")
    private static Image getMissingImage() {
        Image image = new Image(Display.getDefault(), MISSING_IMAGE_SIZE, MISSING_IMAGE_SIZE);
        GC gc = new GC(image);
        gc.setBackground(ColorConstants.red);
        gc.fillRectangle(0, 0, MISSING_IMAGE_SIZE, MISSING_IMAGE_SIZE);
        gc.dispose();
        return image;
    }

    /**
     * Returns an {@link Image} stored in the file at the specified path.
     * @return the {@link Image} stored in the file at the specified path
     */
    @objid ("2d05a174-9ac1-4534-8e57-da730dd94bed")
    public static Image getImage(String path) {
        Image image = mImageMap.get(path);
        if (image == null) {
            try {
                if (new File(path).exists()) {
                    try (FileInputStream is = new FileInputStream(path)) {
                        image = getImage(is);
                        is.close();
                    }
                } else {
                    final ImageDescriptor descriptor = Patterns.getImageDescriptor(path);
                    image = descriptor.createImage();
                }
                mImageMap.put(path, image);
            } catch (Exception e) {
                image = getMissingImage();
                mImageMap.put(path, image);
            }
        }
        return image;
    }

}
