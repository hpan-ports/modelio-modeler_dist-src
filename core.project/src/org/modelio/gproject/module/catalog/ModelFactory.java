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
                                    

package org.modelio.gproject.module.catalog;

import java.util.UUID;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.module.jaxbmodel.JxbExterndocumenttype;
import org.modelio.gproject.module.jaxbmodel.JxbModule.JxbProfile.JxbStereotype.Icons.Diagram;
import org.modelio.gproject.module.jaxbmodel.JxbModule.JxbProfile.JxbStereotype.Icons.Explorer;
import org.modelio.gproject.module.jaxbmodel.JxbModule.JxbProfile.JxbStereotype.Icons;
import org.modelio.gproject.module.jaxbmodel.JxbModule.JxbProfile;
import org.modelio.gproject.module.jaxbmodel.JxbModule;
import org.modelio.gproject.module.jaxbmodel.JxbNotetype;
import org.modelio.gproject.module.jaxbmodel.JxbTaggedvalues;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.mda.ModuleParameter;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ExternDocumentType;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.session.api.ICoreSession;
import org.modelio.vcore.session.api.repository.IRepository;
import org.modelio.vcore.session.impl.CoreSession;
import org.modelio.vcore.session.impl.SmFactory;
import org.modelio.vcore.smkernel.meta.SmClass;

/**
 * A MDA elements factory from JAXB elements.
 */
@objid ("2c90b933-f37d-11e1-a3c7-002564c97630")
class ModelFactory {
    @objid ("2c912e64-f37d-11e1-a3c7-002564c97630")
    private final SmFactory model;

    @objid ("2c912e65-f37d-11e1-a3c7-002564c97630")
    private final IRepository repo;

    /**
     * Constructor.
     * @param session the core modeling session.
     * @param repo the repository where elements will be created.
     */
    @objid ("2c915573-f37d-11e1-a3c7-002564c97630")
    public ModelFactory(final ICoreSession session, IRepository repo) {
        this.model = ((CoreSession) session).getSmFactory();
        this.repo = repo;
    }

    @objid ("2c917c83-f37d-11e1-a3c7-002564c97630")
    public ModuleParameter createConfigParam(final org.modelio.gproject.module.jaxbmodel.JxbModule.JxbParameter jaxbelement, final ModuleComponent owner) {
        ModuleParameter element = (ModuleParameter) this.model.createObject(SmClass.getClass(ModuleParameter.class), this.repo,
                UUID.fromString(jaxbelement.getUid()));
        
        element.setName(jaxbelement.getName());
        element.setOwner(owner);
        return element;
    }

    @objid ("2c91a396-f37d-11e1-a3c7-002564c97630")
    public MetaclassReference createMetaClassReferance(final org.modelio.gproject.module.jaxbmodel.JxbModule.JxbProfile.JxbAnonymousStereotype jaxbelement, final Profile owner) {
        MetaclassReference element = (MetaclassReference) this.model.createObject(SmClass.getClass(MetaclassReference.class),
                this.repo, UUID.fromString(jaxbelement.getUid()));
        
        element.setReferencedClassName(jaxbelement.getMetaclass());
        element.setOwnerProfile(owner);
        return element;
    }

    /**
     * Create a module.
     * @param jaxbelement entry in .xml file
     * @return the created module.
     */
    @objid ("2c91f1b4-f37d-11e1-a3c7-002564c97630")
    public ModuleComponent createModule(final JxbModule jaxbelement) {
        ModuleComponent element = (ModuleComponent) this.model.createObject(SmClass.getClass(ModuleComponent.class), this.repo,
                UUID.fromString(jaxbelement.getUid()));
        
        Version version = new Version(jaxbelement.getVersion());
        element.setMajVersion(new Integer(version.getMajorVersion()));
        element.setMinVersion(new Integer(version.getMinorVersion()));
        element.setMinMinVersion(Integer.toString(version.getBuildVersion()) + "."
                + Integer.toString(version.getMetamodelVersion()));
        
        element.setName(jaxbelement.getName());
        element.setJavaClassName(jaxbelement.getClazz());
        return element;
    }

    @objid ("2c9218c4-f37d-11e1-a3c7-002564c97630")
    public NoteType createNoteType(final JxbNotetype jaxbelement, final Element owner) {
        NoteType element = (NoteType) this.model.createObject(SmClass.getClass(NoteType.class), this.repo,
                UUID.fromString(jaxbelement.getUid()));
        
        element.setName(jaxbelement.getName());
        
        if (jaxbelement.getIsHidden() != null) {
            element.setIsHidden(jaxbelement.getIsHidden().equals("true"));
        }
        
        element.setLabelKey(jaxbelement.getLabel() != null ? jaxbelement.getLabel() : jaxbelement.getName());
        
        if (owner instanceof Stereotype) {
            element.setOwnerStereotype((Stereotype) owner);
            if (element.getOwnerReference() != null) {
                element.setOwnerReference(null);
            }
        } else if (owner instanceof MetaclassReference) {
            element.setOwnerReference((MetaclassReference) owner);
            if (element.getOwnerStereotype() != null) {
                element.setOwnerStereotype(null);
            }
        }
        return element;
    }

    @objid ("2c923fd6-f37d-11e1-a3c7-002564c97630")
    public Profile createProfile(final JxbProfile jaxbelement, final ModuleComponent owner) {
        Profile element = (Profile) this.model.createObject(SmClass.getClass(Profile.class), this.repo,
                UUID.fromString(jaxbelement.getUid()));
        
        element.setName(jaxbelement.getName());
        element.setOwnerModule(owner);
        return element;
    }

    /**
     * @param jaxbelement XML node
     * @param owner the project
     * @return the created stereotype.
     */
    @objid ("2c9266e8-f37d-11e1-a3c7-002564c97630")
    public Stereotype createStereotype(final org.modelio.gproject.module.jaxbmodel.JxbModule.JxbProfile.JxbStereotype jaxbelement, final Profile owner) {
        Stereotype element = (Stereotype) this.model.createObject(SmClass.getClass(Stereotype.class), this.repo,
                UUID.fromString(jaxbelement.getUid()));
        
        element.setName(jaxbelement.getName());
        element.setOwner(owner);
        
        for (Object child : jaxbelement.getIconsOrTaggedvaluesOrNotetype()) {
            if (child instanceof Icons) {
                Icons icons = (Icons) child;
        
                for (Object iconsChild : icons.getSmallOrExplorerOrDiagram()) {
                    if (iconsChild instanceof Explorer) {
                        Explorer explorer = (Explorer) iconsChild;
                        if (explorer.getPath() != null) {
                            element.setIcon(explorer.getPath());
                        }
                    } else if (iconsChild instanceof Diagram) {
        
                        Diagram diagram = (Diagram) iconsChild;
                        if (diagram.getPath() != null) {
                            element.setImage(diagram.getPath());
                        }
                    }
                }
            }
        }
        
        if (jaxbelement.getIsHidden() != null) {
            element.setIsHidden(jaxbelement.getIsHidden().equals("true"));
        }
        
        if (jaxbelement.getMetaclass() != null) {
            element.setBaseClassName(jaxbelement.getMetaclass());
        }
        
        element.setLabelKey(jaxbelement.getLabel() != null ? jaxbelement.getLabel() : jaxbelement.getName());
        
        element.setOwner(owner);
        return element;
    }

    @objid ("2c92b506-f37d-11e1-a3c7-002564c97630")
    public TagType createTagType(final JxbTaggedvalues jaxbelement, final Element owner) {
        TagType element = (TagType) this.model.createObject(SmClass.getClass(TagType.class), this.repo,
                UUID.fromString(jaxbelement.getUid()));
        
        element.setName(jaxbelement.getName());
        
        if (jaxbelement.getIsHidden() != null) {
            element.setIsHidden(jaxbelement.getIsHidden().equals("true"));
        }
        
        element.setLabelKey(jaxbelement.getLabel() != null ? jaxbelement.getLabel() : jaxbelement.getName());
        
        if (jaxbelement.getParameterCard() != null) {
            element.setParamNumber(jaxbelement.getParameterCard());
        }
        
        if (jaxbelement.getIsSigned() != null) {
            element.setBelongToPrototype(jaxbelement.getIsSigned().equals("true"));
        }
        
        if (owner instanceof Stereotype) {
            element.setOwnerStereotype((Stereotype) owner);
            if (element.getOwnerReference() != null) {
                element.setOwnerReference(null);
            }
        } else if (owner instanceof MetaclassReference) {
            element.setOwnerReference((MetaclassReference) owner);
            if (element.getOwnerStereotype() != null) {
                element.setOwnerStereotype(null);
            }
        }
        return element;
    }

    @objid ("2c943ba7-f37d-11e1-a3c7-002564c97630")
    public ExternDocumentType createExternalDocumentType(final JxbExterndocumenttype jaxbelement, final Element owner) {
        ExternDocumentType element = (ExternDocumentType) this.model.createObject(SmClass.getClass(ExternDocumentType.class),
                this.repo, UUID.fromString(jaxbelement.getUid()));
        
        element.setName(jaxbelement.getName());
        
        if (jaxbelement.getIsHidden() != null) {
            element.setIsHidden(jaxbelement.getIsHidden().equals("true"));
        }
        element.setLabelKey(jaxbelement.getLabel() != null ? jaxbelement.getLabel() : jaxbelement.getName());
        
        if (owner instanceof Stereotype) {
            element.setOwnerStereotype((Stereotype) owner);
        } else if (owner instanceof MetaclassReference) {
            element.setOwnerReference((MetaclassReference) owner);
        }
        return element;
    }

}
