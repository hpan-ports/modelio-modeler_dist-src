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
                                    

package org.modelio.mda.infra.catalog.update;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.core.runtime.URIUtil;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.widgets.Display;
import org.modelio.app.preferences.ScopedPreferenceStore;
import org.modelio.gproject.module.IModuleHandle;
import org.modelio.gproject.module.catalog.FileModuleStore;
import org.modelio.mda.infra.plugin.MdaInfra;
import org.modelio.vbasic.net.UriPathAccess;

/**
 * This thread checks an update file for the current version of Modelio.
 * If a more recent version of Modelio exists, an information box is opened for the user.
 * Relies on the platform preferences store for the ignore version process.
 * @see ModuleUpdateChecker#checkUpdate() for more infos.
 */
@objid ("3e15f42c-baa4-4599-8eee-470437f7b482")
public class ModuleUpdateChecker extends Thread {
    @objid ("fec8f3ad-9d46-4349-9012-5188bbe8dc28")
    protected FileModuleStore catalog;

    @objid ("f1221919-1bab-4eb7-966b-d41debf7ca52")
    private Collection<IModuleHandle> catalogModules = new ArrayList<>();

    /**
     * Default constructor, initializing a bunch of modules to check updates for.
     * @param catalog
     * @param startedMdacs the modules to check update.
     */
    @objid ("d5844af0-25a7-4eea-acba-4bddef83fbcf")
    public ModuleUpdateChecker(Collection<IModuleHandle> startedMdacs, FileModuleStore catalog) {
        this.catalogModules.addAll(startedMdacs);
        this.catalog = catalog;
    }

    @objid ("6d21557e-7d7b-452e-9f98-b00472ba923a")
    @Override
    public void run() {
        checkUpdate();
    }

    /**
     * Checks the update file for the current version of Modelio.
     * If a more recent version of Modelio exists, an information box is opened for the user, unless this version is currently ignored.
     */
    @objid ("7b4c728f-7e69-43f6-bcc5-a886f2125564")
    private void checkUpdate() {
        Properties updateProperties = initUpdateProperties();
        // No property file means no update available
        if (updateProperties == null) {
            return;
        }
        
        final List<ModuleUpdateDescriptor> modulesToUpdate = new ArrayList<>();
        
        // Get already installed modules
        Map<String, IModuleHandle> latestInstalledModules = new HashMap<>();
        for (IModuleHandle installedModule : this.catalogModules) {
            String key = installedModule.getName();
            
            if (!latestInstalledModules.containsKey(key) || (latestInstalledModules.containsKey(key) && latestInstalledModules.get(key).getVersion().isOlderThan(installedModule.getVersion()))) {                     
                latestInstalledModules.put(installedModule.getName(), installedModule);
            }
        }
        
        // Get all new modules from the catalog update site
        int cpt = 0;
        String keyPrefix;
        do {
            cpt++;
            keyPrefix = updateProperties.getProperty("last" + cpt);
            if (keyPrefix != null) {
                final String label = updateProperties.getProperty(keyPrefix + ".label");
                final String nextVersion = updateProperties.getProperty(keyPrefix + ".next");
                final String url = updateProperties.getProperty(keyPrefix + ".url");
                final String downloadLink = updateProperties.getProperty(keyPrefix + ".file");
        
                // Have we found a newer version?
                if (nextVersion != null && !nextVersion.equals("")) {
                    String name = keyPrefix.substring(0, keyPrefix.indexOf("."));
                    String currentVersion = "";
                    final IModuleHandle latestInstalledModule = latestInstalledModules.get(name);
                    if (latestInstalledModule != null) {
                        currentVersion = latestInstalledModule.getVersion().toString();
                    }
        
                    if (!currentVersion.equals(nextVersion)) {
                        modulesToUpdate.add(new ModuleUpdateDescriptor(label, currentVersion, nextVersion, url, downloadLink));
                    }
                }
            }
        } while (keyPrefix != null);
        
        // New modules found: open the update dialog
        if (modulesToUpdate.size() > 0) {
            ModuleUpdateBrowserDialog dialog = new ModuleUpdateBrowserDialog(Display.getDefault().getActiveShell(), modulesToUpdate, ModuleUpdateChecker.this.catalog);
            dialog.open();
        } else {
            MessageDialog.openInformation (Display.getDefault().getActiveShell(), MdaInfra.I18N.getString("ModuleUpdateBrowserDialog.Title"), MdaInfra.I18N.getString("ModuleUpdateBrowserDialog.NoUpdate"));
        }
    }

    @objid ("c4de2b63-cadc-4450-af4c-3673fa369971")
    private Properties initUpdateProperties() {
        IPreferenceStore prefs = new ScopedPreferenceStore(InstanceScope.INSTANCE, MdaInfra.PLUGIN_ID);
        prefs.setDefault(CatalogUpdatePreferencesPage.CATALOG_UPDATE_SITE, MdaInfra.I18N.getString("ModuleCatalog.Preference.DefaultUpdateSite"));
        
        // Read properties file.
        Properties updateProperties = new Properties();
        
        String serverUpdateSite = prefs.getString(CatalogUpdatePreferencesPage.CATALOG_UPDATE_SITE);
        try (UriPathAccess pathAccess = new UriPathAccess(URIUtil.fromString(serverUpdateSite), null)) {
            final Path path = pathAccess.getPath();
            try (BufferedReader in = new BufferedReader(new FileReader(path.toFile()))) {
                updateProperties.load(in);
                in.close();
            }
        } catch (IOException| URISyntaxException e) {
            MessageDialog.openInformation(Display.getDefault().getActiveShell(), MdaInfra.I18N.getString("ModuleUpdateCheckerError.Title"), MdaInfra.I18N.getMessage("ModuleUpdateCheckerError.Message", serverUpdateSite));
            MdaInfra.LOG.error(e.getMessage());
            return null;
        }
        return updateProperties;
    }

}
