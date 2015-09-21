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


package org.modelio.mda.infra.plugin;

import java.util.ResourceBundle;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.equinox.log.ExtendedLogService;
import org.eclipse.equinox.log.Logger;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.modelio.log.writers.PluginLogger;
import org.modelio.ui.i18n.BundledMessages;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.log.LogService;

/**
 * MdaInfra plugin singleton class.
 */
@objid ("b349f6a5-f11c-11e1-af52-001ec947c8cc")
public class MdaInfra implements BundleActivator {
    /**
     * ID of the MdaInfra plugin.
     */
    @objid ("b5e7eb43-f11c-11e1-af52-001ec947c8cc")
    public static final String PLUGIN_ID = "org.modelio.mda.infra";

    /**
     * The i18n service.
     */
    @objid ("b349f6ab-f11c-11e1-af52-001ec947c8cc")
    public static BundledMessages I18N;

    /**
     * The logger
     */
    @objid ("b349f6ad-f11c-11e1-af52-001ec947c8cc")
    public static MdaInfraLogger LOG = null;

    /**
     * The Eclipse preferences for {@value #PLUGIN_ID}.
     */
    @objid ("c316a1be-dccd-4d1b-95ce-08deaa37ca40")
    public static IPreferenceStore PREFERENCES;

    @objid ("b349f6aa-f11c-11e1-af52-001ec947c8cc")
    private static BundleContext context;

    /**
     * @return the bundle context.
     */
    @objid ("b34c58d3-f11c-11e1-af52-001ec947c8cc")
    public static BundleContext getContext() {
        return context;
    }

    /**
     * Get the image descriptor for an image stored in this plugine.
     * @param path a path relative to the plugin
     * @return the image descriptor.
     */
    @objid ("5b88fa6b-b8b1-4d2b-b2e5-93ff3b845aa8")
    public static ImageDescriptor getImageDescriptor(final String path) {
        return AbstractUIPlugin.imageDescriptorFromPlugin(PLUGIN_ID, path);
    }

    @objid ("b349f6ae-f11c-11e1-af52-001ec947c8cc")
    @Override
    public void start(BundleContext bundleContext) throws Exception {
        context = bundleContext;
        ServiceReference<ExtendedLogService> ref = bundleContext.getServiceReference(ExtendedLogService.class);
        ExtendedLogService service = bundleContext.getService(ref);
        LOG = new MdaInfraLogger(service.getLogger(bundleContext.getBundle(), PLUGIN_ID));
        I18N = new BundledMessages(LOG, ResourceBundle.getBundle("mdainfra"));
        PREFERENCES = new ScopedPreferenceStore(InstanceScope.INSTANCE, PLUGIN_ID);
    }

    @objid ("b349f6b2-f11c-11e1-af52-001ec947c8cc")
    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        context = null;
    }

    /**
     * Logger with indentation.
     * @author cmarin
     */
    @objid ("a66938a4-8ac6-41ef-89a5-277439d3787c")
    public static class MdaInfraLogger extends PluginLogger {
        @objid ("4b02913d-00fb-4811-89a1-5a02793f9279")
        private static String indent = "";

        /**
         * @param logger the eclipse logger.
         */
        @objid ("15744642-d6d3-464a-b02a-58c5bca056a8")
        public MdaInfraLogger(Logger logger) {
            super(logger);
        }

        @objid ("254ca82c-1628-48b3-8d29-679a89cce128")
        @Override
        public void debug(String format, Object... args) {
            if (logLevel >= LogService.LOG_DEBUG) {
                super.debug(indent.concat(String.format(format, args)));
            }
        }

        @objid ("b1237d07-1957-4139-b893-49a2a945264e")
        @Override
        public void debug(String msg) {
            if (logLevel >= LogService.LOG_DEBUG) {
                super.debug(indent.concat(msg));
            }
        }

        /**
         * Remove an indentation for log
         */
        @objid ("f6fca1d8-bbb5-430b-a53b-cfdc250c192a")
        public void dedent() {
            indent = indent.substring(2);
        }

        /**
         * Indent in log
         */
        @objid ("11a54e47-bade-441c-ba41-49b6f1765342")
        public void indent() {
            indent = indent.concat("  ");
        }

        @objid ("e7dfae2f-76dc-423e-a356-16c1fb84467b")
        @Override
        public void info(String msg) {
            super.info(indent.concat(msg));
        }

        @objid ("14d83e87-e147-4fa4-a34b-abb7a00c467b")
        @Override
        public void info(String format, Object... args) {
            if (logLevel >= LogService.LOG_INFO) {
                super.info(indent.concat(String.format(format, args)));
            }
        }

        @objid ("dc3124b6-b512-457d-8032-1981ed51e4ac")
        @Override
        public void warning(String msg) {
            super.warning(indent.concat(msg));
        }

        @objid ("321f19c5-c4e5-4b87-a94d-59325763bffb")
        @Override
        public void warning(String format, Object... args) {
            if (logLevel >= LogService.LOG_WARNING) {
                super.warning(indent.concat(String.format(format, args)));
            }
        }

    }

}
