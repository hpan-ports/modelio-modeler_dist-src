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


package org.modelio.patterns.properties;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.Modelio;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.patterns.model.ProfileUtils.PatternDesignerStereotypes;
import org.modelio.patterns.model.ProfileUtils;
import org.modelio.patterns.plugin.Patterns;

@objid ("12788111-9d33-4214-882a-dbb80de31b14")
public class DefaultProperty implements IPropertyContent {
    @objid ("bc55c339-3c74-4a98-a18a-dfaf60f1880a")
    @Override
    public void changeProperty(ModelElement element, int row, String value) {
        if (row == 1) {
            try {
                Stereotype ster  = Modelio.getInstance().getModelingSession().getMetamodelExtensions().getStereotype(ProfileUtils.MODULE_NAME,PatternDesignerStereotypes.PATTERNPARAMETER,element.getMClass());
                element.getExtension().add(ster);
            } catch (Exception e) {
                Patterns.LOG.debug(e);
            }
        } else if (row == 2) {
            setRootStereotype(element);
        }
    }

    @objid ("90668832-8b84-4305-ad1e-cd49c3e9feb0")
    @Override
    public void update(ModelElement element, IModulePropertyTable table) {
        table.addProperty(Patterns.I18N.getString("PropertyDefinition.IsPatternParameter"), element.isStereotyped(ProfileUtils.MODULE_NAME,PatternDesignerStereotypes.PATTERNPARAMETER));
        table.addProperty(Patterns.I18N.getString("PropertyDefinition.IsPatternRoot"), element.isStereotyped(ProfileUtils.MODULE_NAME,PatternDesignerStereotypes.PATTERNROOT));
    }

    @objid ("538f1ad3-8b62-4670-83bd-9a579e86574a")
    private void setRootStereotype(ModelElement element) {
        try {
            List<ModelElement> roots = new ArrayList<>();
            roots.add(element);
        
            ModelElement owner = (ModelElement) element.getCompositionOwner();
            while (owner != null && !owner.isStereotyped(ProfileUtils.MODULE_NAME,PatternDesignerStereotypes.PATTERN)) {
                roots.add(owner);
                owner = (ModelElement) owner.getCompositionOwner();
            }
        
            if (owner != null) {
                for (ModelElement sub : roots) {
                    Stereotype ster  = Modelio.getInstance().getModelingSession().getMetamodelExtensions().getStereotype(ProfileUtils.MODULE_NAME,PatternDesignerStereotypes.PATTERNROOT,sub.getMClass());
                    sub.getExtension().add(ster);
                }
            }
        } catch (Exception e) {
            Patterns.LOG.debug(e);
        }
    }

}
