/* 
 * Copyright 2013-2015 Modeliosoft
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


package org.modelio.core.ui.images;

import java.net.URL;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Device;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.TextLayout;
import org.modelio.core.ui.plugin.CoreUi;
import org.modelio.ui.CoreFontRegistry;
import org.modelio.vcore.smkernel.mapi.MClass;

/**
 * The MetamodelImageService provides icons and images for metaclasses.
 * The returned icons (or images) only represents the metaclass (no additional
 * decorations).
 * 
 * In some particular cases, a single metaclass can have different icons. In
 * this case, use the 'flavor' parameter to distinguish between them (otherwise
 * use null as 'flavor' value or call the methods without 'flavor' parameter).
 * 
 * @author phv
 */
@objid ("002642e2-5f24-100d-835d-001ec947cd2a")
public class MetamodelImageService {
    @objid ("0093f13e-a43d-100e-835d-001ec947cd2a")
    private static final String IMAGES_PATH = "icons/mmimages/";

    @objid ("00941ee8-a43d-100e-835d-001ec947cd2a")
    private static final String IMAGES_EXTENSION = ".png";

    @objid ("003a53fe-6af9-100d-835d-001ec947cd2a")
    private static final ImageRegistry registry = new ImageRegistry();

    /**
     * Get the icon for a metaclass and a flavor
     * @param metaclass a metaclass
     * @param flavor a flavor to concatenate to the lookup key.
     * @return the found icon or a default unknown icon.
     */
    @objid ("003a5c1e-6af9-100d-835d-001ec947cd2a")
    public static Image getIcon(MClass metaclass, String flavor) {
        final String key = getIconKey(metaclass, flavor);
        Image image = getImageFromKey(key);
        
        if (image == null) {
            return setUnknownImage(key);
        }
        return image;
    }

    /**
     * Get the diagram big image for a metaclass and a flavor.
     * @param metaclass a metaclass
     * @param flavor a flavor to concatenate to the lookup key.
     * @return the found image or null.
     */
    @objid ("003aa3f4-6af9-100d-835d-001ec947cd2a")
    public static Image getImage(MClass metaclass, String flavor) {
        final String key = getImageKey(metaclass, flavor);
        Image image = getImageFromKey(key);
        return image;
    }

    @objid ("003ac9e2-6af9-100d-835d-001ec947cd2a")
    private static String getImageKey(MClass metaclass, String flavor) {
        return getIconKey(metaclass, flavor) + ".image";
    }

    @objid ("003aefee-6af9-100d-835d-001ec947cd2a")
    private static String getIconKey(MClass metaclass, String flavor) {
        final String className = metaclass.getName();
        if (flavor == null || flavor.isEmpty()) {
            return className;
        } else {
            final StringBuilder keyBuffer = new StringBuilder(className.length() + flavor.length()+1);
            keyBuffer.append(className);
            keyBuffer.append(".");
            keyBuffer.append(flavor);
            return keyBuffer.toString();
        }
    }

    @objid ("003b0c4a-6af9-100d-835d-001ec947cd2a")
    private static Image loadImage(String key) {
        ImageDescriptor desc = null;
        Image image = null;
        
        // Get the relative file name
        final StringBuilder path = new StringBuilder(IMAGES_PATH);
        path.append(key.toLowerCase());
        path.append(IMAGES_EXTENSION);
        
        final IPath imagePath = new Path(path.toString());
        URL url = FileLocator.find(CoreUi.getContext().getBundle(), imagePath, null);
        
        if (url != null) {
            desc = ImageDescriptor.createFromURL(url);
            image = desc.createImage();
            assert (image != null);
        }
        return image;
    }

    /**
     * Get the icon for a metaclass.
     * @param metaclassName a metaclass name.
     * @return the metaclass icon.
     */
    @objid ("00526976-030e-106c-bf4f-001ec947cd2a")
    public static Image getIcon(final String metaclassName) {
        Image image = getImageFromKey(metaclassName);
        
        if (image == null) {
            return setUnknownImage(metaclassName);
        }
        return image;
    }

    /**
     * Get the image for a given key.
     * <p>
     * The image is loaded into the registry if not yet done.
     * @param key @return
     */
    @objid ("0052ae04-030e-106c-bf4f-001ec947cd2a")
    private static Image getImageFromKey(final String key) {
        Image image = registry.get(key);
        
        if (image == null) {
            image = loadImage(key);
            if (image != null) {
                registry.put(key, image);
            }
        }
        return image;
    }

    /**
     * Get the icon for a metaclass
     * @param metaclass a metaclass
     * @return the metaclass icon.
     */
    @objid ("42a5c0d5-2fce-4b43-b119-33a571e21d50")
    public static Image getIcon(MClass metaclass) {
        return getIcon(metaclass, null);
    }

    /**
     * Get the diagram big image for a metaclass
     * @param metaclass a metaclass
     * @return the diagram image
     */
    @objid ("1e2b1658-b4c5-488a-ab8c-008d3126d214")
    public static Image getImage(MClass metaclass) {
        return getImage(metaclass, null);
    }

    /**
     * Record the given image key as unknown
     * @param key a key.
     * @return the recorded unknown image to use
     */
    @objid ("6088169d-a502-4224-873f-65a55170495b")
    private static Image setUnknownImage(String key) {
        Image image = getImageFromKey("unknown");
        
        
        if (image == null) {
            CoreUi.LOG.error("MetamodelService: no 'unknown' file.");
        } else {
            CoreUi.LOG.debug("MetamodelService: no icon file for '%s' key.", key);
        
            // Draw in small font the image key
            Device device = image.getDevice();
            Image im2 = new Image(device, image,0);
            TextLayout tl = new TextLayout(device);
            try {
                tl.setAlignment(SWT.CENTER);
                tl.setWidth(im2.getBounds().width);
                tl.setFont(CoreFontRegistry.getModifiedFont(device.getSystemFont(), 0, 0.5f));
                tl.setText(key);
        
                GC gc = new GC(im2);
                try {
                    //gc.setForeground(device.getSystemColor(SWT.COLOR_GRAY));
                    tl.draw(gc, 0, 0);
                } finally {
                    gc.dispose();
                }
            } finally {
                tl.dispose();
            }
        
            registry.put(key, im2);
        }
        return image;
    }

}
