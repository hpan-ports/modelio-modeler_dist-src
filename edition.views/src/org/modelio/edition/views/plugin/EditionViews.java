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
                                    

package org.modelio.edition.views.plugin;

import java.util.ResourceBundle;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.equinox.log.ExtendedLogService;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.modelio.log.writers.PluginLogger;
import org.modelio.ui.i18n.BundledMessages;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

/**
 * The activator class controls the plug-in life cycle
 */
@objid ("d817d877-d4dd-415b-984e-d90dd38e115b")
public class EditionViews implements BundleActivator {
    @objid ("17531cdf-9c04-470d-9c5a-9b79ef974ea3")
    public static final String PLUGIN_ID = "org.modelio.edition.views";

    @objid ("e79b98ff-17aa-4979-9051-4fa432e7ff81")
    public static BundledMessages I18N;

    @objid ("ede89d98-6c02-4163-970e-aa5f65709343")
    public static PluginLogger LOG;

    @objid ("8edf71ee-33c5-40ba-880d-b941a7fcaf01")
    private static BundleContext context;

    /**
     * Returns an image descriptor for the image file at the given plug-in
     * relative path
     * @param path the path
     * @return the image descriptor
     */
    @objid ("62fa852f-d8c7-4ef9-835f-f4f6b7737169")
    public static ImageDescriptor getImageDescriptor(final String path) {
        return AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, path);
    }

    @objid ("3d30a9e1-ba17-4a94-91b1-279410990efe")
    @Override
    public void start(BundleContext bundleContext) throws Exception {
        context = bundleContext;
        ServiceReference<ExtendedLogService> ref = bundleContext.getServiceReference(ExtendedLogService.class);
        ExtendedLogService service = bundleContext.getService(ref);
        LOG = new PluginLogger(service.getLogger(bundleContext.getBundle(), PLUGIN_ID));
        I18N = new BundledMessages(LOG, ResourceBundle.getBundle("editionviews"));
    }

    @objid ("4199011d-d2ec-4f84-8b4b-33e6f6bfb259")
    public static BundleContext getContext() {
        return context;
    }

    @objid ("fe7d7abd-02c9-4f29-b387-b41e4a303acb")
    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        context = null;
    }

}
