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
                                    

package org.modelio.metamodel.factory;

import java.util.HashMap;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.Metamodel;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.vcore.smkernel.mapi.MClass;

/**
 * Metamodel extension request cache.
 * <p>
 * Used to cache requests to find a single note type, tag type, or stereotype.
 * <p>
 * Extensions that are not valid anymore are removed when found.
 * Extensions have to be added to this cache manually.
 */
@objid ("7c7c2303-adda-4186-89e3-605593be7fc3")
public class ExtensionCache {
    @objid ("9864d92d-6497-429b-8605-da7055522876")
    private Map<Integer, NoteType> nmap = new HashMap<>();

    @objid ("93087623-0d01-4113-8919-58118c5544e3")
    private Map<Integer, TagType> tmap = new HashMap<>();

    @objid ("47393bab-a42c-40fa-80ee-46ffc43eeecd")
    private Map<Integer, Stereotype> smap = new HashMap<>();

    /**
     * Compute a hash key.
     * @param moduleName a module spec
     * @param name the note/tag/stereotype name
     * @param metaclass the metaclass
     * @return the hash key
     */
    @objid ("dbbc62d1-b5d6-4d17-97df-9ca9d9979bb2")
    private static int getKey(String moduleName, String name, MClass metaclass) {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((metaclass == null) ? 0 : metaclass.hashCode());
        result = prime * result + ((moduleName == null) ? 0 : moduleName.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    /**
     * Add a note type to the cache
     * @param moduleName the module name
     * @param metaclass the metaclass to register
     * @param element the note type
     */
    @objid ("d0b5dae1-543a-40f3-a849-bc6a347b57b4")
    public void add(String moduleName, MClass metaclass, NoteType element) {
        int key = getKey(moduleName, element.getName(), metaclass);
        this.nmap.put(key, element);
    }

    /**
     * Add a tag type to the cache
     * @param moduleName the module name
     * @param metaclass the metaclass to register
     * @param element the tag type
     */
    @objid ("5e4a8a1d-4256-4088-8ca3-e54537d051af")
    public void add(String moduleName, MClass metaclass, TagType element) {
        int key = getKey(moduleName, element.getName(), metaclass);
        this.tmap.put(key, element);
    }

    /**
     * Add a stereotype to the cache
     * @param moduleName the module name
     * @param metaclass the metaclass to register
     * @param element the stereotype
     */
    @objid ("a74d5c28-eb66-486b-bdd0-23fc577d308a")
    public void add(String moduleName, MClass metaclass, Stereotype element) {
        int key = getKey(moduleName, element.getName(), metaclass);
        this.smap.put(key, element);
    }

    /**
     * Find a note type.
     * @param moduleName the module name
     * @param name the note type name
     * @param metaclass the metaclass
     * @return the found element or <code>null</code>.
     */
    @objid ("af7abd2e-641c-40f8-a564-8254a4f755b5")
    public NoteType getNoteType(String moduleName, String name, MClass metaclass) {
        int key = getKey(moduleName, name, metaclass);
        
        NoteType n = this.nmap.get(key);
        
        if (n != null) {
            final ModuleComponent module = n.getModule();
            final MClass foundMClass = getBaseClass(n.getOwnerReference(), n.getOwnerStereotype());
            if (name.equals(n.getName()) 
                    && module != null 
                    && foundMClass != null
                    && moduleName.equals(module.getName())
                    && metaclass.hasBase(foundMClass))
                return n;
            
            this.nmap.remove(key);
        }
        return null;
    }

    /**
     * Find a tag type.
     * @param moduleName the module name
     * @param name the note type name
     * @param metaclass the metaclass
     * @return the found element or <code>null</code>.
     */
    @objid ("a1308e9f-a178-4550-ad72-2b077077621e")
    public TagType getTagType(String moduleName, String name, MClass metaclass) {
        int key = getKey(moduleName, name, metaclass);
        
        TagType n = this.tmap.get(key);
        
        if (n != null) {
            final ModuleComponent module = n.getModule();
            final MClass foundMClass = getBaseClass(n.getOwnerReference(), n.getOwnerStereotype());
            if (name.equals(n.getName()) 
                    && module != null 
                    && foundMClass != null
                    && moduleName.equals(module.getName())
                    && metaclass.hasBase(foundMClass))
                return n;
            
            this.tmap.remove(key);
        }
        return null;
    }

    /**
     * Find a stereotype.
     * @param moduleName the module name
     * @param name the note type name
     * @param metaclass the metaclass
     * @return the found element or <code>null</code>.
     */
    @objid ("8a88ff79-d7c7-4fc9-8b19-0b2975fb0b0d")
    public Stereotype getStereotype(String moduleName, String name, MClass metaclass) {
        int key = getKey(moduleName, name, metaclass);
        
        
        Stereotype n = this.smap.get(key);
        
        if (n != null) {
            final ModuleComponent module = n.getModule();
            final MClass foundMClass = getBaseClass(n.getBaseClassName());
            if (name.equals(n.getName()) 
                    && module != null 
                    && foundMClass != null
                    && moduleName.equals(module.getName())
                    && metaclass.hasBase(foundMClass))
                return n;
        
            this.smap.remove(key);
        }
        return null;
    }

    @objid ("619e8869-130c-4b40-b617-678b4323f320")
    private static MClass getBaseClass(MetaclassReference classRef, Stereotype ste) {
        if (ste != null) {
            return getBaseClass(ste.getBaseClassName());
        } else if (classRef != null) {
            return getBaseClass(classRef.getReferencedClassName());
        }
        return null;
    }

    @objid ("b18b0f08-b119-4d2d-b021-33bee0b9c23d")
    private static MClass getBaseClass(String baseName) {
        return Metamodel.getMClass(baseName);
    }

}
