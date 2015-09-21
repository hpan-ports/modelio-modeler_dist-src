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


package org.modelio.patterns.model;

import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.session.api.ICoreSession;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * This interface represents a runtime pattern, ready to be applied on a model.
 */
@objid ("b97f2cdd-8da3-4b1c-b1a9-7edb420dff31")
public interface IPattern {
    /**
     * Apply a pattern on the model.
     * @param parameters the parameters to configure the pattern from.
     */
    @objid ("ca011653-4be0-4d01-80d2-e0af28bb62af")
    void createModel(MObject root, ICoreSession coreSession, Map<String, Object> patternParameters);

}
