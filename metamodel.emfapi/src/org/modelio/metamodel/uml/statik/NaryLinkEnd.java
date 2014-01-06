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
                                    

/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9019              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.uml.statik;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NaryLink;
import org.modelio.metamodel.uml.statik.ProvidedInterface;
import org.modelio.metamodel.uml.statik.RequiredInterface;

@objid ("00749ece-17e8-10a1-88a0-001ec947cd2a")
public interface NaryLinkEnd extends ModelElement {
    @objid ("6f3697b8-859f-4953-9ec5-e23dfd0d21b6")
    boolean isIsOrdered();

    @objid ("95592705-64f3-402f-a5af-6811d2fc2b7a")
    void setIsOrdered(boolean value);

    @objid ("ce028137-50b3-40f4-9ed5-3b09e6a96102")
    boolean isIsUnique();

    @objid ("c3f4281b-8313-4065-9892-45838c12ad23")
    void setIsUnique(boolean value);

    @objid ("052af170-499a-49f3-a8b1-039db4ea005a")
    String getMultiplicityMax();

    @objid ("7bab9307-97fe-4601-aa32-90bd227f7d63")
    void setMultiplicityMax(String value);

    @objid ("220b618e-1ae0-4a03-803c-94d27f6da1fc")
    String getMultiplicityMin();

    @objid ("e1fa6fae-0fa6-418a-bd28-8d3a72b7213a")
    void setMultiplicityMin(String value);

    @objid ("c4350f6b-7cfb-4816-893f-4f7535bd4c68")
    Instance getSource();

    @objid ("ea4f655e-5ffc-4886-b91e-6a23b91c7fc5")
    void setSource(Instance value);

    @objid ("616ee711-fad3-4f53-a80f-902e004b3808")
    NaryLink getNaryLink();

    @objid ("dc1b155c-d5cd-4148-8e94-7fab04a54793")
    void setNaryLink(NaryLink value);

    @objid ("976f5343-7af9-4268-9bb7-386ac695ec69")
    RequiredInterface getConsumer();

    @objid ("0eb1e8b3-a00d-4352-930a-8114960a0ab6")
    void setConsumer(RequiredInterface value);

    @objid ("6fc6667b-0f72-4fb3-b218-147b03e6c50d")
    ProvidedInterface getProvider();

    @objid ("2f4c44dd-fc41-4395-8764-e858f58d1ca4")
    void setProvider(ProvidedInterface value);

}
