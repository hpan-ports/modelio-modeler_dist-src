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


package org.modelio.api.ui.form.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.model.ITransaction;
import org.modelio.api.modelio.Modelio;
import org.modelio.api.plugin.Api;
import org.modelio.metamodel.factory.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MMetamodel;

@objid ("e9f0dde4-25c5-40d8-b0b5-616b069085ba")
public class NoteFieldData implements IFormFieldData {
    @objid ("47499fa0-ec7e-4330-805e-c292f8418632")
    private final String moduleName;

    @objid ("2ae33ac7-f57b-4ec5-8297-47889738421d")
    private final String noteTypeName;

    @objid ("3c124840-9335-41e5-ab6a-0c7dc5936ea6")
    private final ModelElement me;

    @objid ("d9dd5f0a-2640-4359-a450-b6272d42dbb0")
    private final NoteType model;

    @objid ("98e77c5a-90a1-44dd-9f6b-f6e0399c2719")
    public NoteFieldData(ModelElement me, String moduleName, String noteTypeName) {
        this.me = me;
        this.moduleName = moduleName;
        this.noteTypeName = noteTypeName;
        this.model = resolveNoteModel(me, moduleName, noteTypeName);
    }

    @objid ("80e4a807-4dc3-42f5-bd9c-62c0a650b788")
    @Override
    public void setValue(Object value) {
        try (ITransaction t = Modelio.getInstance().getModelingSession().createTransaction("")) {
            this.me.putNoteContent(this.moduleName, this.noteTypeName, value.toString());
            t.commit();
        } catch (final ExtensionNotFoundException e) {
            Api.LOG.error(e);
        }
    }

    @objid ("3d5a354a-7b74-40b9-94e4-0be8788144ca")
    @Override
    public Object getValue() {
        final String s = this.me.getNoteContent(this.moduleName, this.noteTypeName);
        return s != null ? s : "";
    }

    @objid ("4b2478df-a23c-4ae2-bc5b-6067d7638692")
    @Override
    public String getName() {
        return this.model.getName();
    }

    @objid ("c21fecb4-e6ce-40e6-901a-333890f5ac9e")
    @Override
    public IFormFieldType getType() {
        return new IFormFieldType() {
                    @Override
                    public boolean isValidValue(String value) {
                        return true;
                    }
        
                    @Override
                    public String getName() {
        
                        final Note note = NoteFieldData.this.getNote();
        
                        if (note != null) {
                            if (isHtmlNote(note)) {
                                return "html";
                            }
                        }
                        return "plain";
                    }
        
                    @Override
                    public Object[] getEnumeratedValues() {
                        return null;
                    }
        
                    private boolean isHtmlNote(Note note) {
                        final String mimeType = note.getMimeType() != null && !note.getMimeType().isEmpty() ? note.getMimeType() : note
                                .getModel().getMimeType();
                        return mimeType.contains("html");
                    }
                };
    }

    @objid ("60352d5e-1133-429b-9910-731b41ec2499")
    private NoteType resolveNoteModel(final ModelElement me, final String moduleName, final String noteTypeName) {
        final MMetamodel metamodel = me.getMClass().getMetamodel();
        
        final Collection<NoteType> elts = Modelio.getInstance().getModelingSession()
                .findByAtt(NoteType.class, "Name", noteTypeName);
        final List<NoteType> candidates = new ArrayList<>();
        
        for (NoteType o : elts) {
            if (moduleName.equals(o.getModule().getName())) {
                candidates.add(o);
            }
        }
        
        // First loop: check strict metaclass equality
        for (final NoteType nType : candidates) {
            if (nType.getOwnerReference() != null) {
                final MClass referenceClass = metamodel.getMClass(nType.getOwnerReference().getReferencedClassName());
                if (me.getMClass() == referenceClass) {
                    return nType;
                }
            } else if (nType.getOwnerStereotype() != null) {
                final MClass steClass = metamodel.getMClass(nType.getOwnerStereotype().getBaseClassName());
                if (me.getMClass() == steClass) {
                    return nType;
                }
            } else {
                continue;
            }
        }
        
        // Second loop: if first one did not give any result, check metaclass compatibility
        for (final NoteType nType : candidates) {
            if (nType.getOwnerReference() != null) {
                final MClass referenceClass = metamodel.getMClass(nType.getOwnerReference().getReferencedClassName());
                if (me.getMClass().hasBase(referenceClass)) {
                    return nType;
                }
            } else if (nType.getOwnerStereotype() != null) {
                final MClass steClass = metamodel.getMClass(nType.getOwnerStereotype().getBaseClassName());
                if (me.getMClass().hasBase(steClass)) {
                    return nType;
                }
            } else {
                continue;
            }
        }
        return candidates.isEmpty() ? null : candidates.iterator().next();
    }

    @objid ("430461c2-4fc5-403d-8b1e-126dad4733fa")
    protected Note getNote() {
        return this.me.getNote(this.moduleName, this.noteTypeName);
    }

}
