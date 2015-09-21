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
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("fc11f19e-ece5-4c0c-b345-82039b86a68a")
public interface IPropertyContent {
    @objid ("eecb3550-95f2-458e-8d94-6651ea084ca9")
    void changeProperty(ModelElement element, int row, String value);

    @objid ("f93dcf82-f17e-45e6-b4c0-20f7e7cb8676")
    void update(ModelElement element, IModulePropertyTable table);

}
