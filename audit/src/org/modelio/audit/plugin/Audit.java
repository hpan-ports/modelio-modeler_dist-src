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
                                    

package org.modelio.audit.plugin;

import java.util.ResourceBundle;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.equinox.log.ExtendedLogService;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.modelio.log.writers.PluginLogger;
import org.modelio.ui.i18n.BundledMessages;
import org.modelio.vcore.session.api.ICoreSession;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

/**
 * This class represents the unique instance of the plugin
 */
@objid ("90b5b0bd-664d-400b-b94b-4185aff7bccc")
public class Audit implements BundleActivator {
    @objid ("9c8ed8d4-5ecc-42cf-8a14-dbf09b06c1e3")
    public static final String PLUGIN_ID = "org.modelio.audit";

    @objid ("9f4edc6b-7726-4820-93db-b8aa22dca6a0")
    private static BundleContext context;

    @objid ("85041e55-e341-4725-b72c-616ee26631b3")
    public static PluginLogger LOG = null;

    @objid ("89feeae1-9601-4166-addd-fbebd9695feb")
    private ICoreSession modelingSession = null;

    @objid ("6b31adba-bcdb-4c65-b68a-b0d91b841d0c")
    public static BundledMessages I18N = null;

    @objid ("ea254b73-8f31-40ca-b5b1-274fe15ac9e0")
    @Override
    public void start(BundleContext bundleContext) throws Exception {
        context = bundleContext;
        ServiceReference<ExtendedLogService> ref = bundleContext.getServiceReference(ExtendedLogService.class);
        ExtendedLogService service = bundleContext.getService(ref);
        LOG = new PluginLogger(service.getLogger(bundleContext.getBundle(), PLUGIN_ID));
        I18N = new BundledMessages(LOG, ResourceBundle.getBundle("audit"));
    }

    @objid ("653e449b-ff0e-46be-88d4-82148f2c8ed0")
    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        context = null;
    }

    @objid ("0996722b-63f6-47ba-a001-d72aa58c5363")
    public static BundleContext getContext() {
        return context;
    }

    @objid ("57bc3481-a239-4751-b2fe-44599c57d191")
    public static ImageDescriptor getImageDescriptor(final String path) {
        return AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, path);
    }

}
