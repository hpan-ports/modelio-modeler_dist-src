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
                                    

package org.modelio.gproject.model.api.model;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.vcore.smkernel.mapi.MObject;

// isShell = false isRamc = false
@objid ("005d6c40-d2e8-1097-bcec-001ec947cd2a")
public interface IModelTool {
    @objid ("001983d6-d69c-1098-bcec-001ec947cd2a")
    MObject getSource(MObject aLink);

    @objid ("00199934-d69c-1098-bcec-001ec947cd2a")
    MObject getTarget(MObject aLink);

    @objid ("0019adfc-d69c-1098-bcec-001ec947cd2a")
    void setSource(MObject link, final MObject oldSource, MObject newSource);

    @objid ("0019d5ac-d69c-1098-bcec-001ec947cd2a")
    void setTarget(MObject link, final MObject oldTarget, MObject newTarget);

    @objid ("c54521e6-8ca1-44c6-aa76-8d31eecaa7b6")
    MObject cloneElement(MObject toClone);

    @objid ("b42632be-b91b-4ec2-8495-342fa453b475")
    List<? extends MObject> cloneElements(List<? extends MObject> toClone);

    @objid ("3c947e4f-763a-4b62-9011-a339690596ae")
    MObject copyElement(MObject toCopy, MObject target);

    @objid ("6295cf9b-05e1-49a3-874f-fd2caeeae143")
    List<MObject> copyElements(List<? extends MObject> toCopy, MObject target);

    @objid ("af4f3879-7b75-44fd-8795-5ed7c9b9a1a5")
    void moveElement(MObject toMove, MObject newParent, MObject oldParentHint);

    @objid ("e9b46bb1-ea5c-44d3-9f55-5b6694642c0d")
    void moveElements(List<? extends MObject> toMove, MObject newParent, MObject oldParentHint);

}
