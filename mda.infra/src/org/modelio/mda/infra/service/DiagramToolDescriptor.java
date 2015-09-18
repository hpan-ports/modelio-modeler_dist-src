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
                                    

package org.modelio.mda.infra.service;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.diagram.tools.IDiagramTool;
import org.modelio.api.modelio.Modelio;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Data structure representing a diagram tool.
 * 
 * @since 2.2.1
 */
@objid ("df460e76-0480-42c5-b69e-115ca9e1bfa5")
public class DiagramToolDescriptor {
    @objid ("44d65cf5-4745-4072-a4a3-437a4c4c7112")
    private String id;

    @objid ("9afe1b82-32b3-4c1c-9f68-36fdd2f75164")
    private IDiagramTool handler;

    /**
     * @return the id
     */
    @objid ("5ab06903-40b3-4898-b54b-de2fe4c74f1e")
    public String getId() {
        return this.id;
    }

    /**
     * @return the metaclass
     */
    @objid ("bcb56348-9989-4011-90d7-6d1174340eeb")
    public Class<? extends MObject> getMetaclass() {
        String mc = this.handler.getParameters().get("metaclass");
        MClass mClass = (mc != null) ? Metamodel.getMClass(mc) : null;
        return (mClass != null) ? Metamodel.getJavaInterface(mClass) : null;
    }

    /**
     * @return the stereotype
     */
    @objid ("79866c0d-8ab4-4dc7-ae06-6495f9cda393")
    public Stereotype getStereotype() {
        String mc = this.handler.getParameters().get("metaclass");
        MClass mClass = (mc != null) ? Metamodel.getMClass(mc) : null;
        
        String st = this.handler.getParameters().get("stereotype");
        return (st != null && !st.isEmpty()) ? Modelio.getInstance().getModelingSession().getMetamodelExtensions()
                        .getStereotype(st, mClass) : null;
    }

    /**
     * @return the dep
     */
    @objid ("fa5007cb-8103-4177-9bba-a6de6774601c")
    public String getDep() {
        return this.handler.getParameters().get("relation");
    }

    /**
     * @return the handler
     */
    @objid ("94af2a2e-58c5-4bde-856e-83f2b76edcec")
    public IDiagramTool getHandler() {
        return this.handler;
    }

    @objid ("8d117a34-d8d5-49e3-bc7f-9129bc81dfe1")
    public DiagramToolDescriptor(String id, IDiagramTool handler) {
        this.id = id;
        this.handler = handler;
    }

}
