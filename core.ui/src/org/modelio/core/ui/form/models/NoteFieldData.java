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
                                    

package org.modelio.core.ui.form.models;

import java.util.Collection;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.core.ui.images.ModuleI18NService;
import org.modelio.core.ui.plugin.CoreUi;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.factory.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.vcore.session.api.model.IMObjectFilter;
import org.modelio.vcore.session.api.model.IModel;
import org.modelio.vcore.session.api.transactions.ITransaction;
import org.modelio.vcore.session.impl.CoreSession;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("d4af51c2-e08f-42f6-a678-7fdafcb63826")
public class NoteFieldData implements IFormFieldData {
    @objid ("2418b546-2b5a-4827-8ff9-a4ab566036b6")
    private final String moduleName;

    @objid ("1eda670c-c5e6-4379-bffc-a0267a791f6d")
    private final String noteTypeName;

    @objid ("82a8479d-2bc1-4500-9eb1-cef0bc14dc1b")
    private final ModelElement me;

    @objid ("0a048109-e243-4d01-80b7-ec764c801c79")
    private final NoteType model;

    @objid ("14997616-e068-4733-8d92-873b2ea4391f")
    public NoteFieldData(ModelElement me, String moduleName, String noteTypeName) {
        this.me = me;
        this.moduleName = moduleName;
        this.noteTypeName = noteTypeName;
        this.model = resolveNoteModel(me, moduleName, noteTypeName);
    }

    @objid ("f7796f88-5bf8-42e6-b971-1644388447f5")
    @Override
    public void setValue(Object value) {
        setValue(value.toString());
    }

    @objid ("cf0ae8a3-c7fd-4769-a7c1-e2afa6ef8ce1")
    @Override
    public Object getValue() {
        return this.me.getNoteContent(this.moduleName, this.noteTypeName);
    }

    @objid ("2564b278-71af-45d3-ba6e-0e6093891ae1")
    @Override
    public String getName() {
        return ModuleI18NService.getLabel(this.model);
    }

    @objid ("051ef814-d08f-49b1-acf5-544c2a2932f9")
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

    @objid ("3735f179-7f8c-4bb2-9665-23e94d3341f8")
    @Override
    public void setValue(String value) {
        try (ITransaction t = CoreSession.getSession(this.me).getTransactionSupport().createTransaction("")) {
            this.me.putNoteContent(this.moduleName, this.noteTypeName, value);
            t.commit();
        } catch (final ExtensionNotFoundException e) {
            CoreUi.LOG.error(e);
        }
    }

    @objid ("3573543a-e40a-4477-bea7-c7784bd36155")
    @Override
    public String getValueAsString() {
        final String s =  this.me.getNoteContent(this.moduleName, this.noteTypeName);
        return s!=null ? s : "";
    }

    @objid ("cff648ec-b660-41ff-830a-43ea02925ca5")
    private NoteType resolveNoteModel(final ModelElement me, final String moduleName, final String noteTypeName) {
        final IModel m = CoreSession.getSession(me).getModel();
        
        final Collection<NoteType> candidates = m.findByAtt(NoteType.class, "Name", noteTypeName, new IMObjectFilter() {
            @Override
            public boolean accept(MObject o) {
                return moduleName.equals(((NoteType) o).getModule().getName());
            }
        
        });
        
        // First loop: check strict metaclass equality
        for (final NoteType nType : candidates) {
            if (nType.getOwnerReference() != null) {
                final MClass referenceClass = Metamodel.getMClass(nType.getOwnerReference().getReferencedClassName());
                if (me.getMClass() == referenceClass) {
                    return nType;
                }
            } else if (nType.getOwnerStereotype() != null) {
                final MClass steClass = Metamodel.getMClass(nType.getOwnerStereotype().getBaseClassName());
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
                final MClass referenceClass = Metamodel.getMClass(nType.getOwnerReference().getReferencedClassName());
                if (me.getMClass().hasBase(referenceClass)) {
                    return nType;
                }
            } else if (nType.getOwnerStereotype() != null) {
                final MClass steClass = Metamodel.getMClass(nType.getOwnerStereotype().getBaseClassName());
                if (me.getMClass().hasBase(steClass)) {
                    return nType;
                }
            } else {
                continue;
            }
        }
        return candidates.isEmpty() ? null : candidates.iterator().next();
    }

    @objid ("b9af3194-3f34-486a-ac8a-60cbf1c16e95")
    protected Note getNote() {
        return this.me.getNote(this.moduleName, this.noteTypeName);
    }

}
