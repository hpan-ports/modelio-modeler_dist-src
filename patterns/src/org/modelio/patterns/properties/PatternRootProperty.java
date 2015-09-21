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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.Modelio;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.patterns.model.ProfileUtils.PatternDesignerStereotypes;
import org.modelio.patterns.model.ProfileUtils;
import org.modelio.patterns.plugin.Patterns;

@objid ("e8144402-5ba0-4f78-bdba-1daa5c8858f9")
public class PatternRootProperty implements IPropertyContent {
    @objid ("e472bc6f-d00c-45c8-9f36-78a5f048f13c")
    @Override
    public void changeProperty(ModelElement element, int row, String value) {
        try {
            if (row == 1) {
                Stereotype ster = Modelio.getInstance().getModelingSession().getMetamodelExtensions().getStereotype(ProfileUtils.MODULE_NAME, PatternDesignerStereotypes.PATTERNROOT,element.getMClass().getMetamodel().getMClass(ModelElement.class));
                element.getExtension().remove(ster);
            } else if (row == 2) {
                element.setName(value);
            }
        } catch (Exception e) {
            Patterns.LOG.debug(e);
        }
    }

    @objid ("4043c58a-68a6-4cb8-8261-4dce72b72ec0")
    @Override
    public void update(ModelElement element, IModulePropertyTable table) {
        table.addProperty(Patterns.I18N.getString("PropertyDefinition.IsPatternRoot"), element.isStereotyped(ProfileUtils.MODULE_NAME,PatternDesignerStereotypes.PATTERNROOT));
        table.addProperty(Patterns.I18N.getString("PropertyDefinition.Name"), element.getName());
    }

}
