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


package org.modelio.mda.infra.service.impl;

import java.nio.file.Path;
import java.nio.file.Paths;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.modelio.app.core.ModelioEnv;
import org.modelio.gproject.module.IModuleCache;
import org.modelio.gproject.module.IModuleCatalog;
import org.modelio.gproject.module.cache.ModuleRTCache;
import org.modelio.gproject.module.catalog.FileModuleStore;
import org.modelio.mda.infra.plugin.MdaInfra;
import org.modelio.mda.infra.service.IModuleManagementService;
import org.modelio.mda.infra.service.IModuleService;

/**
 * This class is used as a processor (see the plugin.xml file) to make the injection framework instantiate the
 * ModuleService and ModuleManagementService and put them in the context.
 * <p>
 * Also initialize the module cache and put it in the context with {@link IModuleCatalog} as key.
 */
@objid ("aa507ee3-b6c8-471f-836b-6097781f4c45")
public class ModuleServiceInitializer {
    @objid ("6b428c7e-8d37-467f-b2cb-c30c6df89c74")
    @Execute
    private static void execute(IEclipseContext context) {
        context.set(IModuleManagementService.class, ContextInjectionFactory.make(ModuleManagementService.class, context));
        context.set(IModuleService.class, ContextInjectionFactory.make(ModuleService.class, context));
        
        initModuleCache(context);
    }

    /**
     * initialize the module cache and register it in the context as {@link IModuleCatalog}.
     * @param context the context to initialize.
     */
    @objid ("85f146e7-5f64-4268-a140-9cef33804584")
    private static void initModuleCache(IEclipseContext context) {
        final ModelioEnv env = context.get(ModelioEnv.class);
        
        // Instantiate and register the module catalog
        final FileModuleStore stdModuleCatalog = new FileModuleStore(env.getModuleCatalogPath());
        context.set(IModuleCatalog.class, stdModuleCatalog);
        
        // Get the mda.infra preference node, as the module catalog is managed by this plugin
        // Add a preference change listener to update module catalog path.
        MdaInfra.PREFERENCES.addPropertyChangeListener(new IPropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent event) {
                if (ModelioEnv.MODULE_PATH_PREFERENCE.equals(event.getProperty())) {
                    stdModuleCatalog.setCachePath(Paths.get((String) event.getNewValue()));
                }
            }
        });
        
        // Instantiate the module catalog cache
        Path cachePath = MdaInfra.getContext().getBundle().getDataFile("modules_cache").toPath();
        IModuleCache moduleCache = new ModuleRTCache(stdModuleCatalog, cachePath);
        
        MdaInfra.LOG.debug("Module cache created in:"+cachePath);
        
        // Register the module catalog cache as the module catalog
        context.set(IModuleCache.class, moduleCache);
    }

}
