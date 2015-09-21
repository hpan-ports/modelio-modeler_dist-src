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


package org.modelio.app.ui.plugin;

import java.net.Authenticator;
import java.util.ResourceBundle;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.core.net.proxy.IProxyService;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.equinox.log.ExtendedLogService;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.modelio.app.ui.logconfig.LogPreferencesKeys;
import org.modelio.core.help.preferences.ScopedPreferenceStore;
import org.modelio.log.writers.PluginLogger;
import org.modelio.ui.i18n.BundledMessages;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.service.log.LogService;

/**
 * Bundle activator.
 * <p>
 * Also initializes the log level from preferences.
 */
@objid ("002e1cc4-d6b6-1ff2-a7f4-001ec947cd2a")
public class AppUi implements BundleActivator {
    /**
     * The 'app.ui' plugin identifier.
     */
    @objid ("002e2426-d6b6-1ff2-a7f4-001ec947cd2a")
    public static final String PLUGIN_ID = "org.modelio.app.ui";

    @objid ("002e255c-d6b6-1ff2-a7f4-001ec947cd2a")
    private static BundleContext context;

    /**
     * Translated messages service.
     */
    @objid ("002e2b1a-d6b6-1ff2-a7f4-001ec947cd2a")
    public static BundledMessages I18N;

    /**
     * The plugin logger
     */
    @objid ("002e2c46-d6b6-1ff2-a7f4-001ec947cd2a")
    public static PluginLogger LOG;

    /**
     * The preferences.
     */
    @objid ("8c17ef3c-972c-4c60-9806-17bc2990d302")
    public static IPreferenceStore PREFERENCES;

    @objid ("002e225a-d6b6-1ff2-a7f4-001ec947cd2a")
    @Override
    public void start(BundleContext bundleContext) throws Exception {
        context = bundleContext;
        ServiceReference<ExtendedLogService> ref = bundleContext.getServiceReference(ExtendedLogService.class);
        ExtendedLogService service = bundleContext.getService(ref);
        LOG = new PluginLogger(service.getLogger(null));
        I18N = new BundledMessages(LOG, ResourceBundle.getBundle("appui"));
        
        PREFERENCES = new ScopedPreferenceStore(InstanceScope.INSTANCE, AppUi.PLUGIN_ID);
        PREFERENCES.addPropertyChangeListener(new LogLevelPreferenceListener());
        
        // Updates the log level from preferences
        updateLogLevel();
        
        // dump log level to log
        LOG.debug("Logging test: debug enabled.");
        LOG.info("Logging test: info enabled.");
        LOG.warning("Logging test: warning enabled.");
        LOG.error("Logging test: error enabled.");
        
        // Remove Eclipse 3.x URLConnection authenticator
        overrideAuthenticator(bundleContext);
    }

    @objid ("002e26e2-d6b6-1ff2-a7f4-001ec947cd2a")
    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        context = null;
    }

    /**
     * @return the bundle context.
     */
    @objid ("002e276e-d6b6-1ff2-a7f4-001ec947cd2a")
    public static BundleContext getContext() {
        return context;
    }

    /**
     * Updates the log level from the preferences.
     */
    @objid ("6484e866-f678-4f39-b036-bdfa0163c593")
    static void updateLogLevel() {
        final int level = PREFERENCES.getInt(LogPreferencesKeys.LOGLEVEL_PREFKEY);
        
        if (level != 0) {
            if (level != PluginLogger.logLevel) {
                PluginLogger.logLevel = LogService.LOG_INFO;
                LOG.info("Log level updated to level: %d",level);
        
                PluginLogger.logLevel = level;
            }
        
        }
    }

    /**
     * Remove the authenticator set by Eclipse.
     * <p>
     * org.eclipse.ui.internal.net.auth.NetAuthenticator uses the Eclipse 3.x
     * workbench to open an authentication dialog.
     * <p>
     * We don't need it and it does not work because we don't start
     * the Eclipse 3 workbench.
     * @see org.eclipse.ui.internal.net.auth.NetAuthenticator
     * @param bundleContext the bundle context.
     * 
     * 
     * @see java.net.Authenticator 
     */
    @objid ("8f41fc06-4e70-4b23-9ee9-7ce29bef04ed")
    @SuppressWarnings("restriction")
    private void overrideAuthenticator(BundleContext bundleContext) {
        // force org.eclipse.core.net Eclipse plugin to load first
        ServiceReference<IProxyService> sr = bundleContext.getServiceReference(IProxyService.class);
        @SuppressWarnings("unused")
        IProxyService svc = bundleContext.getService(sr);
        bundleContext.ungetService(sr);
        
        // remove its ugly authenticator
        Authenticator.setDefault(null);
    }

    /**
     * Updates the log level from the preferences.
     */
    @objid ("a6b15699-4f7a-4421-b141-41dc0b2e03c9")
    private static final class LogLevelPreferenceListener implements IPropertyChangeListener {
        @objid ("70b89178-1219-44b7-91fa-3aef99a25a46")
        public LogLevelPreferenceListener() {
            super();
        }

        @objid ("4c7e43a5-403a-411f-b10c-8979e9d2a31c")
        @Override
        public void propertyChange(PropertyChangeEvent event) {
            if (LogPreferencesKeys.LOGLEVEL_PREFKEY.equals(event.getProperty())) {
                updateLogLevel();
            }
        }

    }

}
