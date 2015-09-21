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


package org.modelio.vstore.exml.common.index.jdbm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import jdbm.Serializer;
import jdbm.SerializerInput;
import jdbm.SerializerOutput;
import org.modelio.vstore.exml.common.model.ObjId;

@objid ("b2b227c9-5c87-11e1-863f-001ec947ccaf")
class ObjIdIterableSerializer implements Serializer<Iterable<ObjId>> {
    @objid ("b7ea9477-4d2d-4432-bba4-64320a2a9ba6")
    private ObjIdCollectionSerializer collSerializer;

    @objid ("d59e23d1-6231-11e1-b31a-001ec947ccaf")
    @Override
    public void serialize(final SerializerOutput out, final Iterable<ObjId> idList) throws IOException {
        Collection<ObjId> coll;
        
        if (idList instanceof Collection<?>) {
            coll = (Collection<ObjId>) idList;
        } else {
            coll = new ArrayList<>();
            for( ObjId id : idList)
                coll.add(id);
        }
        
        this.collSerializer.serialize(out, coll);
    }

    @objid ("d59e23da-6231-11e1-b31a-001ec947ccaf")
    @Override
    public Iterable<ObjId> deserialize(final SerializerInput in) throws ClassNotFoundException, IOException {
        return this.collSerializer.deserialize(in);
    }

    @objid ("d59e23e4-6231-11e1-b31a-001ec947ccaf")
    ObjIdIterableSerializer(ObjIdCollectionSerializer collSerializer) {
        this.collSerializer = collSerializer;
    }

}
