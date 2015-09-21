/* 
 * Copyright 2013-2015 Modeliosoft
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

import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.WeakHashMap;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.factory.IModelFactory;
import org.modelio.vcore.session.api.ICoreSession;
import org.modelio.vcore.session.impl.CoreSession;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * {@link IModelFactory} factory.
 */
@objid ("6d72d916-5c99-400e-bafa-be356b2eb5ab")
public class ModelFactory {
    /**
     * Factory cache.
     */
    @objid ("d53a0d90-56ba-465e-90d8-537cd9489100")
    private static final Map<ICoreSession, SoftReference<IModelFactory>> factories = new WeakHashMap<>();

    /**
     * Create a model factory for a modeling session.
     * @param referent a referent object used to get the modeling session.
     * @return a model factory.
     */
    @objid ("512ea9f2-1d88-4cbd-bdd3-9655d14df9ce")
    public static IModelFactory getFactory(MObject referent) {
        return getFactory(CoreSession.getSession(referent));
    }

    /**
     * Create a model factory for a modeling session.
     * @param session a modeling session
     * @return a model factory.
     */
    @objid ("78b3e181-8be6-4414-987b-6793b53cafa0")
    public static IModelFactory getFactory(ICoreSession session) {
        SoftReference<IModelFactory> ref = factories.get(session);
        if (ref != null && ref.get() != null) {
            return ref.get();
        }
        
        ModelFactoryImpl ret = new ModelFactoryImpl(session);
        
        factories.put(session, new SoftReference<IModelFactory>(ret));
        return ret;
    }

}
