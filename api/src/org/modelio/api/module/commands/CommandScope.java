/*
 * Copyright 2013 Modeliosoft
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *       http://www.apache.org/licenses/LICENSE-2.0
 *        
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */  
                                    

package org.modelio.api.module.commands;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.vcore.smkernel.mapi.MClass;

/**
 * This class encapsulates a scope definition for a command. A scope is composed of a metaclass and a stereotype. Both values are
 * optional but at least one of these two fields must be provided.
 * 
 * @author phv
 */
@objid ("38fa7d52-b2f9-489f-b714-1150b96d4529")
public class CommandScope {
    @objid ("88786c3b-fe6a-4603-a892-3cf93abf11df")
    private MClass metaclass;

    @objid ("e7569083-4548-4904-bac0-501d771c1c8f")
    private Stereotype stereotype;

    @objid ("72afc387-e9c2-4231-9df0-918823be1ff9")
    public CommandScope(MClass metaclass, Stereotype stereotype) {
        assert (metaclass != null || stereotype != null);
        this.metaclass = metaclass;
        this.stereotype = stereotype;
    }

    @objid ("33dfc861-c7d6-419c-a714-2a1187f10c04")
    public MClass getMetaclass() {
        return this.metaclass;
    }

    @objid ("682302b7-461f-4678-bec1-897940e1a006")
    public Stereotype getStereotype() {
        return this.stereotype;
    }

    /**
     * @param e
     * @param inherit - whether or not stereotype inheritance should be considered for the check
     * @return
     */
    @objid ("ae99ea46-f22f-43f3-8930-46de40c1a8e0")
    public boolean isMatching(Element e, boolean inherit) {
        return checkMetaclass(e) && checkStereotype(e, inherit);
    }

    @objid ("e879458e-14e7-498c-87d6-08b19ca6acf9")
    private boolean checkMetaclass(Element e) {
        // No metaclass matches any element
        if (this.metaclass == null)
            return true;
        return e.getMClass().hasBase(this.metaclass);
    }

    @objid ("ad0d9887-38a7-46ff-89d0-304aee334503")
    private boolean checkStereotype(Element e, boolean inherit) {
        // No stereotype matches any element
        if (this.stereotype == null)
            return true;
        
        // Check stereotypes
        if (e instanceof ModelElement) {
            for (Stereotype st : ((ModelElement) e).getExtension()) {
                if (compareStereotype(st, this.stereotype, inherit))
                    return true;
            }
        }
        return false;
    }

    @objid ("e1bf6f02-a636-48e3-bea4-574f01cc37c9")
    private Boolean compareStereotype(Stereotype aStereotype, Stereotype type, boolean inherit) {
        if (aStereotype.equals(type)) {
            return true;
        } else {
            if (aStereotype.getParent() != null && inherit) {
                return compareStereotype(aStereotype.getParent(), type, inherit);
            }
        }
        return false;
    }

}
