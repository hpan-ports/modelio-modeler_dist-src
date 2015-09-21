/* 
 * Copyright 2013-2015 Modeliosoft
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


package org.modelio.api.module;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * <p>
 * The mda expert tool can answer questions about dependencies between stereotyped metaclass or elements.
 * </p>
 * @since Modelio 3.4
 */
@objid ("80a74076-5cc9-4ff8-b25e-d33002d0fe7c")
public interface IMdaExpert {
    @objid ("d3a1e7c7-c497-4eca-891d-324f5455cd0d")
    boolean canSource(Stereotype linkStereotype, MClass linkMetaclass, MClass from);

    @objid ("e4446186-5606-47b3-b4a0-86a94d62f062")
    boolean canTarget(Stereotype linkStereotype, MClass linkMetaclass, MClass toMetaclass);

    @objid ("99fecd0b-913b-4ae9-9804-97099509bcf4")
    boolean canLink(Stereotype linkStereotype, MClass linkMetaclass, MObject from, MObject toMetaclass);

    @objid ("e877352f-c147-4f5d-95e0-6073322e667c")
    boolean canSource(Stereotype linkStereotype, MObject linkMetaclass, MObject from);

    @objid ("f3836e07-62fa-421c-aae0-4f274189770e")
    boolean canTarget(Stereotype linkStereotype, MObject linkMetaclass, MObject to);

    @objid ("c4d1bcb2-baf4-4a0b-8eac-40027a38cafc")
    boolean canLink(Stereotype linkStereotype, MClass linkMetaclass, final MClass fromMetaclass, final MClass toMetaclass);

}
