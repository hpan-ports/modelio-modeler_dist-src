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


package org.modelio.patterns.plugin;

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

@objid ("daeade25-ba16-4ae6-9bee-c85ca836bc78")
public class Patterns implements BundleActivator {
    @objid ("bec0d7bb-9220-4a03-82fe-256cea51c785")
    public static final String PLUGIN_ID = "org.modelio.patterns";

    @objid ("ef1e060b-e206-475d-bd5a-9d7f96d045f9")
    public static BundledMessages I18N;

    @objid ("52842c32-0886-4876-9fb1-774938382dd4")
    public static PluginLogger LOG;

    @objid ("66b50181-6ebf-44f3-a726-15b588b58d28")
    private static BundleContext context;

    @objid ("665ff740-b912-485b-83fe-0a294a774d77")
    @Override
    public void start(BundleContext bundleContext) throws Exception {
        context = bundleContext;
        ServiceReference<ExtendedLogService> ref = bundleContext.getServiceReference(ExtendedLogService.class);
        ExtendedLogService service = bundleContext.getService(ref);
        LOG = new PluginLogger(service.getLogger(null));
        I18N = new BundledMessages(LOG, ResourceBundle.getBundle("patterns"));
    }

    @objid ("7201dcca-c4e9-4553-90c4-3542a6589977")
    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        context = null;
    }

    @objid ("134df6b1-1ac2-487e-9e4b-0ace09cc6366")
    public static BundleContext getContext() {
        return context;
    }

    /**
     * Returns an image descriptor for the image file in the plug-in relative path.
     * @param path a path relative to this plugin.
     * @return the image descriptor.
     */
    @objid ("45374a21-8347-4e6a-b3b9-8a5bb97b59aa")
    public static ImageDescriptor getImageDescriptor(final String path) {
        return AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, path);
    }

}
