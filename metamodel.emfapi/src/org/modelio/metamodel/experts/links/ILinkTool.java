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
                                    

package org.modelio.metamodel.experts.links;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Service methods to work with 'links', e.g. Generalizations, Dependencies...
 * <p>
 * Each link has a generic 'source' and 'target', that can represent several MDependencies. In most cases, the source is also the composition owner.
 * </p>
 */
@objid ("003b72ac-d2e6-1097-bcec-001ec947cd2a")
public interface ILinkTool {
    /**
     * Tells whether a link can have the given source, destination and owner.
     * @param link the link to check.
     * @param from The source of the link element.
     * @param to The target of the link element.
     * @param owner The optional owner of the link element. Used for link that have a specific owner.
     * @return true if the link can be created, else false.
     */
    @objid ("00050212-de02-1097-bcec-001ec947cd2a")
    boolean canLink(MClass link, MClass from, MClass to, MClass owner);

    /**
     * Tells whether a link can have the given source, destination and owner.
     * @param link the link to check.
     * @param from The source of the link element.
     * @param to The target of the link element.
     * @param owner The optional owner of the link element. Used for link that have a specific owner.
     * @return true if the link can be created, else false.
     */
    @objid ("00051ec8-de02-1097-bcec-001ec947cd2a")
    boolean canLink(MObject link, MObject from, MObject to, MObject owner);

    /**
     * Tells whether a link can have the given source.
     * @param link The link to test.
     * @param from The source of the link element.
     * @return true if the source is accepted, else false.
     */
    @objid ("00053610-de02-1097-bcec-001ec947cd2a")
    boolean canSource(MClass link, MClass from);

    /**
     * Tells whether a link can have the given source.
     * @param link The link to test.
     * @param from The source of the link element.
     * @return true if the source is accepted, else false.
     */
    @objid ("00054a1a-de02-1097-bcec-001ec947cd2a")
    boolean canSource(MObject link, MObject from);

    /**
     * Tells whether a link can have the given target.
     * @param from The target of the link element.
     * @param link The link to test.
     * @return true if the target is accepted, else false.
     */
    @objid ("00055c6c-de02-1097-bcec-001ec947cd2a")
    boolean canTarget(MClass link, MClass to);

    /**
     * Tells whether a link can have the given target.
     * @param from The target of the link element.
     * @param link The link to test.
     * @return true if the target is accepted, else false.
     */
    @objid ("00056f68-de02-1097-bcec-001ec947cd2a")
    boolean canTarget(MObject link, MObject to);

    /**
     * Tells whether or not this metaclass is considered as a link.
     * @param metaclass the metaclass to test.
     * @return true if this metaclass is a link.
     */
    @objid ("0005821e-de02-1097-bcec-001ec947cd2a")
    boolean isLink(MClass metaclass);

    /**
     * Register a stereotyped element creation expert.
     * @param ste The stereotype
     * @param expert The creation expert.
     */
    @objid ("c6d2a21a-8b09-4f64-84ee-4403211e26d8")
    void registerExpert(final Stereotype ste, final ILinkExpert expert);

    /**
     * Remove the creation expert registered for the given stereotype.
     * @param ste The stereotype to forget.
     */
    @objid ("3efe47f1-0eab-4a56-b164-6b47af540e65")
    void unregisterExpert(final Stereotype ste);

    /**
     * Tells whether a stereotyped link can have the given source, destination and owner.
     * @param stereotypedLink the stereotype put on the link to check.
     * @param link the link to check.
     * @param from The source of the link element.
     * @param to The target of the link element.
     * @param owner The optional owner of the link element. Used for link that have a specific owner.
     * @return true if the link can be created, else false.
     */
    @objid ("56759d2c-be89-473c-bb03-25ed17d74899")
    boolean canLink(Stereotype stereotypedLink, MClass link, MClass from, MClass to, MClass owner);

}
