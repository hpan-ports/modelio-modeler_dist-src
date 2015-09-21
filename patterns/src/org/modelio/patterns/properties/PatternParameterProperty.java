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
import org.modelio.patterns.model.ProfileUtils.PatternDesignerTagTypes;
import org.modelio.patterns.model.ProfileUtils;
import org.modelio.patterns.plugin.Patterns;

@objid ("36879355-24bb-4646-8a86-64dcc3b7152f")
public class PatternParameterProperty implements IPropertyContent {
    @objid ("a09bca0b-9d14-4075-8e12-f8acb5ff17d2")
    @Override
    public void changeProperty(ModelElement element, int row, String value) {
        try {
            if (row == 1) {
                Stereotype ster = Modelio.getInstance().getModelingSession().getMetamodelExtensions().getStereotype(ProfileUtils.MODULE_NAME, PatternDesignerStereotypes.PATTERNPARAMETER, element.getMClass().getMetamodel().getMClass(ModelElement.class));
                element.getExtension().remove(ster);
            } else if (row == 2) {
                List<String> param = new ArrayList<>();
                param.add(value);
                element.putTagValues(ProfileUtils.MODULE_NAME,PatternDesignerTagTypes.PATTERNPARAMETER_PATTERNPARAMETER_NAME, param);
            } else if (row == 3) {
                List<String> param = new ArrayList<>();
                param.add(value);
                element.putTagValues(ProfileUtils.MODULE_NAME,PatternDesignerTagTypes.PATTERNPARAMETER_PATTERNPARAMETER_LABEL, param);
            }
        } catch (Exception e) {
            Patterns.LOG.debug(e);
        }
    }

    @objid ("6f0693b6-632a-4e40-bb9d-e7e5508520d9")
    @Override
    public void update(ModelElement element, IModulePropertyTable table) {
        table.addProperty(Patterns.I18N.getString("PropertyDefinition.IsPatternParameter"), element.isStereotyped(ProfileUtils.MODULE_NAME,PatternDesignerStereotypes.PATTERNPARAMETER));
        
        String name = element.getTagValue(ProfileUtils.MODULE_NAME, PatternDesignerTagTypes.PATTERNPARAMETER_PATTERNPARAMETER_NAME);
        if (name == null || name.equals("")) {
            name = element.getName();
        }
        table.addProperty(Patterns.I18N.getString("PropertyDefinition.Name"), name);
        
        String label = element.getTagValue(ProfileUtils.MODULE_NAME, PatternDesignerTagTypes.PATTERNPARAMETER_PATTERNPARAMETER_LABEL);
        if (label == null || label.equals("")) {
            label = element.getName();
        }
        
        table.addProperty(Patterns.I18N.getString("PropertyDefinition.Label"), label);
    }

}
