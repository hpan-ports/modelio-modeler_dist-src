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
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.patterns.model.ProfileUtils.PatternDesignerTagTypes;
import org.modelio.patterns.model.ProfileUtils;
import org.modelio.patterns.plugin.Patterns;

@objid ("eb6d0df5-85ac-4b35-b81c-7d0dd5ce45e0")
public class PatternProperty implements IPropertyContent {
    @objid ("2a4e8903-6edb-41d9-be38-a78be2ce40db")
    @Override
    public void changeProperty(ModelElement element, int row, String value) {
        try {
            if (row == 1) {
                element.setName(value);
            } else if (row == 2) {
                List<String> param = new ArrayList<>();
                param.add(value);
                element.putTagValues(ProfileUtils.MODULE_NAME, PatternDesignerTagTypes.PATTERN_TEMPLATE_VERSION, param);
            } else if (row == 3) {
                List<String> param = new ArrayList<>();
                param.add(value);
                element.putTagValues(ProfileUtils.MODULE_NAME, PatternDesignerTagTypes.PATTERN_TEMPLATE_IMAGE, param);
            }
        } catch (Exception e) {
            Patterns.LOG.debug(e);
        }
    }

    @objid ("51ee05f9-7467-4ca8-bdd8-bc56e076896c")
    @Override
    public void update(ModelElement element, IModulePropertyTable table) {
        table.addProperty(Patterns.I18N.getString("PropertyDefinition.Name"), element.getName());
        
        String version = element.getTagValue(ProfileUtils.MODULE_NAME, PatternDesignerTagTypes.PATTERN_TEMPLATE_VERSION);
        if (version == null || version.equals("")) {
            version = "1.0.00";
        }
        table.addProperty(Patterns.I18N.getString("PropertyDefinition.Version"), version);
        
        String image = element.getTagValue(ProfileUtils.MODULE_NAME, PatternDesignerTagTypes.PATTERN_TEMPLATE_IMAGE);
        if (image == null) {
            image = "";
        }
        table.addProperty(Patterns.I18N.getString("PropertyDefinition.Image"), image);
    }

}
