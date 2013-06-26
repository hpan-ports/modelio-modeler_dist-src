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
/*   Metamodel version: 9015              */
/*   SemGen version   : 2.0.06.9012       */
package org.modelio.metamodel.data.analyst;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.analyst.AnalystElement;
import org.modelio.metamodel.impl.analyst.AnalystElementImpl;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAssociation;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAttribute;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaClass;

@objid ("c469b8a6-17c2-4568-b3ee-39110eb6291b")
@SmaMetaClass(mmClass=AnalystElement.class, factory=AnalystElementData.Metadata.ObjectFactory.class)
public abstract class AnalystElementData extends AnalystItemData {
    @objid ("acb62da3-fae3-46ad-9392-59c2b7a14d9d")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("35ee7ca1-df47-49be-a357-598ee4c4efd2")
    public static class Metadata {
        @objid ("36cdf845-4b01-4509-8b5d-9579de79c366")
        private static SmClass smClass = null;

        @objid ("175e8d57-7a87-4696-8358-0f253cfd779b")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AnalystElementData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("825be44a-17fc-4c75-ba74-e986ad6e4258")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("10a7b11d-a7cb-4dfa-be29-d2f8c7d0664f")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("d1090c6a-e4a6-4321-91dd-6d07a5b3d6cc")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("36a603f1-a721-4046-9ac4-81712f505cc7")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

    }

}
