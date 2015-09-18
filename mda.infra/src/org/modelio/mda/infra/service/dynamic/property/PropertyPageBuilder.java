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
                                    

package org.modelio.mda.infra.service.dynamic.property;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.IModule;
import org.modelio.api.module.commands.ActionLocation;
import org.modelio.api.module.commands.IModuleAction;
import org.modelio.api.module.propertiesPage.IModulePropertyPanel;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Module.Jxbv2Gui.Jxbv2Views.Jxbv2PropertyPage.Jxbv2CommandRef;
import org.modelio.gproject.data.module.jaxbv2.Jxbv2Module.Jxbv2Gui.Jxbv2Views.Jxbv2PropertyPage;
import org.modelio.mda.infra.plugin.MdaInfra;
import org.modelio.mda.infra.service.IRTModule;

@objid ("2fa1ed9e-c721-4129-8053-1594a4d92deb")
public class PropertyPageBuilder {
    @objid ("0b5354cb-688b-4f1d-9b36-2491e4db4647")
    public void registerPropertyPanel(final Jxbv2PropertyPage property, final IRTModule module, Map<String, IModuleAction> commandCache) throws IOException {
        IModulePropertyPanel propertypage = null;
        
        try {
            ClassLoader loader = module.getIModule().getClass().getClassLoader();
            Class<?> commandClass = loader.loadClass(property.getClazz());
            String name = module.getLabel(property.getId());
            String label = module.getLabel(property.getLabel());
            String image = property.getImage();
        
            Constructor<?> ctor = commandClass.getConstructor(IModule.class, String.class, String.class, String.class);
            propertypage = (IModulePropertyPanel) ctor.newInstance(module.getIModule(), name, label, image);
        
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            throw new IOException(MdaInfra.I18N.getMessage("L43_class_not_found", property.getClazz()));
        } catch (ClassCastException e) {
            throw new IOException(MdaInfra.I18N.getMessage("L45_class_cast_exception", property.getClazz()));
        } catch (Exception e) {
            throw new IOException(e.toString());
        }
        
        propertypage.setModule(module.getIModule());
        module.getPropertyPanels().add(propertypage);
        
        // FIXME Design flaw: all commands will appear in all property pages !
        for (Jxbv2CommandRef ref : property.getCommandRef()) {
            IModuleAction action = commandCache.get(ref.getRefid());
            if (action != null) {
                module.registerAction(ActionLocation.property, action);
            } else {
                MdaInfra.LOG.error("Unresolved property view command ref for %s : %s", module.getName(), ref.getRefid());
            }
        }
    }

}
